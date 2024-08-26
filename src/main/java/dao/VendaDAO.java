/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Dominio.Venda;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.JoinType;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.HibernateException;
import org.hibernate.Session;

/**
 *
 * @author pedro
 */
public class VendaDAO extends GenericDAO{
    
    private List<Venda> pesquisar(int tipo, String pesq)  {
                
       List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery(Venda.class);
            
            Root tabela = consulta.from(Venda.class);
            
            // Alterar o fetch LAZY
            tabela.fetch("itensVenda", JoinType.INNER );
            consulta.distinct(true);
            
            Predicate restricoes = null;
            switch ( tipo ) {
                case 0: restricoes = builder.equal(tabela.get("idVenda"), pesq);
                        break;      
                case 1: restricoes = builder.like(tabela.get("cliente").get("nome"), pesq+"%");
                        break;      
                case 2: Expression mes = builder.function("month", Integer.class, tabela.get("dtCompra") );
                        Expression ano = builder.function("year", Integer.class, tabela.get("dtCompra") );
                        
                        String arr[] = pesq.split("/");                        
                        
                        restricoes = builder.and(  
                                builder.equal(mes, arr[0]),
                                builder.equal(ano, arr[1])
                        );
                        break;
            }

            consulta.where(restricoes);
            // EXECUTAR
            lista = sessao.createQuery(consulta).getResultList();

            sessao.getTransaction().commit();
            sessao.close();
        } catch (HibernateException ex) {
            if (sessao != null ) {
                sessao.getTransaction().rollback();          
                sessao.close();
            }
            throw new HibernateException(ex);
        }
        return lista;
                                        
    }
    
    
    public List<Venda> pesquisarPorID(String pesq) {
         return pesquisar(0,pesq);             
    }
    
    public List<Venda> pesquisarPorCliente(String pesq) {             
        return pesquisar(1,pesq);
    }
        
    public List<Venda> pesquisarPorMes(String pesq) {             
        return pesquisar(2,pesq);
    }
}
