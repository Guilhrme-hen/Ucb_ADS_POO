package revendaveiculos;

import java.util.Scanner;

public class Moto extends Veiculo {
    private int ano;

    public Moto(String modelo, double preco, int ano) {
        super(modelo, preco);
        this.ano = ano;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo da moto: ");
        setModelo(scanner.nextLine());
        System.out.println("Digite o preco da moto: ");
        setPreco(scanner.nextDouble());
        System.out.println("Digite o ano da moto: ");
        setAno(scanner.nextInt());
        scanner.close();
    }

    public double getPreco() {
        if (ano >= 2008) {
            return super.getPreco() * 1.1;
        } else {
            return super.getPreco();
        }
    }
}
