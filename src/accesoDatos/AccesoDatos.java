package accesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;

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
}
