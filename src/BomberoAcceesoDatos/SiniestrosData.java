/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberoAcceesoDatos;

import BomberosEntidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Emanuel Sosa
 */
public class SiniestrosData {

    private Connection con = null;

    public SiniestrosData() {
        con = Conexion.getConexion();
    }

    public void agregarSiniestro(Siniestro siniestro) {
        String sql = "INSERT INTO siniestro (codigo, tipo, fecha_siniestro, coord_x, coord_y, detalles, fecha_resol, puntuacion, codBrigada) VALUES  (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, siniestro.getCodigo()); // Asegúrate de que este atributo sea del tipo correcto en tu base de datos
            ps.setString(2, siniestro.getTipoSiniestro().toString());
            ps.setDate(3, Date.valueOf(siniestro.getFechaSiniestro()));
            ps.setInt(4, siniestro.getCoordenadaX());
            ps.setInt(5, siniestro.getCoordenadaY());
            ps.setString(6, siniestro.getDetalles());
            ps.setDate(7, Date.valueOf(siniestro.getFechaResolucion()));
            ps.setInt(8, siniestro.getCalificacion());
            ps.setInt(9, siniestro.getCodigoBrigada());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("Siniestro agregado exitosamente.");
            } else {
                System.out.println("Error al agregar el siniestro.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al acceder a la tabla siniestro: " + ex.getMessage());
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

