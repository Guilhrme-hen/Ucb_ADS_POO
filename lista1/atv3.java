/*Uma pesquisa sobre algumas características físicas da população de uma determinada região coletou
os seguintes dados, referentes a cada habitante:

a) sexo (m e f);
b) cor dos olhos (a (azuis), v (verdes), c (castanhos), p (pretos));
c) cor dos cabelos (l (loiros), c (castanhos), p (pretos), r (ruivos));
d) idade em anos.
e) valor do salário.

Para o cadastro, todos os campos deve ser validados, ou seja, para sexo, serão aceitos somente as opções ‘m’ e ‘f’; para cor de olhos,
apenas as opções ‘a’, ‘v’, ‘c’ e ‘p’; para cor dos cabelos, apenas as opções ‘l’, ‘c’, ‘p’ e ‘r’; para idade, apenas valores entre 10 e
100 anos, inclusive estes e para o salário, não aceitar valores negativos.

Para indicar fim dos habitantes pesquisados, o usuário fornecerá um habitante fictício com idade igual a –1.

Ao final, o algoritmo deve determinar a porcentagem de indivíduos do sexo feminino, com idade entre 18 e 35 anos e que tenham olhos
castanhos e cabelos castanhos */


package Atividade_Avaliativa01;
import java.util.Scanner;

public class Pesquisa {
 public static void main(String[] args){ 
    
    Scanner sc = new Scanner(System.in);

        int numFem = 0;
        int numFemCastCabeloCastOlhos = 0;

        System.out.println("Informe os dados dos habitantes: ");
        do {
            System.out.print("Idade entre 0 e 100 anos: ");
            int idade = sc.nextInt();
            if (idade == -1) {
                break;
            }
            // Entrada dos dados
            System.out.print("Sexo (m/f): ");
            char sexo = sc.next().charAt(0);
            if (sexo != 'm' && sexo != 'M' && sexo != 'F' && sexo != 'f') {
                continue; // Não faz nada e volta para o início do laço
            }

            System.out.print("Cor dos olhos (a/v/c/p): ");
            char corOlhos = sc.next().charAt(0);
            if (corOlhos != 'a' && corOlhos != 'A' && corOlhos != 'v' && corOlhos != 'V'
                    && corOlhos != 'c' && corOlhos != 'C' && corOlhos != 'p' && corOlhos != 'P') {
                continue;
            }

            System.out.print("Cor dos cabelos (l/c/p/r): ");
            char corCabelos = sc.next().charAt(0);
            if (corCabelos != 'l' && corCabelos != 'L' && corCabelos != 'c' && corCabelos != 'C'
                    && corCabelos != 'p' && corCabelos != 'P' && corCabelos != 'r' && corCabelos != 'R') {
                continue;
            }

            System.out.print("Salário (não negativo): ");
            double salario = sc.nextDouble();
            if (salario < 0) {
                continue;
            }

            // Contagem das características desejadas
            if (sexo == 'f' || sexo == 'F') {
                numFem++;
                if (corOlhos == 'c' || corOlhos == 'C') {
                    if (corCabelos == 'c' || corCabelos == 'C') {
                        if (idade >= 18 && idade <= 35) {
                            numFemCastCabeloCastOlhos++;
                        }
                    }
                }
            }

            // Fim da pesquisa
            if (idade == -1) {
                break;
            }
        } while (true);

        // Cálculo da porcentagem
        double porcentagem = (double) numFemCastCabeloCastOlhos / numFem * 100.0;

        // Saída do resultado
        System.out.printf("Porcentagem de mulheres com olhos e cabelos castanhos, entre 18 e 35 anos: %.2f%%", porcentagem);

        sc.close();
}
}
