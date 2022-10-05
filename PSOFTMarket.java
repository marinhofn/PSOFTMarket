import java.util.Date;

public class PSOFTMarket {

    public static void main(String[] args) {
        
        Produto teste = Fachada.criarProduto("Maizena", "Sao Braz", 7.50, new Date());



        // Criando Produto
        Produto produto = new Produto("Maizena", "Sao Braz", 7.50, new Date());
        
        // Criando Lote
        Lote lote = new Lote(10, new Date(), new Produto("Arroz Branco", "Sao Braz", 2.50, new Date()));
        
        // Adicionar produto ao lote
        lote.adicionarProduto(produto);
        // Adicionar determinada quantidade de produtos ao lote
        lote.adicionarProdutos(produto, 15);

        
        System.out.println(lote.toString());

        
    }

}