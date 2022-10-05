import java.util.Date;

public class Fachada {
    
    public Produto criarProduto(String nome, String fabricante, double preco, Date dataFabricacao) {
        
        return ProdutoServices.criarProduto(nome, fabricante, preco, dataFabricacao);

    }

    public static void listarProdutos() { 
        ProdutoServices.listarProdutos();          
    }

    
    public void criarLote(int quantidade, Date dataValidade, Produto produto){
        LoteServices.criarLote(quantidade, dataValidade, produto);
    }

    public static void listarLotes(){ 
        LoteServices.listarLotes();          
    }
    
}
