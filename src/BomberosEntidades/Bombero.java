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
    private int codBrigada;
    private boolean estado;

    public Bombero() {
    }

    public Bombero(String dni, String nombre, String apellido, String grupSanguineo, LocalDate fecha_nac, String celular, int codBrigada,boolean estado) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.grupSanguineo = grupSanguineo;
        this.fecha_nac = fecha_nac;
        this.celular = celular;
        this.codBrigada = codBrigada;
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

    @Override
    public String toString() {
        return "Bombero{" + "id_bombero=" + id_bombero + ", dni=" + dni + ", nombre=" + nombre + ", apellido=" + apellido + ", grupSanguineo=" + grupSanguineo + ", fecha_nac=" + fecha_nac + ", celular=" + celular + ", codBrigada=" + codBrigada + '}';
    }

    


}
