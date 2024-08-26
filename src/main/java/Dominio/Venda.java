
package Dominio;

import gerenTarefas.FuncoesUteis;
import java.io.Serializable;
import java.text.NumberFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.*;


@Entity
public class Venda implements Serializable {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idVenda;
    
    @Temporal ( TemporalType.DATE )
    private Date dtCompra;
    
    @Temporal ( TemporalType.DATE )
    private Date dtVencimento;
    
    private float totalVenda;
    
    //RELACIONAMENTOS
    
    @ManyToOne ( fetch = FetchType.EAGER)
    @JoinColumn (name = "idCliente")
    private Cliente cliente;
    
    
    @OneToMany ( mappedBy = "chComposta.venda",
                fetch =  FetchType.LAZY,
                cascade = CascadeType.ALL)
    private List<ItemVenda> itensVenda;   
    
    public Venda(){}
    
    public Venda(Cliente cliente, Date dtCompra, float totalVenda, Date dtVencimento) {
        this.cliente = cliente;
        this.dtCompra = dtCompra;
        this.totalVenda = totalVenda;
        this.itensVenda = new ArrayList();
        this.dtVencimento = dtVencimento;
    }
    
    public Venda(int idVenda, Cliente cliente, Date dtCompra, float totalVenda, Date dtVencimento) {
        this.idVenda = idVenda;
        this.cliente = cliente;
        this.dtCompra = dtCompra;
        this.totalVenda = totalVenda;
        this.itensVenda = new ArrayList();
        this.dtVencimento = dtVencimento;
    }
    

    public List<ItemVenda> getItensVenda() {
        return itensVenda;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public void setIdVenda(int idVenda) {
        this.idVenda = idVenda;
    }

    public Date getDtCompra() {
        return dtCompra;
    }

    public void setDtCompra(Date dtCompra) {
        this.dtCompra = dtCompra;
    }

    public Date getDtVencimento() {
        return dtVencimento;
    }

    public void setDtVencimento(Date dtVencimento) {
        this.dtVencimento = dtVencimento;
    }

    public float getTotalVenda() {
        return totalVenda;
    }

    public void setTotalVenda(float totalVenda) {
        this.totalVenda = totalVenda;
    }
    
    @Override
    public String toString() {
        return String.valueOf(idVenda);
    }
    
     public Object[] toArray() throws ParseException {   
        
        // FORMATAR MOEDA
        NumberFormat formNum = NumberFormat.getCurrencyInstance();
        
        /*
        // FORMATAR CASAS DECIMAIS 
        DecimalFormat formNum = new DecimalFormat();
        formNum.setMaximumFractionDigits(2);
        formNum.setMinimumFractionDigits(2);
        */
        
        return new Object[] {this, cliente,FuncoesUteis.dateToStr(  getDtCompra() ), 
                             formNum.format(totalVenda)};        
    }   
}
