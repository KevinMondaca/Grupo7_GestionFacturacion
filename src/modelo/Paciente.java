package modelo;


public class Paciente extends Persona {

    private Obra_Social obraSocial;

    public Paciente(String n, String a, int d, int t, String e, Obra_Social ob) {
        super(n, a, d, t, e);
        this.obraSocial = ob;
    }

    public void MostrarPersona() {

    }
}