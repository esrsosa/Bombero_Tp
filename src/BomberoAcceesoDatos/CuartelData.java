/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberoAcceesoDatos;

import BomberosEntidades.Bombero;
import BomberosEntidades.Brigada;
import BomberosEntidades.Cuartel;
import BomberosEntidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Emanuel Sosa
 */
public class CuartelData {

    private Connection con = null;

    public CuartelData() {
        con = Conexion.getConexion();
    }

    public void agregarCuartel(Cuartel cuartel) {
        String sql = "INSERT INTO cuartel (codCuartel, nombre_cuartel, direccion, coord_x, coord_y, telefono, correo) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, cuartel.getCodCuartel());
            ps.setString(2, cuartel.getNombre());
            ps.setString(3, cuartel.getDomicilio());
            ps.setInt(4, cuartel.getCoordenadax());
            ps.setInt(5, cuartel.getCoordenaday());
            ps.setString(6, cuartel.getTelefono());
            ps.setString(7, cuartel.getCorreoElectronico());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("cuartel agregado exitosamente.");
            } else {
                System.out.println("Error al agregar el cuartel.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al acceder a la tabla cuartel: " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
            }
        }
    }
    
   public void asignarBrigada(Siniestro s, Brigada brigada) {
        if (s != null && brigada != null) {
            String sql = "UPDATE siniestro SET codBrigada = ? WHERE codigo = ?";
            try (PreparedStatement ps = con.prepareStatement(sql)) {
                ps.setInt(1, brigada.getCodBrigada()); 
                ps.setInt(2, s.getCodigo()); 
                int exito = ps.executeUpdate();
                if (exito > 0) {
                    System.out.println("Brigada asignada al incidente en este cuartel.");
                } else {
                    System.out.println("No se pudo asignar la brigada al incidente.");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("Incidente o brigada no válidos.");
        }
    }
}
