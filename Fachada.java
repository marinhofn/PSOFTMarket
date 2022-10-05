import java.util.Date;

public class Fachada {

    public void criarProduto(String nome, String fabricante, double preco, Date dataFabricacao) {

        Produto produto = new Produto(nome, fabricante, preco, dataFabricacao);   

    }

    public void listarProdutos() {

    }
    
}
