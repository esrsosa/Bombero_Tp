/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberoAcceesoDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel Sosa
 */
public class Conexion {

    private static final String DATABASE_URL = "jdbc:mariadb://";
    private static final String DATABASE_HOST = "localhost";
    private static final String DATABASE_PUERTO = ":3306";
    private static final String DATABASE_DB = "/bomberos";
    private static final String DATABASE_USUARIO = "root";
    private static final String DATABASE_PASSWORD = "";
    private static Conexion conexion = null;
    private static Connection con=null;
    private Conexion() {
        try {
            //Cargar drivers
            Class.forName("org.mariadb.jdbc.Driver");

        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Clase Conexion: Error al cargar Driver" + ex);
        }
    }

    public static Connection getConexion() {
 //       Connection con = null;

        if (con == null) {
            conexion = new Conexion();

            try {

                con = DriverManager.getConnection(
                        DATABASE_URL
                        + DATABASE_HOST
                        + DATABASE_PUERTO
                        + DATABASE_DB
                        + "?useLegacyDatetimeCode=false&serverTimezone=UTC"
                        + "&user="
                        + DATABASE_USUARIO
                        + "&password="
                        + DATABASE_PASSWORD
                       
                );
                System.out.println("conectado");          
            
            } catch (SQLException ex) {
               System.out.println(ex.getMessage());
            }
        }
        return con;
    }
}
