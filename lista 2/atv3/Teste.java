package exercicio3.pkg;

public class Teste {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();
        Empregado empregado = new Empregado();
        Administrador administrador = new Administrador();
        Operario operario = new Operario();
        Vendedor vendedor = new Vendedor();

        fornecedor.setNome("Josivaldo");
        fornecedor.setEndereco("Rua de lugar nenhum");
        fornecedor.setTelefone("61 996655402");
        fornecedor.setValorCredito(600);
        fornecedor.setValorDivida(400);

        System.out.println("Fornecedor \n");
        System.out.println("Nome: " + fornecedor.getNome());
        System.out.println("Endereço: " + fornecedor.getEndereco());
        System.out.println("Telefone: " + fornecedor.getTelefone());
        System.out.println("Crédito: R$" + fornecedor.getValorCredito());
        System.out.println("Dívida: R$" + fornecedor.getValorDivida());
        System.out.println("Saldo: R$" + fornecedor.obterSaldo());
        
        empregado.setNome("Osmarildo");
        empregado.setEndereco("Rua das garças");
        empregado.setTelefone("61 954545402");
        empregado.setSalarioBase(5000);
        empregado.setImposto(15);
        
        System.out.println("\nEmpregado \n");
        System.out.println("Nome: " + empregado.getNome());
        System.out.println("Endereço: " + empregado.getEndereco());
        System.out.println("Telefone: " + empregado.getTelefone());
        System.out.println("Salário Base: R$ " + empregado.getSalarioBase());
        System.out.println("Imposto: " + empregado.getImposto()+"%");
        System.out.println("Salário Final: R$" + empregado.calcularSalario());
        
        administrador.setNome("José");
        administrador.setEndereco("Rua dos ipês");
        administrador.setTelefone("61 954545402");
        administrador.setSalarioBase(5000);
        administrador.setImposto(15);
        administrador.setAjudaDeCusto(2600);
        
        System.out.println("\nadministrador \n");
        System.out.println("Nome: " + administrador.getNome());
        System.out.println("Endereço: " + administrador.getEndereco());
        System.out.println("Telefone: " + administrador.getTelefone());
        System.out.println("Salário Base: R$ " + administrador.getSalarioBase());
        System.out.println("Imposto: " + administrador.getImposto()+"%");
        System.out.println("Salário Final: R$" + (administrador.calcularSalario()+administrador.getAjudaDeCusto()));
        
        operario.setNome("Osmar");
        operario.setEndereco("Rua dos muquiranas");
        operario.setTelefone("61 984752402");
        operario.setSalarioBase(2000);
        operario.setImposto(15);
        operario.setValorProduto(500);
        operario.setComissao(5);
        
        System.out.println("\noperario \n");
        System.out.println("Nome: " + operario.getNome());
        System.out.println("Endereço: " + operario.getEndereco());
        System.out.println("Telefone: " + operario.getTelefone());
        System.out.println("Salário Base: R$ " + operario.getSalarioBase());
        System.out.println("Imposto: " + operario.getImposto()+"%");
        System.out.println("Salário Final: R$" + (operario.calcularSalario()+(operario.getValorProduto()*operario.getComissao()*0.01)));
        
        vendedor.setNome("Roberto");
        vendedor.setEndereco("Rua dos garimpos");
        vendedor.setTelefone("61 99547824");
        vendedor.setSalarioBase(2000);
        vendedor.setImposto(15);
        vendedor.setValorVendas(500);
        vendedor.setComissao(6);
        
        System.out.println("\nvendedor \n");
        System.out.println("Nome: " + vendedor.getNome());
        System.out.println("Endereço: " + vendedor.getEndereco());
        System.out.println("Telefone: " + vendedor.getTelefone());
        System.out.println("Salário Base: R$ " + vendedor.getSalarioBase());
        System.out.println("Imposto: " + vendedor.getImposto()+"%");
        System.out.println("Salário Final: R$" + (vendedor.calcularSalario()+(vendedor.getValorVendas()*vendedor.getComissao()*0.01)));
    }

}
