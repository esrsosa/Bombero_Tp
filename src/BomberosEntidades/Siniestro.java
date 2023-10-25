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
public class Siniestro {
    
    private int codigo;
    private Especialidad tipoSiniestro;
    private Date fechaSiniestro;
    private int coordenadaX;
    private int coordenadaY;
    private String detalles;
    private Date fechaResolucion;
    private int calificacion;
    private Brigada brigada;

    public Siniestro(int codigo, Especialidad tipoSiniestro, Date fechaSiniestro, int coordenadaX, int coordenadaY, String detalles) {
        this.codigo = codigo;
        this.tipoSiniestro = tipoSiniestro;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public Especialidad getTipoSiniestro() {
        return tipoSiniestro;
    }

    public void setTipoSiniestro(Especialidad tipoSiniestro) {
        this.tipoSiniestro = tipoSiniestro;
    }

    public Date getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(Date fechaSiniestro) {
        this.fechaSiniestro = fechaSiniestro;
    }

    public int getCoordenadaX() {
        return coordenadaX;
    }

    public void setCoordenadaX(int coordenadaX) {
        this.coordenadaX = coordenadaX;
    }

    public int getCoordenadaY() {
        return coordenadaY;
    }

    public void setCoordenadaY(int coordenadaY) {
        this.coordenadaY = coordenadaY;
    }

    public String getDetalles() {
        return detalles;
    }

    public void setDetalles(String detalles) {
        this.detalles = detalles;
    }

    public Date getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(Date fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }

    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    public Brigada getBrigada() {
        return brigada;
    }

    public void setBrigada(Brigada brigada) {
        this.brigada = brigada;
    }
    
    
}
