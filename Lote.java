import java.util.Date;

public class Lote {

    private int quantidade;
    private Date dataValidade;
    private Produto produto;

    public Lote(int quantidade, Date dataValidade, Produto produto) {
        this.quantidade = quantidade;
        this.dataValidade = dataValidade;
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public Date getDataValidade() {
        return dataValidade;
    }

    public void setDataValidade(Date dataValidade) {
        this.dataValidade = dataValidade;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    public String toString() {
        return produto.getNome() + ", $ " + String.format("%.2f", produto.getPreco()) + ", " + quantidade + " unidades, Total: $ " + String.format("%.2f", produto.getPreco() * quantidade);
    }

	public void adicionarProduto(Produto produto) {
        if (this.produto.getNome().equals(produto.getNome())) {
            this.quantidade++;
        }
        
	}

    public void adicionarProdutos(Produto produto, int quantidade) {
        if (this.produto.getNome().equals(produto.getNome())) {
            this.quantidade += quantidade;
        }
        
	}
    

    
}
