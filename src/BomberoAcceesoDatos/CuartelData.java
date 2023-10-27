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
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

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

    public boolean codCuartelExiste(int codCuartel) {
        String sql = "SELECT 1 FROM cuartel WHERE codCuartel = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, codCuartel);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Error al verificar la existencia del código de cuartel: " + ex.getMessage());
            return false;
        }
    }

}
