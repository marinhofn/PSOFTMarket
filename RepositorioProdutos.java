import java.util.ArrayList;

public class RepositorioProdutos {
    
    ArrayList<Produto> produtos = new ArrayList<Produto>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProduto(Produto produto) {
        produtos.remove(produto);
    }

    public void listarProdutos() {
        for (Produto produto : produtos) {
            System.out.println(produto.toString());
        }
    }
    

}
