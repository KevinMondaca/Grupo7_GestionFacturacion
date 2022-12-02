package modelo;
import java.util.ArrayList;
public class Obra_Social {
    private String nombre;
    private ArrayList<Factura> listFacturas = new ArrayList();
    
    public Obra_Social(){
    }
    public Obra_Social(String n){
        this.nombre = n;
    }
    
    public void agregarFactura(Factura f){
        this.listFacturas.add(f);
    }
    
    public void mostrarObraSocial(){
        System.out.println("- Nombre: " + this.nombre);
        System.out.println("- Facturas: ");
        for (Factura f: this.listFacturas) {
            System.out.println("    - ID: " + f.getIdFactura() + " | $" + f.getTotal());
        }
        System.out.println("- TOTAL FACTURADO: $" + totalFacturado());
    }
    
    public double totalFacturado(){
        double t = 0;
        for (Factura x: this.listFacturas) {
            t = t + x.getTotal();
        }
        return t;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Factura> getListFacturas() {
        return listFacturas;
    }

    public void setListFacturas(ArrayList<Factura> listFacturas) {
        this.listFacturas = listFacturas;
    }
}
