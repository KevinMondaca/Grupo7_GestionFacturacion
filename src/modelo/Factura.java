package modelo;
import java.util.ArrayList;
public class Factura {
    
    private static int nroFactura = 1;
    private int idFactura;
    private ArrayList<Estudio> facEstudios = new ArrayList();
    private double total;
    private Obra_Social obraSocial;
    
    public Factura(){
    }
    public Factura(Obra_Social os){
        this.idFactura = nroFactura;
        this.obraSocial = os;
        nroFactura++;
    }
    
    public void agregarEstudio(Estudio e){
        this.facEstudios.add(e);
    }
    
    public void imprimirFact(){
        System.out.println("    -|Factura|-");
        System.out.println("- ID: " + this.idFactura);
        System.out.println("- Obra Social: " + this.obraSocial);
        System.out.println("- Estudios: ");
        for (Estudio x: this.facEstudios){
            System.out.println("    - " + x.getCodEstudio() + " $" + x.calcularCosto());
        }
        System.out.println("- Total: $" + this.total);
    }

    public static int getNroFactura() {
        return nroFactura;
    }

    public static void setNroFactura(int nroFactura) {
        Factura.nroFactura = nroFactura;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public ArrayList<Estudio> getFacEstudios() {
        return facEstudios;
    }

    public void setFacEstudios(ArrayList<Estudio> facEstudios) {
        this.facEstudios = facEstudios;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public Obra_Social getObraSocial() {
        return obraSocial;
    }

    public void setObraSocial(Obra_Social obraSocial) {
        this.obraSocial = obraSocial;
    }
}
