package modelo;

public class Medico extends Persona {

    private int matricula;
    
    public Medico(){
    }
    public Medico(String n, String a, int d, int t, String e, int mat) {
        super(n, a, d, t, e);
        this.matricula = mat;
    }

    public void MostrarPersona() {

    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
