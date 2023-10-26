/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberoAcceesoDatos;

import BomberosEntidades.Brigada;
import BomberosEntidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import sun.util.resources.LocaleData;

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
        String sql = "INSERT INTO siniestro (codigo, tipo, fecha_siniestro, coord_x, coord_y, detalles, codBrigada) VALUES  (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, siniestro.getCodigo()); // Asegúrate de que este atributo sea del tipo correcto en tu base de datos
            ps.setString(2, siniestro.getTipoSiniestro().toString());
            ps.setDate(3, Date.valueOf(siniestro.getFechaSiniestro()));
            ps.setInt(4, siniestro.getCoordenadaX());
            ps.setInt(5, siniestro.getCoordenadaY());
            ps.setString(6, siniestro.getDetalles());
            ps.setInt(7, siniestro.getCodigoBrigada());
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

    public void marcarComoResuelto(Siniestro siniestro) {
        String sql = "UPDATE siniestro SET fecha_resol = ?, puntuacion = ? WHERE codigo = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(siniestro.getFechaResolucion()));
            ps.setInt(2, siniestro.getCalificacion());
            ps.setInt(3, siniestro.getCodigo());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("Siniestro marcado como resuelto exitosamente.");
            } else {
                System.out.println("Error al marcar el siniestro como resuelto.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al acceder a la tabla siniestro: " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
            }
        }
    }

}
