import java.util.ArrayList;
public class Aluno extends Pessoa {
    private Curso curso;
    private ArrayList<Double> notas;
  
    public Aluno(){
        super();
    }

  public Curso getCurso() {
        return curso;
    }
 
  public void setCurso(Curso curso) {
        this.curso = curso;
    }

  public ArrayList<Double> getNotas() {
        return notas;
    }
  
    public void setNotas(ArrayList<Double> notas) {
        this.notas = notas;
    }
     
    public double calcularMedia() {
        double soma = 0;
        for (Double nota : notas) {
            soma += nota;
        }
        return soma / notas.size();
    }
    
     public void imprimir() {
         System.out.println("---- Dados do Aluno ----")
        super.imprimir();
        System.out.println("Curso: " + curso.getNome());
        System.out.println("Notas:");
        
        for (int i = 0; i < getNotas().size(); i++) {
            System.out.println(getNotas().get(i));
        }
        
         System.out.println("Média: " + calcularMedia());
    }
    
}
