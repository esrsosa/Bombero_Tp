/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberoAcceesoDatos;

import BomberosEntidades.Bombero;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel Sosa
 */
public class BomberoData {

    private Connection con = null;

    public BomberoData() {
        con = Conexion.getConexion();
    }

    
    public void actualizarDatos(Bombero bombero) {
        String sql = "UPDATE bombero SET dni = ?, nombre_ape = ?, celular = ?, fecha_nac = ? WHERE id_bombero = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, bombero.getDni());
            ps.setString(2, bombero.getNombre_ape());
            ps.setString(3, bombero.getCelular());
            ps.setDate(4, Date.valueOf(bombero.getFecha_nac()));
            ps.setInt(5, bombero.getId_bombero());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El bombero no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero " + ex.getMessage());
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

    public void darBajaPorInactividad() {
        // Implementación para dar de baja al bombero por inactividad
    }
}
