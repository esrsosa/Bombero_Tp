/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosEntidades;

import java.util.Date;
import java.time.LocalDate;

/**
 *
 * @author Emanuel Sosa
 */
public class Bombero {

    private int id_bombero;
    private String dni;
    private String nombre;
    private String apellido;
    private String grupSanguineo;
    private LocalDate fecha_nac;
    private String celular;
    private Brigada codBrigada;//Relacion con brigada
    private boolean estado;

    public Bombero() {
    }

    public Bombero(int id_bombero, String dni, String nombre, String apellido, String grupSanguineo, LocalDate fecha_nac, String celular, Brigada codBrigada, boolean estado) {
        this.id_bombero = id_bombero;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grupSanguineo = grupSanguineo;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.codBrigada = codBrigada;
        this.estado = estado;
    }

    public Bombero(String dni, String nombre, String apellido, String grupSanguineo, LocalDate fecha_nac, String celular,boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grupSanguineo = grupSanguineo;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.estado=estado;
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

    public Brigada getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(Brigada codBrigada) {
        this.codBrigada = codBrigada;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Bombero{" + "id_bombero=" + id_bombero + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", grupSanguineo=" + grupSanguineo + ", fecha_nac=" + fecha_nac + ", celular=" + celular + ", codBrigada=" + codBrigada + '}';
    }

    


}
