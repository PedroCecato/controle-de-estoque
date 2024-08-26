
package Dominio;

import java.io.Serializable;
import java.text.ParseException;
import java.util.Date;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;


@Entity
public class Cliente implements Serializable{
    
    @Id
    @GeneratedValue ( strategy = GenerationType.IDENTITY)
    private int idCliente;
    
    @Column ( name="nomeCliente", length = 250, nullable = false)
    private String nome;
    
    @Column ( unique = true, updatable = false, length = 14)
    private String cpf;
    
    @Column (length = 1)
    private char sexo;
    
    @Column (updatable = false)
    @Temporal ( TemporalType.DATE )
    private Date dtNascimento;
    
    @Column ( unique = true)
    private String celular;
    
    @Column ( unique = true)
    private String email;
    private String cidade;  
    
    @Column (length = 2)
    private String uf;
    
    @Temporal ( TemporalType.DATE )
    private Date dtInicio;
    
    @Temporal ( TemporalType.DATE )
    private Date dtFim;
    
    private int qtdeCafe;
    private int qtdePessoas;
    
    //RELACIONAMENTOS
    
    @OneToMany ( mappedBy = "cliente", fetch =  FetchType.LAZY)
    private List<Venda> vendas;

    public Cliente(){}
    
    public Cliente(String nome, String cpf, char sexo, Date dtNascimento, String celular, String email, String cidade, String uf, Date dtInicio, Date dtFim, int qtdeCafe, int qtdePessoas) {
        this.nome = nome;
        this.cpf = cpf;
        this.sexo = sexo;
        this.dtNascimento = dtNascimento;
        this.celular = celular;
        this.email = email;
        this.cidade = cidade;
        this.uf = uf;
        this.dtInicio = dtInicio;
        this.dtFim = dtFim;
        this.qtdeCafe = qtdeCafe;
        this.qtdePessoas = qtdePessoas;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public Date getDtNascimento() {
        return dtNascimento;
    }

    public void setDtNascimento(Date dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celuar) {
        this.celular = celuar;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public Date getDtInicio() {
        return dtInicio;
    }

    public void setDtInicio(Date dtInicio) {
        this.dtInicio = dtInicio;
    }

    public Date getDtFim() {
        return dtFim;
    }

    public void setDtFim(Date dtFim) {
        this.dtFim = dtFim;
    }

    public int getQtdeCafe() {
        return qtdeCafe;
    }

    public void setQtdeCafe(int qtdeCafe) {
        this.qtdeCafe = qtdeCafe;
    }

    public int getQtdePessoas() {
        return qtdePessoas;
    }

    public void setQtdePessoas(int qtdePessoas) {
        this.qtdePessoas = qtdePessoas;
    }

    public List<Venda> getVendas() {
        return vendas;
    }

    public void setVendas(List<Venda> vendas) {
        this.vendas = vendas;
    }
    
    @Override
    public String toString() {
        return nome;
    }

    public Object[] toArray() throws ParseException {
        return new Object[] { this, cpf, cidade, email};
    }
    
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Cliente other = (Cliente) obj;
        if (this.idCliente != other.idCliente) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
    
}
