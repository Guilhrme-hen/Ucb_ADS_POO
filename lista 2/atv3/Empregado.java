
package exercicio3.pkg;


public class Empregado extends Pessoa{
    private int codSeletor;
    private double salarioBase;
    private double imposto;

    public int getCodSeletor() {
        return codSeletor;
    }

    public void setCodSeletor(int codSeletor) {
        this.codSeletor = codSeletor;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(double imposto) {
        this.imposto = imposto;
    }
    
    public double calcularSalario(){
        return salarioBase - salarioBase*imposto*0.01;
    }
}
