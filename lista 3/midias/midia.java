package cadastromidias;

public class Midia {
     private int codigo;
    private double preco;
    private String nome;

    public Midia() {
    }

    public Midia(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
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

    public String getTipo() {
        return "Midia";
    }

    public String getDetalhes() {
        return "Codigo: " + codigo + ", Nome: " + nome + " Preço: " + preco + ",;
    }

    public void printDados() {
        System.out.println("Tipo: " + getTipo());
        System.out.println("Detalhes: " + getDetalhes());
    }

    public void inserirDados(int codigo, double preco, String nome) {
        this.codigo = codigo;
        this.preco = preco;
        this.nome = nome;
    }
}
