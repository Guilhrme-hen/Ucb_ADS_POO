/*Uma revendedora de carros usados paga a seus funcionários vendedores um salário fixo por mês, mais uma
comissão também fixa para cada carro vendido e mais 5% do valor das vendas por ele efetuadas. Escrever 
um algoritmo que leia o número de carros por ele vendidos, o valor total de suas vendas,
o salário fixo e o valor que ele recebe por carro vendido. Calcule e escreva o salário final do vendedor.*/

package Atividade_Avaliativa01;
import java.util.Scanner;

public class Loja_carros {

    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);/*objeto que armazena o metodo scanner*/
       
        System.out.println("carros vendidos: ");
        int carros = scanner.nextInt();
        
        System.out.println("valor das vendas: ");
        double vendas = scanner.nextDouble();
       
        System.out.println("salario fixo: ");
        double salarioFixo = scanner.nextDouble();
        
        System.out.println("valor por carro vendido: ");
        double valorCarro = scanner.nextDouble();
        
        scanner.close();
        
        double total = salarioFixo + (carros*valorCarro) + (vendas*0.05);
        System.out.println("Salario Final: "+total);
        

    }
    
}
