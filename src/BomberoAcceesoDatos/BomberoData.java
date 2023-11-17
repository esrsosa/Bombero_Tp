/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberoAcceesoDatos;

import BomberosEntidades.Bombero;
import BomberosEntidades.Brigada;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Emanuel Sosa
 */
public class BomberoData {

    BrigadaData bd = new BrigadaData();
    private Connection con = null;

    public BomberoData() {
        con = Conexion.getConexion();
    }

    public Bombero buscarBombero(int dni) {
        String sql = "SELECT dni, nombre, apellido, celular, fecha_nac, grupSanguineo, codBrigada FROM bombero WHERE dni = ? AND estado = 1";
        Bombero bombero = null;
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, dni);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                bombero = new Bombero();
                bombero.setDni(rs.getString("dni"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setCelular(rs.getString("celular"));
                bombero.setFecha_nac(rs.getDate("fecha_nac").toLocalDate());
                bombero.setGrupSanguineo(rs.getString("grupSanguineo"));
                int codBrigada = rs.getInt("codBrigada");
                Brigada brigada = new Brigada();
                brigada.setCodBrigada(codBrigada);
                bombero.setBrigada(brigada);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero");
            return bombero;
        }
        return bombero;
    }

    public void actualizarDatos(Bombero bombero) {
        String sql = "UPDATE bombero SET nombre = ?, apellido = ?, grupSanguineo = ?, fecha_nac = ?, celular = ?, codBrigada = ? WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, bombero.getNombre());
            ps.setString(2, bombero.getApellido());
            ps.setString(3, bombero.getGrupSanguineo());
            ps.setDate(4, Date.valueOf(bombero.getFecha_nac()));
            ps.setString(5, bombero.getCelular());
            int codigoBrigada = bombero.getBrigada().getCodBrigada();
            ps.setObject(6, codigoBrigada);
            ps.setString(7, bombero.getDni());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Modificado Exitosamente.");
            } else {
                JOptionPane.showMessageDialog(null, "El bombero no existe");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero: " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
            }
        }
    }
    public List<Bombero> listaBomberos() {
        ArrayList<Bombero> bomberos = new ArrayList<>();
        String sql = "SELECT dni, nombre, apellido, grupSanguineo, fecha_nac, celular, codBrigada, estado FROM bombero";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Bombero bombero = new Bombero();
                bombero.setDni(rs.getString("dni"));
                bombero.setNombre(rs.getString("nombre"));
                bombero.setApellido(rs.getString("apellido"));
                bombero.setGrupSanguineo(rs.getString("grupSanguineo"));
                LocalDate fechaNac = rs.getDate("fecha_nac").toLocalDate();
                bombero.setFecha_nac(fechaNac);
                bombero.setCelular(rs.getString("celular"));
                bombero.setEstado(rs.getBoolean("estado"));
                int numBrigada = rs.getInt("codBrigada");
                Brigada codBrigada = bd.buscarBrigadaPorId(numBrigada);
//                Brigada codBrigada =(Brigada) rs.getObject("codBrigada"); //No estoy seguro si funciona
                bombero.setBrigada(codBrigada);
                if (bombero.isEstado()) {
                    bomberos.add(bombero);
                }
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla bombero " + ex.getMessage());
            System.out.println(ex.getMessage());
        }
        return bomberos;
    }

    public void agregarBombero(Bombero bombero) { //probado por arian :)
        String sql = "INSERT INTO bombero ( dni, nombre, apellido, celular, fecha_nac, grupSanguineo, codBrigada, estado) VALUES ( ?, ?, ?, ?, ?, ?,?,?)";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, bombero.getDni());
            ps.setString(2, bombero.getNombre());
            ps.setString(3, bombero.getApellido());
            ps.setString(4, bombero.getGrupSanguineo());
            ps.setDate(5, Date.valueOf(bombero.getFecha_nac()));
            ps.setString(6, bombero.getCelular());
            int codigoBrigada = bombero.getBrigada().getCodBrigada();
            ps.setInt(7, codigoBrigada);
            ps.setBoolean(8, bombero.isEstado());
            int exito = ps.executeUpdate();
            if (exito == 1) {
                System.out.println("Bombero agregado exitosamente.");
                JOptionPane.showMessageDialog(null, "Bombero agregado exitosamente.");
            } else {
                System.out.println("Error al agregar el bombero.");
                JOptionPane.showMessageDialog(null, "Error al agregar el bombero.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al acceder a la tabla Bombero: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero: ");
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
            }
        }
    }

    public void darBajaPorInactividad(String dni) {
        String sql = "UPDATE bombero SET estado = false WHERE dni = ?";
        PreparedStatement ps = null;
        try {
            ps = con.prepareStatement(sql);
            ps.setString(1, dni);
            int exito = ps.executeUpdate();
            if (exito == 1) {
                JOptionPane.showMessageDialog(null, "Baja por inactividad realizada con éxito.");
            } else {
                JOptionPane.showMessageDialog(null, "El bombero no existe o no pudo ser dado de baja.");
            }
        } catch (SQLException ex) {
            System.out.println("Error al acceder a la tabla Bombero: " + ex.getMessage());
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Bombero: " + ex.getMessage());
        } finally {
            try {
                if (ps != null) {
                    ps.close();
                }
            } catch (SQLException ex) {
            }
        }
    }

//    public void eliminarBombero(Bombero bombero) {
//        String sql = "DELETE FROM bombero WHERE id_bombero = ?";
//        PreparedStatement ps = null;
//        try {
//            ps = con.prepareStatement(sql);
//            ps.setInt(1, bombero.getId_bombero());
//            ps.executeUpdate();
//        } catch (SQLException ex) {
//            System.out.println("Error al eliminar el bombero de la base de datos: " + ex.getMessage());
//        } finally {
//            try {
//                if (ps != null) {
//                    ps.close();
//                }
//            } catch (SQLException ex) {
//            }
//        }
//    }
    public boolean idBomberoExiste(int id_bombero) {
        String sql = "SELECT 1 FROM bombero WHERE id_bombero = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, id_bombero);
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Error al verificar la existencia del ID del bombero: " + ex.getMessage());
            return false;
        }
    }

}
