
package empresa.teste;

public class EmpresaTeste {

    public static void main(String[] args) {
    
        Vendedor vendedor = new Vendedor();
        vendedor.setNome("Joao");
        vendedor.setSalario(1000);
        vendedor.setValorVenas(20000);
        vendedor.setQntVendas(25);
        
        System.out.println("VENDEDOR\n");
        
        System.out.println("Nome:" + vendedor.getNome());
        System.out.println("Salario:" + vendedor.getSalario());
        System.out.println("Valor das vendas:" + vendedor.getValorVenas());
        System.out.println("Quantidade de vendas:" + vendedor.getQntVendas());
        
        System.out.println("\n GERENTE\n");
        
        Gerente gerente = new Gerente();
        gerente.setNome("Jonas");
        gerente.setIdade(25);
        gerente.setMatricula("202030");
        gerente.setNomeGerencia("Vendas");
        gerente.setSalario(2500);
        
        System.out.println("Nome: " + gerente.getNome());
        System.out.println("Idade:" + gerente.getIdade());
        System.out.println("Matricula:" + gerente.getMatricula());
        System.out.println("Salario:" + gerente.getSalario());
        System.out.println("Valor Inss:" + gerente.valorInss());
        
        System.out.println("\n CLIENTE\n");
        
        Cliente cliente = new Cliente();
        cliente.setNome("Felipe");
        cliente.setIdade(30);
        cliente.setSexo("M");
        cliente.setValorDivida(30000);
        cliente.setAnoNascim(1993);
        
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Idade:" + cliente.getIdade());
        System.out.println("Sexo:" + cliente.getSexo());
        System.out.println("Divida:" + cliente.getValorDivida());
        System.out.println("Data de Nascimento:" + cliente.getAnoNascim());
        
    }
    
}
