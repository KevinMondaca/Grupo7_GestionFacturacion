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

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

}
