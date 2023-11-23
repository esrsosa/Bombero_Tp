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
import java.sql.Timestamp;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import sun.util.resources.LocaleData;

/**
 *
 * @author Emanuel Sosa
 */
public class SiniestrosData {

    private BrigadaData bd = new BrigadaData();
    private Connection con = null;

    public SiniestrosData() {
        con = Conexion.getConexion();
    }

    public void agregarSiniestro(Siniestro siniestro) {

        String sql = "INSERT INTO siniestro (tipo, fecha_siniestro, coord_x, coord_y, detalles, codBrigada) VALUES  (?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = null;
        LocalDateTime fechaResolucion = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(fechaResolucion);
        try {
            ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, siniestro.getTipoSiniestro().toString());

            ps.setTimestamp(2, timestamp);
            ps.setInt(3, siniestro.getCoordenadaX());
            ps.setInt(4, siniestro.getCoordenadaY());
            ps.setString(5, siniestro.getDetalles());
            ps.setObject(6, siniestro.getCodigoBrigada());//No estoy seguro si funciona
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
        LocalDateTime fechaResolucion = LocalDateTime.now();
        Timestamp timestamp = Timestamp.valueOf(fechaResolucion);
        try {
            ps = con.prepareStatement(sql);
            ps.setTimestamp(1, timestamp);
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

    public List<Siniestro> listarSiniestrosRecientes() {//Devuelve los siniestros de la ultima semana
        List<Siniestro> siniestrosRecientes = new ArrayList<>();
        LocalDate semana = LocalDate.now().minusDays(7);//16-7=9  9/11/23-16/11/23
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
                String auxiliar = rs.getString("tipo");
                Especialidad tipoSiniestro = Especialidad.valueOf(auxiliar);
                Timestamp fechaSiniestro = rs.getTimestamp("fecha_siniestro");
                LocalDateTime fechaSiniestro1 = fechaSiniestro.toLocalDateTime();
//                LocalDate fechaSiniestro = rs.getDate("fecha_siniestro").toLocalDate();
                int coordenadaX = rs.getInt("coord_x");
                int coordenadaY = rs.getInt("coord_y");
                String detalles = rs.getString("detalles");
                int brigadaCod = rs.getInt("codBrigada");

                Brigada codigoBrigada = bd.buscarBrigadaPorId(brigadaCod);
//                LocalDate fechaResolucion = rs.getDate("fecha_resol") != null ? rs.getDate("fecha_resol").toLocalDate() : null;
                Timestamp fechaResol = rs.getTimestamp("fecha_Resol");

                //Integer fechaResolucion = rs.getInt("fecha_resol");// puede o no puede estar
                Integer puntuacion = rs.getInt("puntuacion");//puede o no puede
                if (fechaResol != null && puntuacion != null) {
                    LocalDateTime fechaResolucion = fechaResol.toLocalDateTime();
                    Siniestro siniestro = new Siniestro(codigo, tipoSiniestro, fechaSiniestro1, coordenadaX, coordenadaY, detalles, fechaResolucion, puntuacion, codigoBrigada);
                    siniestrosRecientes.add(siniestro);
                } else {
                    Siniestro siniestro = new Siniestro(codigo, tipoSiniestro, fechaSiniestro1, coordenadaX, coordenadaY, detalles, codigoBrigada);
                    siniestrosRecientes.add(siniestro);
                }
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
        String sql = "SELECT * FROM siniestro WHERE codigo = ?";
        try (PreparedStatement ps = con.prepareStatement(sql)) {
            ps.setInt(1, codigo);
            
            ResultSet rs = ps.executeQuery();
            return rs.next();
        } catch (SQLException ex) {
            System.out.println("Error al verificar la existencia del código de siniestro: " + ex.getMessage());
            return false;
        }
    }

    public List<Siniestro> listarTodosLosSiniestrosOrdenadosPorFechaResolucion() {
        List<Siniestro> todosLosSiniestros = new ArrayList<>();
        String sql = "SELECT * FROM siniestro ORDER BY siniestro.fecha_resol DESC";

        try (PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String auxiliar = rs.getString("tipo");
                Especialidad tipoSiniestro = Especialidad.valueOf(auxiliar);
                Timestamp fechaSiniestro = rs.getTimestamp("fecha_siniestro");
                LocalDateTime fechaSiniestro1 = fechaSiniestro.toLocalDateTime();
                int coordenadaX = rs.getInt("coord_x");
                int coordenadaY = rs.getInt("coord_y");
                String detalles = rs.getString("detalles");
                int brigadaCod = rs.getInt("codBrigada");
                System.out.println(brigadaCod);
                Brigada codigoBrigada = bd.buscarBrigadaPorId(brigadaCod);
                LocalDateTime fechaResolucion = null;
//                 fechaResolucion = null;
                if (rs.getDate("fecha_resol") != null) {
                    Timestamp fechaResol = rs.getTimestamp("fecha_Resol");
                    fechaResolucion = fechaResol.toLocalDateTime();
                }

                // LocalDate fechaResolucion = rs.getDate("fecha_resol") != null ? rs.getDate("fecha_resol").toLocalDate() : null;
                // LocalDate fechaResolucion = rs.getDate("fecha_resol").toLocalDate();// puede o no puede estar
                Integer puntuacion = rs.getInt("puntuacion");//puede o no puede
                if (fechaResolucion != null && puntuacion != null) {
                    Siniestro siniestro = new Siniestro(codigo, tipoSiniestro, fechaSiniestro1, coordenadaX, coordenadaY, detalles, fechaResolucion, puntuacion, codigoBrigada);
                    todosLosSiniestros.add(siniestro);
                } else {
                    Siniestro siniestro = new Siniestro(codigo, tipoSiniestro, fechaSiniestro1, coordenadaX, coordenadaY, detalles, codigoBrigada);
                    todosLosSiniestros.add(siniestro);
                }
            }

        } catch (SQLException ex) {

            System.out.println("Error al consultar todos los siniestros ordenados por fecha de resolución: " + ex.getMessage());
        }

        return todosLosSiniestros;
    }

    public List<Siniestro> listarSiniestroSinResolver() {
        List<Siniestro> todosLosSiniestros = new ArrayList<>();
        String sql = "SELECT * FROM siniestro where puntuacion = 0";

        try (PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String auxiliar = rs.getString("tipo");
                Especialidad tipoSiniestro = Especialidad.valueOf(auxiliar);
                Timestamp fechaSiniestro = rs.getTimestamp("fecha_siniestro");
                LocalDateTime fechaSiniestro1 = fechaSiniestro.toLocalDateTime();
                int coordenadaX = rs.getInt("coord_x");
                int coordenadaY = rs.getInt("coord_y");
                String detalles = rs.getString("detalles");
                int brigadaCod = rs.getInt("codBrigada");
                System.out.println(brigadaCod);
                Brigada codigoBrigada = bd.buscarBrigadaPorId(brigadaCod);
                LocalDateTime fechaResolucion = null;
                if (rs.getDate("fecha_resol") != null) {
                    Timestamp fechaResol = rs.getTimestamp("fecha_Resol");
                    fechaResolucion = fechaResol.toLocalDateTime();

                }

                // LocalDate fechaResolucion = rs.getDate("fecha_resol") != null ? rs.getDate("fecha_resol").toLocalDate() : null;
                // LocalDate fechaResolucion = rs.getDate("fecha_resol").toLocalDate();// puede o no puede estar
                Integer puntuacion = rs.getInt("puntuacion");//puede o no puede
                if (fechaResolucion != null && puntuacion != null) {
                    Siniestro siniestro = new Siniestro(codigo, tipoSiniestro, fechaSiniestro1, coordenadaX, coordenadaY, detalles, fechaResolucion, puntuacion, codigoBrigada);
                    todosLosSiniestros.add(siniestro);
                } else {
                    Siniestro siniestro = new Siniestro(codigo, tipoSiniestro, fechaSiniestro1, coordenadaX, coordenadaY, detalles, codigoBrigada);
                    todosLosSiniestros.add(siniestro);
                }
            }

        } catch (SQLException ex) {

            System.out.println("Error al consultar todos los siniestros ordenados por fecha de resolución: " + ex.getMessage());
        }

        return todosLosSiniestros;
    }
 public List<Siniestro> listarSiniestroSinBrigada() {
        List<Siniestro> todosLosSiniestros = new ArrayList<>();
        String sql = "SELECT * FROM siniestro where codBrigada = null";
        try (PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String auxiliar = rs.getString("tipo");
                Especialidad tipoSiniestro = Especialidad.valueOf(auxiliar);
                Timestamp fechaSiniestro = rs.getTimestamp("fecha_siniestro");
                LocalDateTime fechaSiniestro1 = fechaSiniestro.toLocalDateTime();
                int coordenadaX = rs.getInt("coord_x");
                int coordenadaY = rs.getInt("coord_y");
                String detalles = rs.getString("detalles");
                int brigadaCod = rs.getInt("codBrigada");
                System.out.println(brigadaCod);
                Brigada codigoBrigada = bd.buscarBrigadaPorId(brigadaCod);
                LocalDateTime fechaResolucion = null;
                if (rs.getDate("fecha_resol") != null) {
                    Timestamp fechaResol = rs.getTimestamp("fecha_Resol");
                    fechaResolucion = fechaResol.toLocalDateTime();

                }

                // LocalDate fechaResolucion = rs.getDate("fecha_resol") != null ? rs.getDate("fecha_resol").toLocalDate() : null;
                // LocalDate fechaResolucion = rs.getDate("fecha_resol").toLocalDate();// puede o no puede estar
                Integer puntuacion = rs.getInt("puntuacion");//puede o no puede
                if (fechaResolucion != null && puntuacion != null) {
                    Siniestro siniestro = new Siniestro(codigo, tipoSiniestro, fechaSiniestro1, coordenadaX, coordenadaY, detalles, fechaResolucion, puntuacion, codigoBrigada);
                    todosLosSiniestros.add(siniestro);
                } else {
                    Siniestro siniestro = new Siniestro(codigo, tipoSiniestro, fechaSiniestro1, coordenadaX, coordenadaY, detalles, codigoBrigada);
                    todosLosSiniestros.add(siniestro);
                }
            }

        } catch (SQLException ex) {

            System.out.println("Error al consultar todos los siniestros ordenados por fecha de resolución: " + ex.getMessage());
        }

        return todosLosSiniestros;
    }
    public List<Siniestro> listarSiniestros() {
        List<Siniestro> todosLosSiniestros = new ArrayList<>();
        String sql = "SELECT * FROM siniestro";
        try (PreparedStatement ps = con.prepareStatement(sql);
                ResultSet rs = ps.executeQuery()) {
            while (rs.next()) {
                int codigo = rs.getInt("codigo");
                String auxiliar = rs.getString("tipo");
                Especialidad tipoSiniestro = Especialidad.valueOf(auxiliar);
                Timestamp fechaSiniestro = rs.getTimestamp("fecha_siniestro");
                LocalDateTime fechaSiniestro1 = fechaSiniestro.toLocalDateTime();
                int coordenadaX = rs.getInt("coord_x");
                int coordenadaY = rs.getInt("coord_y");
                String detalles = rs.getString("detalles");
                int brigadaCod = rs.getInt("codBrigada");
                System.out.println(brigadaCod);
                Brigada codigoBrigada = bd.buscarBrigadaPorId(brigadaCod);
                LocalDateTime fechaResolucion = null;
                if (rs.getDate("fecha_resol") != null) {
                    Timestamp fechaResol = rs.getTimestamp("fecha_Resol");
                    fechaResolucion = fechaResol.toLocalDateTime();
                }
                Siniestro siniestro = new Siniestro(codigo, tipoSiniestro, fechaSiniestro1, coordenadaX, coordenadaY, detalles, codigoBrigada);
                todosLosSiniestros.add(siniestro);
            }
            }catch (SQLException ex) {

            System.out.println("Error al consultar todos los siniestros ordenados por fecha de resolución: " + ex.getMessage());
        }

            return todosLosSiniestros;
        }

    }
