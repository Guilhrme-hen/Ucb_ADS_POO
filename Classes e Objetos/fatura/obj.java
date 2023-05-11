/*Crie uma classe em Java chamada fatura para uma loja de suprimentos de informática. A classe deve conter quatro variáveis
– o número (String), a descrição (String), a quantidade comprada de um item (int) e o preço por item (double). A classe deve
ter um construtor e um método get e set para cada variável de instância. Além disso, forneça um método chamado getTotalFatura
que calcula o valor da fatura e depois retorna o valor como um double. Se o valor não for positivo, ele deve ser configurado como 0.
Se o preço por item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado FaturaTeste
(em outro arquivo) que demonstra as capacidades da classe Fatura.*/


package classes.e.objetos;

public class Fatura {
    public static void main(String[] args) {
        FaturaClass f1 = new FaturaClass("001", "Mouse óptico", 2, 25.0);
        FaturaClass f2 = new FaturaClass("002", "Teclado multimídia", -1, -20.0);

        System.out.println("Fatura 1:");
        System.out.println("Número: " + f1.getNumero());
        System.out.println("Descrição: " + f1.getDescricao());
        System.out.println("Quantidade: " + f1.getQuantidade());
        System.out.println("Preço: " + f1.getPreco());
        System.out.println("Total da fatura: " + f1.getTotalFatura());

        System.out.println();

        System.out.println("Fatura 2:");
        System.out.println("Número: " + f2.getNumero());
        System.out.println("Descrição: " + f2.getDescricao());
        System.out.println("Quantidade: " + f2.getQuantidade());
        System.out.println("Preço: " + f2.getPreco());
        System.out.println("Total da fatura: " + f2.getTotalFatura());
    }
}
