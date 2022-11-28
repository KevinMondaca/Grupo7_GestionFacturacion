package modelo;

import java.time.LocalDate;

public class Imagen extends Estudio {

    private Img_Tec tecnologia;
    private String zona;
    private boolean contraste;

    public Imagen(){
    }
    public Imagen(Paciente p, Medico m, LocalDate f, Img_Tec t, String z, boolean c) {
        super(p, m, f);
        this.tecnologia = t;
        this.zona = z;
        this.contraste = c;
        setCodEstudio(generarCod());
    }

    @Override
    public void mostrarEstudio() {
        System.out.println("    -|Estudio-Imagen|-");
        System.out.println("- Cod-Est: " + this.getCodEstudio());
        super.mostrarEstudio();
        System.out.println("- Tegnologia: " + this.tecnologia.getNombre());
        System.out.println("- zona: " + this.zona);
        if (this.contraste) {
            System.out.println("- Contraste: Si");
        } else {
            System.out.println("- Contraste: No");
        }
    }

    @Override
    public double calcularCosto() {
        double c = 0;
        return c;
    }

    @Override
    public String generarCod() {
        String c = super.generarCod();
        c = c + "IMG-" + this.tecnologia.getNombre().toUpperCase() + "-" + this.zona.toUpperCase();
        if (this.contraste) {
            c = c + "-C";
        }
        return c;
    }

    public Img_Tec getTecnologia() {
        return tecnologia;
    }

    public void setTecnologia(Img_Tec tecnologia) {
        this.tecnologia = tecnologia;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public boolean isContraste() {
        return contraste;
    }

    public void setContraste(boolean contraste) {
        this.contraste = contraste;
    }
}
