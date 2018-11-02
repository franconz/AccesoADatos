package accesoadatos.AccesoADatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class Conexion {
    private String url="jdbc:mysql://localhost/prueba";
    private String usuario="root";
    private String password="";
    private Connection con = null;
    
    public Conexion() {
        try {
            // cargamos driver en memoria
            Class.forName("org.mariadb.jdbc.Driver");
            
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    public Connection getConnection(){
        
        try { 
            // creamos la coneccion
            if(con==null)
            con= DriverManager.getConnection(url +
                    "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                            + "&user=" + usuario + "&password=" + password);
            
        } catch (SQLException ex){
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE,null, ex);
        }
            return con;
        } 

    Connection getConexion() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }
