package modelo;

public enum Tipo_Lab {
    HEMOGRAMA("Hemograma", 1), GENETICO("Genetico", 2), BIOQUIMICO("Bioquimico", 3), MICROBIOLOGICO("Microbiologico", 4);
    private String nombre;
    private double costo;
    
    private Tipo_Lab(String n, double c){
        this.nombre = n;
        this.costo = c;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }
}
