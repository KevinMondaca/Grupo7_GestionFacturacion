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
        System.out.println("    -|Medico|-");
        System.out.println("- Matricula: " + this.getMatricula());
        System.out.println("- DNI: " + this.getDni());
        System.out.println("- Nombre completo: " + this.getNombres() + " " + this.getApellidos());
        System.out.println("- Contacto:");
        System.out.println("    - telefono:" + this.getTelefono());
        System.out.println("    - emial: " + this.getEmail());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
}
