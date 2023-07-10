import java.util.ArrayList;

class Pessoa {
    private String nome;
    private String cpf;
    private String email;
    private ArrayList<Telefone> telefones;
    private Endereco endereco;


     public void setNome(String nome) {
        this.nome = nome;
    }
     
    public String getNome() {
        return nome;
    }

     public void setCpf(String cpf) {
        this.cpf = cpf;
    }
   
    public String getCpf() {
        return cpf;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
  
    public void setEmail(String email) {
        this.email = email;
    }
   
    public String getEmail() {
        return email;
    }

   
    public void setTelefones(ArrayList<Telefone> telefones) {
        this.telefones = telefones;
    }

    public ArrayList<Telefone> getTelefones() {
        return telefones;
    }
    
    public void imprimir() {
        System.out.println("Nome: " + nome);
        System.out.println("CPF: " + cpf);
        System.out.println("Email: " + email);
        System.out.println("Telefones:");
        
        for (int i = 0; i < getTelefones().size(); i++) {
            getTelefones().get(i).imprimirTelefone();
        }
        System.out.println("Endereço:");
        getEndereco().imprimirEndereco();
    }
   
}
