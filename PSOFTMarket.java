import java.util.Date;

public class PSOFTMarket {

    public static void main(String[] args) {

        Fachada f = new Fachada();
        
        Produto produto1 = f.criarProduto("Maizena", "Sao Braz", 7.50, new Date());

        Produto produto2 = f.criarProduto("Cafe", "Sao Braz", 7.50, new Date());      

        f.criarLote(10, new Date(), produto1);

        f.criarLote(10, new Date(), produto2);

        System.out.println(" \nListando todos os lotes:");
        Fachada.listarLotes();
        System.out.println(" \nListando todos os produtos:");
        Fachada.listarProdutos();

    }

}