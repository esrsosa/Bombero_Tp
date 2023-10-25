/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosEntidades;

<<<<<<< HEAD
import java.util.Date;
=======
import java.sql.Date;
import java.time.LocalDate;
>>>>>>> 954e5de9f2e945beccd0f25c695e78216336df88

/**
 *
 * @author Emanuel Sosa
 */
public class Bombero {
    private int id_bombero;
    private String dni;
    private String nombre_ape;
    private String grupSanguineo;
    private LocalDate fecha_nac;
    private String celular;
    private int codBrigada;
    private boolean estado;

    public Bombero(int id_bombero, String dni, String nombre_ape, String grupSanguineo, LocalDate fecha_nac, String celular, int codBrigada, boolean estado) {
        this.id_bombero = id_bombero;
        this.dni = dni;
        this.nombre_ape = nombre_ape;
        this.grupSanguineo = grupSanguineo;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }

    public int getId_bombero() {
        return id_bombero;
    }

    public void setId_bombero(int id_bombero) {
        this.id_bombero = id_bombero;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre_ape() {
        return nombre_ape;
    }

    public void setNombre_ape(String nombre_ape) {
        this.nombre_ape = nombre_ape;
    }

    public String getGrupSanguineo() {
        return grupSanguineo;
    }

    public void setGrupSanguineo(String grupSanguineo) {
        this.grupSanguineo = grupSanguineo;
    }

    public LocalDate getFecha_nac() {
        return fecha_nac;
    }

    public void setFecha_nac(LocalDate fecha_nac) {
        this.fecha_nac = fecha_nac;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
<<<<<<< HEAD
    private int codBombero ;
    private int dni;
    private String nombre;
    private String apellido;
    private String grupoSanguineo;
    private Date fechaNacimiento;
    private int celular;
    private boolean activo;

    public Bombero(int codBombero, int dni, String nombre, String apellido, String grupoSanguineo, Date fechaNacimiento, int celular, boolean activo) {
        this.codBombero = codBombero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grupoSanguineo = grupoSanguineo;
        this.fechaNacimiento = fechaNacimiento;
        this.celular = celular;
        this.activo = activo;
    }

    public int getCodBombero() {
        return codBombero;
    }

    public void setCodigoBombero(int codBombero) {
        this.codBombero = codBombero;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    
=======

>>>>>>> 954e5de9f2e945beccd0f25c695e78216336df88
}
