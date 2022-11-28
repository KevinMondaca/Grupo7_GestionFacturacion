package logica;

import java.util.ArrayList;
import java.util.Scanner;
import java.time.LocalDate;
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
                
            }
            
        }
    }
}
