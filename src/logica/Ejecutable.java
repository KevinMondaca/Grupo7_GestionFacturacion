package logica;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import modelo.Estudio;
import modelo.Factura;
import modelo.Imagen;
import modelo.Img_Tec;
import modelo.Laboratorio;
import modelo.Medico;
import modelo.Obra_Social;
import modelo.Paciente;
import modelo.Registro_Estudios;
import modelo.Tipo_Lab;

public class Ejecutable {
    static ArrayList<Obra_Social> listOS = new ArrayList();
    static Registro_Estudios reg = new Registro_Estudios();
    static ArrayList<Medico> listMed = new ArrayList();
    static Scanner tec = new Scanner(System.in);
    
    public static void main(String[] args) {
        menu();
    }
    
    public static void menu(){
        boolean b = true;
        while (b) { 
            int x;
            System.out.println("----------MENU----------");
            System.out.println("1 - Obras Sociales");
            System.out.println("2 - Registro de Estudios");
            System.out.println("0 - Cerrar");
            x = tec.nextInt();
            tec.nextLine();
            switch (x) {
                case 1: menuObras();
                break;
                case 2: ;
                break;
                case 0: b = false;
                break;
                default: b = true;
                break;
            }
            
        }
    }
    
    public static void menuObras(){
        boolean b = true;
        int c = 1;
        while (b) {
            int x;
            System.out.println("----------OBRAS SOCIALES----------");
            for(Obra_Social o: listOS){
                System.out.println(c + " - " + o.getNombre());
                c++;
            }
            System.out.println("0 - SALIR");
            x = tec.nextInt();
            tec.nextLine();
            if (x >= 1 && x <= listOS.size()) {
                System.out.println("    -|Obra Social|-");
                listOS.get(x-1).mostrarObraSocial();
            } else if (x == 0) {
                b = false;
            }
        }
    }
    
    public static void menuEstudios() {
        boolean b = true;
        while (b) {
            int x;
            System.out.println("----------REGISTRO DE ESTUDIOS----------");
            System.out.println("1 - Ver estudios");
            System.out.println("2 - Estudios por medico");
            System.out.println("3 - Medico que solicito mas Estudios");
            System.out.println("4 - Etudios entre fechas");
            System.out.println("0 - SALIR");
            x = tec.nextInt();
            tec.nextLine();
            switch (x) {
                case 1: ;
                break;
                case 2: estMed();
                break;
                case 3: reg.medicMasEstud().MostrarPersona();
                break;
                case 4: ;
                break;
                case 0: b = false ;
                break;
            }
        }
    }
    
    public static void estMed(){
        boolean b = true;
        int x;
        int c = 1;
        while (b) {
            System.out.println("Seleccione al medico:");
            for (Medico m: listMed) {
                System.out.println(c + " - " + m.getNombres() + " " + m.getApellidos() + " | " + m.getMatricula());
                c++;
            }
            System.out.println("0 - CANCELAR");
            x = tec.nextInt();
            tec.nextLine();
            if (x >= 1 && x <= listOS.size()) {
                for (Estudio e: reg.estMedico(listMed.get(x-1))) {
                    e.mostrarEstudio();
                }
            } else if (x == 0) {
                b = false;
            }
        }
    }
    
    public static void estFechas() {
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate f1;
        LocalDate f2;
        System.out.println(" Ingrese la primera fecha(AAAA-MM-DD):");
        f1.= LocalDate.parse(tec.nextLine());
    }
}
