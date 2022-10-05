import java.util.ArrayList;

public class RepositorioLotes {

    ArrayList<Lote> lotes = new ArrayList<Lote>();

    public void adicionarLote(Lote lote) {
        lotes.add(lote);
    }

    public void removerLote(Lote lote) {
        lotes.remove(lote);
    }

    public void listarLotes() {
        for (Lote lote : lotes) {
            System.out.println(lote.toString());
        }
    }

    public void listarLotes(Produto produto) {
        for (Lote lote : lotes) {
            if (lote.getProduto().getNome().equals(produto.getNome())) {
                System.out.println(lote.toString());
            }
        }
    }
}
