import java.util.Date;

public class Fachada {

    private static RepositorioLotes repositorioLotes = new RepositorioLotes();

    private static RepositorioProdutos repositorioProdutos = new RepositorioProdutos();

    public static Produto criarProduto(String nome, String fabricante, double preco, Date dataFabricacao) {

        Produto produto = new Produto(nome, fabricante, preco, dataFabricacao);  
        
        repositorioProdutos.adicionarProduto(produto);

        return produto;

    }    

    public static Lote criarLote(int quantidade, Date dataValidade, Produto produto) {

        Lote lote = new Lote(quantidade, dataValidade, produto);

        repositorioLotes.adicionarLote(lote);

        return lote;

    }

    public static void listarLotes() { 

        repositorioLotes.listarLotes();          
    
    }

    public static void listarProdutos() {
            
        repositorioProdutos.listarProdutos();

    }
    
}
