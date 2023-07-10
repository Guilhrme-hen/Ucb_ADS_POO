public class Endereco {
    
    private String cidade;
    private String rua;
    private String estado;
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getCidade() {
        return cidade;
    }
  
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public String getRua() {
        return rua;
    }
    
   public void setEstado(String estado) {
        this.estado = estado;
    }

    
    public String getEstado() {
        return estado;
    }
    
     public void imprimirEndereco() {
        System.out.println("Rua: " + rua);
        System.out.println("Cidade: " + cidade);
        System.out.println("Estado: " + estado);
    }
}
