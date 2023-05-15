package Teste;

public class Teste {

    public static void main(String[] args) {
        
        Peixe peixe = new Peixe();
        
        peixe.setNome("nemo");
        peixe.setPeso(10);
        peixe.setTipoHabitate("agua salgada");
        
        System.out.println("Nome:" + peixe.getNome());
        System.out.println("Peso:" + peixe.getPeso());
        System.out.println("Tipo de Habitate:" + peixe.getTipoHabitate());
    }
    
}
