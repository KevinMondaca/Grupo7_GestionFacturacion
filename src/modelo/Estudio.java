package modelo;

import java.time.LocalDate;

public class Estudio {

    private String codEstudio;
    private Paciente paciente;
    private Medico medico;
    private LocalDate fecha;
    private boolean facturado;

    public Estudio(Paciente p, Medico m, LocalDate f) {
        this.paciente = p;
        this.medico = m;
        this.fecha = f;
        this.facturado = false;
        this.codEstudio = generarCod();
    }

    public String generarCod() {
        String dni = "" + this.paciente.getDni();
        String mat = "" + this.medico.getMatricula();
        String c = this.paciente.getNombres().substring(0, 1) + this.paciente.getApellidos().substring(0, 1);
        c = c + dni.substring(5) + "-";
        c = c + this.medico.getNombres().substring(0, 1) + this.medico.getApellidos().substring(0, 1);
        c = c + mat.substring(8) + "-";
        c = c + this.fecha.getDayOfMonth() + this.fecha.getMonthValue() + this.fecha.getYear() + "-";
        return c;
    }
    
    public void mostrarEstudio(){
        System.out.println("- Paciente: "+ this.paciente.getNombres() + " " + this.paciente.getApellidos());
        System.out.println("    - dni: " + this.paciente.getDni());
        System.out.println("- Medico: " + this.medico.getNombres() + " " + this.medico.getApellidos());
        System.out.println("    - matricula: " + this.medico.getMatricula());
        System.out.println("- Fecha: " + this.fecha);
    }
    
    public double calcularCosto(){
        return 5000;
    }

    public String getCodEstudio() {
        return codEstudio;
    }

    public void setCodEstudio(String codEstudio) {
        this.codEstudio = codEstudio;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public boolean isFacturado() {
        return facturado;
    }

    public void setFacturado(boolean facturado) {
        this.facturado = facturado;
    }

}
