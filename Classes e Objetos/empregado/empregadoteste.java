/*Crie uma classe em Java chamada Empregado que inclui três partes de informações como variáveis de instância
– nome (String), sobrenome (String) e um salário mensal (double). A classe deve ter um construtor, métodos get e set para cada variável
de instância. Escreva um aplicativo de teste chamado EmpregadoTeste que cria dois objetos Empregado e exibe o salário anual de cada objeto.
Então dê a cada Empregado um aumento de 10% e exiba novamente o salário anual de cada Empregado.*/

package classes;

public class EmpregadoTeste {
    public static void main(String[] args) {
        Empregado empregado1 = new Empregado("João", "Silva", 5000);
        Empregado empregado2 = new Empregado("Maria", "Souza", 7000);

        System.out.printf("O salário anual de %s %s é R$%.2f%n", empregado1.getNome(), empregado1.getSobrenome(), empregado1.getSalarioAnual());
        System.out.printf("O salário anual de %s %s é R$%.2f%n", empregado2.getNome(), empregado2.getSobrenome(), empregado2.getSalarioAnual());

        empregado1.darAumento(10);
        empregado2.darAumento(10);

        System.out.printf("O salário anual de %s %s após o aumento de 10%% é R$%.2f%n", empregado1.getNome(), empregado1.getSobrenome(), empregado1.getSalarioAnual());
        System.out.printf("O salário anual de %s %s após o aumento de 10%% é R$%.2f%n", empregado2.getNome(), empregado2.getSobrenome(), empregado2.getSalarioAnual());
    }
}


