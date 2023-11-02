/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberoAcceesoDatos;

import BomberosEntidades.Brigada;
import BomberosEntidades.Especialidad;
import BomberosEntidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
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
        String sql = "INSERT INTO siniestro (tipo, fecha_siniestro, coord_x, coord_y, detalles, codBrigada) VALUES  (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;

        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, siniestro.getTipoSiniestro().toString());
            ps.setDate(2, Date.valueOf(siniestro.getFechaSiniestro()));
            ps.setInt(3, siniestro.getCoordenadaX());
            ps.setInt(4, siniestro.getCoordenadaY());
            ps.setString(5, siniestro.getDetalles());
            ps.setInt(6, siniestro.getCodigoBrigada());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                ResultSet generatedKeys = ps.getGeneratedKeys();
                if (generatedKeys.next()) {
                    siniestro.setCodigo(generatedKeys.getInt(1)); 
                    System.out.println("Siniestro agregado exitosamente con ID: " + siniestro.getCodigo());
                } else {
                    System.out.println("Error al obtener el ID del siniestro.");
                }
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

    public List<Siniestro> listarSiniestrosRecientes() {
        List<Siniestro> siniestrosRecientes = new ArrayList<>();
        LocalDate semana = LocalDate.now().minusDays(7);
        LocalDate hoy = LocalDate.now();
        String sql = "SELECT * FROM siniestro WHERE fecha_siniestro BETWEEN ? AND ?";
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setDate(1, Date.valueOf(semana));
            ps.setDate(2, Date.valueOf(hoy));
            rs = ps.executeQuery();
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                Especialidad tipoSiniestro = Especialidad.valueOf(rs.getString("tipo"));
                LocalDate fechaSiniestro = rs.getDate("fecha_siniestro").toLocalDate();
                int coordenadaX = rs.getInt("coord_x");
                int coordenadaY = rs.getInt("coord_y");
                String detalles = rs.getString("detalles");
                int codigoBrigada = rs.getInt("codBrigada");
                Siniestro siniestro = new Siniestro(codigo, tipoSiniestro, fechaSiniestro, coordenadaX, coordenadaY, detalles, codigoBrigada);
                siniestrosRecientes.add(siniestro);
            }
        } catch (SQLException ex) {
            System.out.println("Error al consultar siniestros recientes: " + ex.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {

            }
        }
        return siniestrosRecientes;
    }

    public boolean codigoSiniestroExiste(int codigo) {
        String sql = "SELECT 1 FROM siniestro WHERE codigo = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Error al verificar la existencia del código de siniestro: " + ex.getMessage());
            return false;
        }
    }
}
