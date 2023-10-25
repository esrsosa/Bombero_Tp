/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosEntidades;

import java.util.Date;

/**
 *
 * @author Emanuel Sosa
 */
public class Bombero {
    
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
    
}
