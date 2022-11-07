package modelo;

import java.time.LocalDate;

public class Laboratorio extends Estudio {

    private String diagnostica;
    private String tipo;
    private int nroMuestra;

    public Laboratorio(Paciente p, Medico m, LocalDate f, String d, String t, int nM) {
        super(p, m, f);
        this.diagnostica = d;
        this.tipo = t;
        this.nroMuestra = nM;
        setCodEstudio(generarCod());
    }

    @Override
    public String generarCod() {
        String c = super.generarCod();
        c = c + "LAB-" + this.diagnostica.substring(0, 4).toUpperCase() + "-M" + this.nroMuestra;
        return c;
    }
    
    @Override
    public void mostrarEstudio() {
        System.out.println("    -|Estudio-Laboratorio|-");
        System.out.println("- Cod-Est: " + this.getCodEstudio());
        super.mostrarEstudio();
        System.out.println("- Diagnóstica: " + this.diagnostica);
        System.out.println("- tipo: " + this.tipo);
        System.out.println("- Muestra N°" + this.nroMuestra);
    }
    
    @Override
    public double calcularCosto() {
        double c = 0;
        if (this.diagnostica.equals("Glucosa")) {
            c = c + 1;
        } else if (this.diagnostica.equals("Sida")) {
            c = c + 2;
        }
        return c;
    }

    public String getDiagnostico() {
        return diagnostica;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostica = diagnostico;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNroMuestra() {
        return nroMuestra;
    }

    public void setNroMuestra(int nroMuestra) {
        this.nroMuestra = nroMuestra;
    }

}
