/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberoAcceesoDatos;

import BomberosEntidades.Bombero;
import BomberosEntidades.Brigada;
import BomberosEntidades.Cuartel;
import BomberosEntidades.Especialidad;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel Sosa
 */
public class BrigadaData {

    private Connection con = null;

    public BrigadaData() {
        con = Conexion.getConexion();
    }

    public void agregarBrigada(Brigada brigada) {
        String sql = "INSERT INTO brigada (codBrigada, nombre_br, especialidad) VALUES (?, ?, ?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, brigada.getCodBrigada());
            ps.setString(2, brigada.getNombreBrigada());
            ps.setString(3, brigada.getEspecialidad().toString());
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
            }
        }
    }
    
    public void asignarBrigadaAcuartel(int codBrigada, int codCuartel) {
        String sql = "UPDATE brigada SET nro_cuartel = ? WHERE codBrigada = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setInt(1, codCuartel);
            ps.setInt(2, codBrigada);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("brigada asignada.");
            } else {
                System.out.println("brigada no existe o no pudo ser asignada.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al acceder a la tabla brigada: " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
            }
        }
    }

    public List<Brigada> listarBrigadasLibres() {
        List<Brigada> brigadas = new ArrayList<>();
        String sql = "SELECT * FROM brigada";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                int codBrigada = rs.getInt("codBrigada");
                boolean estaAsignada = !estaAsignada(codBrigada);
                if (estaAsignada) {
////                    Brigada brigada = new Brigada(codBrigadars.getString("nombre_br"), Especialidad.valueOf(rs.getString("especialidad")));
//                    brigadas.add(brigada);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Error al listar brigadas: " + ex.getMessage());
        }
        return brigadas;
    }

    public boolean estaAsignada(int codBrigada) {
        String sql = "SELECT * FROM siniestro WHERE codBrigada = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Error al verificar asignaciones: " + ex.getMessage());
            return false;
        }
    }

    public boolean codBrigadaExiste(int codBrigada) {
        String sql = "SELECT 1 FROM brigada WHERE codBrigada = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, codBrigada);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Error al verificar la existencia del código de brigada: " + ex.getMessage());
            return false;
        }
    }

}
