import java.util.ArrayList;


public class Professor extends Pessoa {
    private String titulacao;
    private double salario;
    private ArrayList<Curso> cursos;
    super();


    public void setTitulacao(String titulacao) {
        this.titulacao = titulacao;
    }
    
    public String getTitulacao() {
        return titulacao;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setCursos(ArrayList<Curso> cursos) {
        this.cursos = cursos;
    }
   
    public ArrayList<Curso> getCursos() {
        return cursos;
    }
    
    public void imprimir() {
        super.imprimir();
        system.out.println("------ Dados do Professor ------");
        System.out.println("Titulação: " + titulacao);
        System.out.println("Salário: " + salario);
        
        for (int i = 0; i < getCursos().size(); i++) {
            getCursos().get(i).imprimirCurso();
        }
    }
}
