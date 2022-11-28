package modelo;

import java.time.LocalDate;

public class Laboratorio extends Estudio {

    private Tipo_Lab tipo;
    private int nroMuestra;

    public Laboratorio(Paciente p, Medico m, LocalDate f, Tipo_Lab t, int nM) {
        super(p, m, f);
        this.tipo = t;
        this.nroMuestra = nM;
        setCodEstudio(generarCod());
    }

    @Override
    public String generarCod() {
        String c = super.generarCod();
        c = c + "LAB-" + this.tipo.getNombre().substring(0, 4).toUpperCase() + "-M" + this.nroMuestra;
        return c;
    }
    
    @Override
    public void mostrarEstudio() {
        System.out.println("    -|Estudio-Laboratorio|-");
        System.out.println("- Cod-Est: " + this.getCodEstudio());
        super.mostrarEstudio();
        System.out.println("- Tipo: " + this.tipo.getNombre());
        System.out.println("- Muestras N°" + this.nroMuestra);
    }
    
    @Override
    public double calcularCosto() {
        double c = 0;
        return c;
    }

    public Tipo_Lab getTipo() {
        return tipo;
    }

    public void setTipo(Tipo_Lab tipo) {
        this.tipo = tipo;
    }

    public int getNroMuestra() {
        return nroMuestra;
    }

    public void setNroMuestra(int nroMuestra) {
        this.nroMuestra = nroMuestra;
    }

}
