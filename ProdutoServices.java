import java.util.Date;

public class ProdutoServices {

    private static RepositorioProdutos repositorioProdutos = new RepositorioProdutos();

    public static Produto criarProduto(String nome, String fabricante, double preco, Date dataFabricacao) {

        Produto produto = new Produto(nome, fabricante, preco, dataFabricacao);  
        
        repositorioProdutos.adicionarProduto(produto);

        return produto;

    }

    
    public static void listarProdutos() {
            
        repositorioProdutos.listarProdutos();

    }   

} 
