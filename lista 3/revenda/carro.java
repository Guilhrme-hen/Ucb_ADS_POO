package revendaveiculos;

import java.util.Scanner;

public class Carro extends Veiculo {
    private double km;

    public Carro(String modelo, double preco, double km) {
        super(modelo, preco);
        this.km = km;
    }

    public double getKm() {
        return km;
    }

    public void setKm(double km) {
        this.km = km;
    }

    public void insertData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o modelo do carro: ");
        setModelo(scanner.nextLine());
        System.out.println("Digite o preco do carro: ");
        setPreco(scanner.nextDouble());
        System.out.println("Digite a quilometragem do carro: ");
        setKm(scanner.nextDouble());
        scanner.close();
    }

    public double getPreco() {
        if (km > 100000) {
            return super.getPreco() * 0.92;
        } else {
            return super.getPreco();
        }
    }
}
