package modelo;

public enum Img_Tec {
    RESONANCIA("Resonancia", 1), TOMOGRAFIA("Tomografia", 2), RADIOGRAFIA("Radiografia", 3);
    private String nombre;
    private double costo;
    
    private Img_Tec(String n, double c){
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
