
package Dominio;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.*;

@Embeddable
public class ItemVendaPK implements Serializable {
    
    @ManyToOne ( fetch = FetchType.EAGER )
    @JoinColumn ( name="idVenda" )
    private Venda venda;
    
    @ManyToOne ( fetch = FetchType.EAGER )
    @JoinColumn ( name="idProduto" )
    private Produto produto;
    
    public ItemVendaPK() {
    }

    public ItemVendaPK(Venda venda, Produto produto) {
        this.venda = venda;
        this.produto = produto;
    }

    public Venda getVenda() {
        return venda;
    }

    public void setVenda(Venda venda) {
        this.venda = venda;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }
 
    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.produto);
        hash = 59 * hash + Objects.hashCode(this.venda);
        return hash;
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
        final ItemVendaPK other = (ItemVendaPK) obj;
        if (!Objects.equals(this.produto, other.produto)) {
            return false;
        }
        if (!Objects.equals(this.venda, other.venda)) {
            return false;
        }
        return true;
    }
}
