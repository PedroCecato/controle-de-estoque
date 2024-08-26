
package dao;

import Dominio.Cliente;
import Dominio.Venda;
import java.util.List;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Expression;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;


public class ClienteDAO extends GenericDAO{
 
    public void carregarVendas(Cliente cli) {
        Session sessao = null;
        
        try {
                               
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Verifica se a lista JÁ FOI CARREGADA
            if ( !Hibernate.isInitialized( cli.getVendas()) ) {
                
                // Carrega o PROXY para outro objeto
                Cliente cliTemp = sessao.get(Cliente.class, cli.getIdCliente());

                // Carrega a lista de PEDIDOS
                List<Venda> lista = cliTemp.getVendas();
                lista.size();

                // Atualiza a lista no OBJETO principal (parâmetro)
                cli.setVendas(lista);
            }
            
            
            sessao.getTransaction().commit();              
            sessao.close();
        } catch( HibernateException erro) {
            if ( sessao != null ){
                sessao.getTransaction().rollback();
                sessao.close();
            }
            throw new HibernateException(erro);
        }
        
    }
    
    public List<Cliente> pesquisarNome(String pesq) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Cliente.class );
            
            // FROM
            Root tabela = consulta.from(Cliente.class);
            
            // RESTRIÇÕES
            Predicate restricoes = null;
            
            restricoes = builder.like(tabela.get("nome"), pesq + "%" ); 
                        
            consulta.where(restricoes);
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
    
    public List<Cliente> pesquisarCidade(String pesq) throws HibernateException {
        List lista = null;
        Session sessao = null;
        try {
            sessao = ConexaoHibernate.getSessionFactory().openSession();
            sessao.beginTransaction();

            // Construtor da CONSULTA
            CriteriaBuilder builder = sessao.getCriteriaBuilder();
            CriteriaQuery consulta = builder.createQuery( Cliente.class );
            
            // FROM
            Root tabela = consulta.from(Cliente.class);
            
            // RESTRIÇÕES
            Predicate restricoes = null;
            
            restricoes = builder.like(tabela.get("cidade"), "%" + pesq + "%"); 
                        
            consulta.where(restricoes);
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
}
