/*Crie uma classe em Java chamada fatura para uma loja de suprimentos de informática. A classe deve conter quatro variáveis
– o número (String), a descrição (String), a quantidade comprada de um item (int) e o preço por item (double). A classe deve
ter um construtor e um método get e set para cada variável de instância. Além disso, forneça um método chamado getTotalFatura
que calcula o valor da fatura e depois retorna o valor como um double. Se o valor não for positivo, ele deve ser configurado como 0.
Se o preço por item não for positivo, ele deve ser configurado como 0.0. Escreva um aplicativo de teste chamado FaturaTeste
(em outro arquivo) que demonstra as capacidades da classe Fatura.*/

package classes.e.objetos;

import java.util.Scanner;

public class FaturaClass {
    private String numero;
    private String descricao;
    private int quantidade;
    private double preco;

    public FaturaClass(String numero, String descricao, int quantidade, double preco) {
        this.numero = numero;
        this.descricao = descricao;
        setQuantidade(quantidade);
        setPreco(preco);
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade >= 0) {
            this.quantidade = quantidade;
        } else {
            this.quantidade = 0;
        }
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        if (preco >= 0.0) {
            this.preco = preco;
        } else {
            this.preco = 0.0;
        }
    }

    public double getTotalFatura() {
        double total = quantidade * preco;
        if (total < 0.0) {
            total = 0.0;
        }
        return total;
    }
}
