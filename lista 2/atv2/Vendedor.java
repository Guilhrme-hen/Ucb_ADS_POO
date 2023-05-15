package empresa.teste;

public class Vendedor extends Empregado {
    
    private double valorVenas;
    private int qntVendas;

    public double getValorVenas() {
        return valorVenas;
    }

    public void setValorVenas(double valorVenas) {
        this.valorVenas = valorVenas;
    }

    public int getQntVendas() {
        return qntVendas;
    }

    public void setQntVendas(int qntVendas) {
        this.qntVendas = qntVendas;
    }
}
