package modelo;

public abstract class Persona {

    private String nombres;
    private String apellidos;
    private String email;
    private int dni;
    private int telefono;

    public Persona(String n, String a, int d, int t, String e) {
        this.nombres = n;
        this.apellidos = a;
        this.email = e;
        this.dni = d;
        this.telefono = t;
    }

    public abstract void MostrarPersona();

}
