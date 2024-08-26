
package gerenTarefas;

import Dominio.Cliente;
import Dominio.ItemVenda;
import Dominio.Produto;
import Dominio.Venda;
import dao.ClienteDAO;
import dao.ConexaoHibernate;
import dao.GenericDAO;
import dao.ProdutoDAO;
import dao.VendaDAO;
import java.util.Date;
import java.util.List;
import javax.swing.JTable;
import org.hibernate.HibernateException;


public class GerenciadorDominio {

    private GenericDAO genDao;
    private ClienteDAO cliDao;
    private ProdutoDAO proDao;
    
    public GerenciadorDominio() throws HibernateException{
        
        ConexaoHibernate.getSessionFactory();
        
        genDao = new GenericDAO();
        cliDao = new ClienteDAO();
        proDao = new ProdutoDAO();
    }
    
    public List listar(Class classe) throws HibernateException {        
        return genDao.listar(classe);        
    }
     
    public void excluir (Object obj) throws HibernateException {
        genDao.excluir(obj);
    }
    
    public int inserirCliente(String nome, String cpf, char sexo, Date dtNasc, String celular, String email, String cidade, String uf, Date dtInicio, Date dtFim, int qtdeCafe, int qtdePessoas) throws HibernateException{
        Cliente cli =  new Cliente(nome, cpf, sexo, dtNasc, celular, email, cidade, uf, dtInicio, dtFim, qtdeCafe, qtdePessoas);
        cliDao.inserir(cli);
        
        return cli.getIdCliente();
    }
    
    public void alterarCliente(Cliente cli, String nome, String cpf, char sexo, Date dtNasc, String celular, String email, String cidade, String uf, Date dtInicio, Date dtFim, int qtdeCafe, int qtdePessoas) throws HibernateException{
        
        cli.setNome(nome);
        cli.setCpf(cpf);
        cli.setSexo(sexo);
        cli.setDtNascimento(dtNasc);
        cli.setCelular(celular);
        cli.setEmail(email);
        cli.setCidade(cidade);
        cli.setUf(uf);
        cli.setDtInicio(dtInicio);
        cli.setDtFim(dtFim);
        cli.setQtdeCafe(qtdeCafe);
        cli.setQtdePessoas(qtdePessoas);
        
        cliDao.alterar(cli); 
    }
    
    public List<Cliente> pesquisarClientePorNome (String pesq) throws HibernateException {
        List<Cliente> lista = null;
        lista = cliDao.pesquisarNome(pesq);
        
        return lista;
        
    }
    
    public List<Cliente> pesquisarClientePorCidade(String pesq) throws HibernateException {
        List<Cliente> lista = null;
        lista = cliDao.pesquisarCidade(pesq);
        
        return lista;
        
    }
    
    public List<Produto> pesquisarProdutoPorNome(String pesq) throws HibernateException {
        List<Produto> lista = null;
        lista = proDao.pesquisarNome(pesq);
        
        return lista;
    }
    
    public List<Produto> pesquisarProdutoPorMarca(String pesq) throws HibernateException {
        List<Produto> lista = null;
        lista = proDao.pesquisarMarca(pesq);
        
        return lista;
    }
    
    public int inserirProduto(String nome, String marca, String unidade, int qtdEstoque, float preco, String descricao) throws HibernateException{
        Produto pro =  new Produto(nome, marca, unidade, qtdEstoque, preco, descricao);
        proDao.inserir(pro);
        
        return pro.getIdProduto();
    }
    
    public List<Venda> pesquisarVenda(int tipo, String pesq) {
        VendaDAO venDao = new VendaDAO();
        
        List<Venda> lista = null;
        
        switch (tipo) {
            case 0: 
                // Verificar se o ID é inteiro
                int id = Integer.parseInt(pesq);
                lista = venDao.pesquisarPorID(pesq);
                break;
            case 1:
                lista = venDao.pesquisarPorCliente(pesq);
                break;                
            case 2:
                // Verificar se está no formato MM/YYYY
                String vetor[] = pesq.split("/");
                if ( vetor.length == 2 ) {
                    lista = venDao.pesquisarPorMes(pesq);
                } else {
                    throw new NumberFormatException("Usar o formato MÊS/ANO: MM/YYYY");
                }
                break;

        }
        
        return lista;
    }
    
    public void alterarProduto(Produto pro, String nome, String marca, String unidade, int qtdEstoque, float preco, String descricao) throws HibernateException{
        
        pro.setNome(nome);
        pro.setMarca(marca);
        pro.setUnidade(unidade);
        pro.setQtdEstoque(qtdEstoque);
        pro.setPreco(preco);
        pro.setDescricao(descricao);
 
        proDao.alterar(pro); 
    }
    
    public int inserirPedido(Cliente cli, JTable tabelaProdutos, Date dataVenc) {
        
        float valorTotal = 0;
        Venda venda = new Venda(cli, new Date(), valorTotal, dataVenc);
        List itens = venda.getItensVenda(); 
        
        int tam = tabelaProdutos.getRowCount();
        if ( tam > 0 ) {
            for(int lin=0; lin < tam; lin++) {
                
                int col = 0;
                Produto produto = (Produto) tabelaProdutos.getValueAt(lin, col++);
                int qtde = (int) tabelaProdutos.getValueAt(lin, col+3);
                float precoTotal = (float) tabelaProdutos.getValueAt(lin, col+4);
                
                ItemVenda item = new ItemVenda( venda, produto, qtde);
                
                itens.add(item);
                valorTotal = valorTotal + precoTotal;
                venda.setTotalVenda(valorTotal);
            } 
            
            
            genDao.inserir(venda);
            return venda.getIdVenda();
            
        } else {
           return -1;
        }

    }
 
    public void carregarPedidos(Cliente cli) {
        cliDao.carregarVendas(cli);
    }
}
