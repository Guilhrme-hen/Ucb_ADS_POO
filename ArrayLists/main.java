import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("nome da pessoa: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o CPF: ");
        String cpf = scanner.nextLine();

        System.out.print("Digite o email: ");
        String email = scanner.nextLine();

        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setCpf(cpf);
        pessoa.setEmail(email);

        
        System.out.print("Digite o lougrador: ");
        String rua = scanner.nextLine();

        System.out.print("Digite a cidade: ");
        String cidade = scanner.nextLine();

        System.out.print("Digite o estado: ");
        String estado = scanner.nextLine();

        Endereco endereco = new Endereco();
        endereco.setRua(rua);
        endereco.setCidade(cidade);
        endereco.setEstado(estado);
        pessoa.setEndereco(endereco);

        ArrayList<Telefone> telefones = new ArrayList<>();

        System.out.print("Digite quantos telefones deseja informar: ");
        int quantidadeTelefones = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < quantidadeTelefones; i++) {
            System.out.println("Telefone " + (i + 1));
            System.out.print("informe se e celular ou fixo entre outros: ");
            String tipo = scanner.nextLine();

            System.out.print("Digite o DDD: ");
            String ddd = scanner.nextLine();

            System.out.print("Digite o número sem o DDD: ");
            String numero = scanner.nextLine();

            Telefone telefone = new Telefone();
            telefone.setTipo(tipo);
            telefone.setDdd(ddd);
            telefone.setNumero(numero);
            telefones.add(telefone);
        }

        pessoa.setTelefones(telefones);

        System.out.print("Digite o nome do curso: ");
        String nomeCurso = scanner.nextLine();

        Curso curso = new Curso();
        curso.setNome(nomeCurso);

        // Capturar notas do Aluno
        ArrayList<Double> notas = new ArrayList<>();

        System.out.print("Digite quantas notas deseja informar: ");
        int quantidadeNotas = scanner.nextInt();
        scanner.nextLine(); // Limpar o buffer

        for (int i = 0; i < quantidadeNotas; i++) {
            System.out.print("Digite a nota " + (i + 1) + ": ");
            double nota = scanner.nextDouble();
            notas.add(nota);
        }

        Aluno aluno = new Aluno();
        aluno.setCurso(curso);
        aluno.setNotas(notas);
        aluno.setNome(nome);

        // Capturar informações do Professor
        scanner.nextLine(); // Limpar o buffer

        System.out.print("Digite a titulação do professor: ");
        String titulacao = scanner.nextLine();

        System.out.print("Digite o salário do professor: ");
        double salario = scanner.nextDouble();

        Professor professor = new Professor();
        professor.setTitulacao(titulacao);
        professor.setSalario(salario);
        professor.setNome(nome);

        pessoa.imprimir();
        System.out.println("-----");
        aluno.imprimir();
        System.out.println("-----");
        professor.imprimir();
    }
    
}
