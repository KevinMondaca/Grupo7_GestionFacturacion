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
