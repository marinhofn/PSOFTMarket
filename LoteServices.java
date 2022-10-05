import java.util.Date;

public class LoteServices {
    private static RepositorioLotes repositorioLotes = new RepositorioLotes();

    public static Lote criarLote(int quantidade, Date dataValidade, Produto produto) {

        Lote lote = new Lote(quantidade, dataValidade, produto);

        repositorioLotes.adicionarLote(lote);

        return lote;

    }
    public static void listarLotes() { 

        repositorioLotes.listarLotes();          
    
    }
}
