
package Dominio;

import java.io.Serializable;
import javax.persistence.*;


@Entity
public class ItemVenda implements Serializable {
    
    @EmbeddedId
    private ItemVendaPK chComposta;
    
    private int quantidade;

    public ItemVenda() {
    }

    public ItemVenda(Venda venda, Produto produto, int quantidade) {
        this.chComposta = new ItemVendaPK(venda, produto);
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public ItemVendaPK getChComposta() {
        return chComposta;
    }

    public void setChComposta(ItemVendaPK chComposta) {
        this.chComposta = chComposta;
    }
    
    
}
