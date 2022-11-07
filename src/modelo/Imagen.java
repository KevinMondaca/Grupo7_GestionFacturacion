package modelo;

import java.time.LocalDate;

public class Imagen extends Estudio {

    private String tecnologia;
    private String zona;
    private boolean contraste;

    public Imagen(Paciente p, Medico m, LocalDate f, String t, String z, boolean c) {
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
        System.out.println("- Tegnologia: " + this.tecnologia);
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
        switch (this.tecnologia) {
            case "Fluoroscopia": c = c + 1;
            break;
            case "IRM": c = c + 2;
            break;
            case "Nuclear": c = c + 3;
            break;
            case "Gammacamara": c = c + 4;
            break;
            case "PET": c = c + 5;
            break;
            case "Radiografia": c = c + 6;
            break;
            case "Tomografia": c = c + 7;
            break;
        }
        if (this.contraste) {
            c = c + 1;
        }
        return c;
    }

    @Override
    public String generarCod() {
        String c = super.generarCod();
        c = c + "IMG-" + this.tecnologia.toUpperCase() + "-" + this.zona.toUpperCase();
        if (this.contraste) {
            c = c + "-C";
        }
        return c;
    }
}
