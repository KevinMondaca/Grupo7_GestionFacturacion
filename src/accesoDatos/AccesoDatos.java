package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Paciente;
import modelo.Medico;
import modelo.Obra_Social;

public class AccesoDatos {
    private Connection conn;
    private Statement comandos;
    
    public AccesoDatos(){
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/Sanatorio_Privado", "root", "");
            comandos = conn.createStatement();
        } catch (ClassNotFoundException ex) {
            System.out.println("Error: No se encontro la BD");
        } catch (SQLException ex) {
            System.out.println("Error: Usuario o pass incorrecto");
        }
    }
    
    public Paciente darPaciente(int dni){
        Paciente p1 = new Paciente();
        String sql = "select * from Paciente where dni = " + dni;
        try {
            ResultSet registro = comandos.executeQuery(sql);
            String n = registro.getString("nombres");
            String a = registro.getString("apellidos");
            String e = registro.getString("email");
            int t = registro.getInt("telefono");
            Obra_Social os = new Obra_Social(registro.getString("nombre_obraSocial"));
            p1.setNombres(n);
            p1.setApellidos(a);
            p1.setEmail(e);
            p1.setDni(dni);
            p1.setTelefono(t);
            p1.setObraSocial(os);
        } catch(SQLException ex) {
            System.out.println("Error: " + ex.toString());
        }
        return p1;
    }
}
