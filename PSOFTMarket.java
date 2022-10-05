import java.util.Date;

public class PSOFTMarket {

    public static void main(String[] args) {
        
        Produto teste1 = Fachada.criarProduto("Maizena", "Sao Braz", 7.50, new Date());

        Produto teste2 = Fachada.criarProduto("Cafe", "Sao Braz", 7.50, new Date());
        


        Lote loteTeste1 = Fachada.criarLote(10, new Date(), teste1);

        Lote loteTeste2 = Fachada.criarLote(10, new Date(), teste2);

        System.out.println("Listando todos os lotes:");
        Fachada.listarLotes();
        System.out.println("Listando todos os produtos:");
        Fachada.listarProdutos();

        





        // // Criando Produto
        // Produto produto = new Produto("Maizena", "Sao Braz", 7.50, new Date());
        
        // // Criando Lote
        // Lote lote = new Lote(10, new Date(), new Produto("Arroz Branco", "Sao Braz", 2.50, new Date()));
        
        // // Adicionar produto ao lote
        // lote.adicionarProduto(produto);
        // // Adicionar determinada quantidade de produtos ao lote
        // lote.adicionarProdutos(produto, 15);

        
        // System.out.println(lote.toString());

        
    }

}