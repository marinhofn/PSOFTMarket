import java.util.Date;

public class Produto {
    
    private String nome;
    private String fabricante;
    private double preco;    
    private Date dataFabricacao;
    
    
    public Produto(String nome, String fabricante, double preco, Date dataFabricacao) {
        this.nome = nome;
        this.preco = preco;        
        this.dataFabricacao = dataFabricacao;
        this.fabricante = fabricante;
    }
    
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String novoFabricante) {
        this.fabricante = novoFabricante;
    }

    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public double getPreco() {
        return preco;
    }
    
    public void setPreco(double preco) {
        this.preco = preco;
    }
    
 
    public void setDataFabricacao(Date dataFabricacao) {
        this.dataFabricacao = dataFabricacao;
    }

    public Date getDataFabricacao() {
        return dataFabricacao;
    }
    
    public String toString() {
        return nome + ", $ " + String.format("%.2f", preco) + ", " + " Fabricante: " + fabricante + ", Data de Fabricacao: " + dataFabricacao;
    }
    

}
