/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package accesoadatos.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author programador
 */
public class Conexion {
     private String url="jdbc:mysql://localhost/prueba";
     private String usuario="root";
     private String password="";
     private Connection con = null;
    
    public Conexion() {
        
        try {
            //Cargamos drivers en memoria
            Class.forName("org.mariadb.jdbc.Driver");
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }
    
    public Connection getConexion() {
         try {
             if (con == null) {
             //Creamos la conexion
             con = DriverManager.getConnection(url + "?useLegacyDatetimeCode=false&serverTimezone=UTC"+
                     "&user="+ usuario + "&password=" + password);}
             
         } catch (SQLException ex) {
             Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
         }
         
        return con;
    }
}
