package modelo;


public class Paciente extends Persona {

    private Obra_Social obraSocial;

    public Paciente(){
    }
    public Paciente(String n, String a, int d, int t, String e, Obra_Social ob) {
        super(n, a, d, t, e);
        this.obraSocial = ob;
    }

    public void MostrarPersona() {
        System.out.println("    -|Paciente|-");
        System.out.println("- DNI: " + this.getDni());
        System.out.println("- Nombre completo: " + this.getNombres() + " " + this.getApellidos());
        System.out.println("- Obra Social: " + this.obraSocial.getNombre());
        System.out.println("- Contacto:");
        System.out.println("    - telefono:" + this.getTelefono());
        System.out.println("    - emial: " + this.getEmail());
    }

    public Obra_Social getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(Obra_Social obraSocial) {
        this.obraSocial = obraSocial;
    }
    
}