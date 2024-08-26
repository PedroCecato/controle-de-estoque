
package Dominio;

import java.io.Serializable;
import java.text.ParseException;
import java.util.List;
import java.util.Objects;
import javax.persistence.*;


@Entity
public class Produto implements Serializable {
    
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY)
    private int idProduto;
    
    @Column ( name="nomeProduto", length = 250, nullable = false)
    private String nome;
    
    private String marca;
    private String unidade;
    private int qtdEstoque;
    private float preco;
    private String descricao;
    
    @OneToMany ( mappedBy = "chComposta.produto", fetch =  FetchType.LAZY)
    private List<ItemVenda> itensVenda;

    public Produto() {
    }
    
    public Produto(String nome, String marca, String unidade, float preco) {
        this.nome = nome;
        this.marca = marca;
        this.unidade = unidade;
        this.preco = preco;
    }
    
    public Produto(String nome, String marca, String unidade, int qtdEstoque, float preco, String descricao) {
        this.nome = nome;
        this.marca = marca;
        this.unidade = unidade;
        this.qtdEstoque = qtdEstoque;
        this.preco = preco;
        this.descricao = descricao;
    }

    public int getQtdEstoque() {
        return qtdEstoque;
    }

    public void setQtdEstoque(int qtdEstoque) {
        this.qtdEstoque = qtdEstoque;
    }
    
    public int getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(int idProduto) {
        this.idProduto = idProduto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
    
    @Override
    public String toString() {
        return nome;
    }
    
    public Object[] toArray() throws ParseException {
        return new Object[] {this, idProduto, marca, unidade, preco};
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
        final Produto other = (Produto) obj;
        if (this.idProduto != other.idProduto) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return true;
    }
    
}
