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
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel Sosa
 */
public class CuartelData {

    private Connection con = null;

    public CuartelData() {
        con = Conexion.getConexion();
    }

    public Cuartel buscarCuartel(int i){
        String sql = "SELECT  nombre_cuartel, direccion, telefono, correo FROM cuartel WHERE codCuartel= ?";
        Cuartel cuartel = null;
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                cuartel = new Cuartel();
                cuartel.setNombre(rs.getString("nombre_cuartel"));
                cuartel.setDomicilio(rs.getString("direccion"));
                cuartel.setTelefono(rs.getString("telefono"));
                cuartel.setCorreoElectronico(rs.getString("correo"));
                
            }else {
                JOptionPane.showMessageDialog(null, "No existe el alumno");
                ps.close();
            }
        }catch(SQLException ex){
            return cuartel;
        }
        return cuartel;
    }
    public void agregarCuartel(Cuartel cuartel) {
        String sql = "INSERT INTO cuartel (nombre_cuartel, direccion, coord_x, coord_y, telefono, correo) VALUES (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);

            ps.setString(1, cuartel.getNombre());
            ps.setString(2, cuartel.getDomicilio());
            ps.setInt(3, cuartel.getCoordenadax());
            ps.setInt(4, cuartel.getCoordenaday());
            ps.setString(5, cuartel.getTelefono());
            ps.setString(6, cuartel.getCorreoElectronico());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "cuartel agregado exitosamente.");
            } else {

                JOptionPane.showMessageDialog(null, "Error al agregar el cuartel.");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla cuartel:" + ex.getMessage());
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
