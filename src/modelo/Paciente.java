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

    }

    public Obra_Social getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(Obra_Social obraSocial) {
        this.obraSocial = obraSocial;
    }
    
}