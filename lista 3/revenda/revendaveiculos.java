
package revendaveiculos;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class RevendaVeiculos {

    public static void main(String[] args) {
        List<Veiculo> veiculos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o tipo de veiculo (carro/moto): ");
        String tipoVeiculo = scanner.nextLine();

        if (tipoVeiculo.equalsIgnoreCase("carro")) {
            Carro carro = new Carro("", 0, 0);
            carro.insertData();
            veiculos.add(carro);
        } else if (tipoVeiculo.equalsIgnoreCase("moto")) {
            Moto moto = new Moto("", 0, 0);
            moto.insertData();
            veiculos.add(moto);
        } else {
            System.out.println("Tipo invalido.");
        }

        System.out.println("Relatorio dos veiculos cadastrados:");
        for (Veiculo veiculo : veiculos) {
            veiculo.printDados();
        }

        double totalPreco = 0;

        for (Veiculo veiculo : veiculos) {
            totalPreco += veiculo.getPreco();
        }

        System.out.println("Total de precos antes do ajuste: " + totalPreco);

        for (Veiculo veiculo : veiculos) {
            if (veiculo instanceof Moto) {
                Moto moto = (Moto) veiculo;
                if (moto.getAno() >= 2008) {
                    moto.setPreco(moto.getPreco() * 1.1);
                }
            } else if (veiculo instanceof Carro) {
                Carro carro = (Carro) veiculo;
                if (carro.getKm() > 100000) {
                    carro.setPreco(carro.getPreco() * 0.92);
                }
            }
        }

        double totalPrecoAjustado = 0;

        for (Veiculo veiculo : veiculos) {
            totalPrecoAjustado += veiculo.getPreco();
        }

        System.out.println("Total de precos apos o ajuste: " + totalPrecoAjustado);

        scanner.close();
    }
    
}
