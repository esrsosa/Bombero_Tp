/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberoAcceesoDatos;

import BomberosEntidades.Brigada;
import BomberosEntidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Emanuel Sosa
 */
public class BrigadaData {
       private Connection con = null;

    public BrigadaData() {
        con = Conexion.getConexion();
    }

     public void agregarCuartel(Brigada brigada) {
        String sql = "INSERT INTO brigada (codBrigada, nombre_br, especialidad, libre, nro_cuartel) VALUES (?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, brigada.getCodBrigada());
            ps.setString(2, brigada.getNombreBrigada());
            ps.setString(3, brigada.getEspecialidad().toString());
            ps.setBoolean(4, brigada.isLibre());
            ps.setInt(5, brigada.getNro_cuartel());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("brigada agregado exitosamente.");
            } else {
                System.out.println("Error al agregar el brigada.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al acceder a la tabla brigada: " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
                // Manejar excepciones de cierre de recursos (opcional)
            }
        }
    }
}


