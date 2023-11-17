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

    private CuartelData cd = new CuartelData();
    private Connection con = null;

    public BrigadaData() {
        con = Conexion.getConexion();
    }

    public void agregarBrigada(Brigada brigada) {
        String sql = "INSERT INTO brigada (nombre_br, especialidad,codCuartel,libre) VALUES (?, ?, ?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, brigada.getNombreBrigada());
            ps.setString(2, brigada.getEspecialidad().toString());
            int nCuartel=brigada.getNro_cuartel().getCodCuartel();
            ps.setInt(3, nCuartel);
            ps.setBoolean(4, true);
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
        String sql = "UPDATE brigada SET codCuartel = ? WHERE codBrigada = ? ";
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
        String sql = "SELECT * FROM brigada WHERE libre = 1";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                    Brigada brigada = new Brigada();
                    brigada.setEspecialidad(Especialidad.valueOf(rs.getString("especialidad")));
                    brigada.setNombreBrigada(rs.getString("nombre_br"));
                    brigada.setCodBrigada(rs.getInt("codBrigada"));
                    brigadas.add(brigada);
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
    
    public Brigada buscarBrigadaPorId(int i) {
        Brigada brigada = null;
        Cuartel cuartel = null;
        String sql = "SELECT * FROM brigada WHERE codBrigada = ?";
        try  {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, i);
            ResultSet rs = ps.executeQuery();
            if(rs.next()){
            brigada = new Brigada();
            cuartel = new Cuartel();
            brigada.setCodBrigada(rs.getInt("codBrigada"));
            brigada.setEspecialidad(Especialidad.valueOf(rs.getString("especialidad")));
            brigada.setNombreBrigada(rs.getString("nombre_br"));
            int entero = rs.getInt("codCuartel");
            cuartel = cd.buscarCuartel(entero);//busco cuartel con CuartelData
            brigada.setNro_cuartel(cuartel);
            }
        } catch (SQLException ex) {
            System.out.println("Error al verificar asignaciones: " + ex.getMessage());
           return brigada; 
        }
        return brigada; 
    }
    
}
