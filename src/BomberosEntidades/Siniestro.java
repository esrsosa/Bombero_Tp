/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosEntidades;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author Emanuel Sosa
 */
public class Siniestro {
    
    private int codigo;
    private Especialidad tipoSiniestro;
    private LocalDate fechaSiniestro; // localdatetime
    private int coordenadaX;
    private int coordenadaY;
    private String detalles;
    private LocalDate fechaResolucion;
    private int calificacion;
    private Brigada codigoBrigada;//Relacion con Brigada

    public Siniestro(Especialidad tipoSiniestro, LocalDate fechaSiniestro, int coordenadaX, int coordenadaY, String detalles) {
        this.tipoSiniestro = tipoSiniestro;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
    }

    
    public Siniestro(Especialidad tipoSiniestro, LocalDate fechaSiniestro, int coordenadaX, int coordenadaY, String detalles, Brigada codigoBrigada) {
        this.tipoSiniestro = tipoSiniestro;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.codigoBrigada = codigoBrigada;
    }

    public Siniestro(int codigo, Especialidad tipoSiniestro, LocalDate fechaSiniestro, int coordenadaX, int coordenadaY, String detalles, Brigada codigoBrigada) {
        this.codigo = codigo;
        this.tipoSiniestro = tipoSiniestro;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.codigoBrigada = codigoBrigada;
    }

    public Siniestro(int codigo, Especialidad tipoSiniestro, LocalDate fechaSiniestro, int coordenadaX, int coordenadaY, String detalles, LocalDate fechaResolucion, int calificacion, Brigada codigoBrigada) {
        this.codigo = codigo;
        this.tipoSiniestro = tipoSiniestro;
        this.fechaSiniestro = fechaSiniestro;
        this.coordenadaX = coordenadaX;
        this.coordenadaY = coordenadaY;
        this.detalles = detalles;
        this.fechaResolucion = fechaResolucion;
        this.calificacion = calificacion;
        this.codigoBrigada = codigoBrigada;
    }



    public Siniestro(int codigo, LocalDate fechaResolucion, int calificacion) {
        this.codigo = codigo;
        this.fechaResolucion = fechaResolucion;
        this.calificacion = calificacion;
    }

    public Siniestro(int codigo) {
        this.codigo = codigo;
    }

    public Siniestro() {
       
    }

    public Brigada getCodigoBrigada() {
        return codigoBrigada;
    }

    public void setCodigoBrigada(Brigada codigoBrigada) {
        this.codigoBrigada = codigoBrigada;
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

    public LocalDate getFechaSiniestro() {
        return fechaSiniestro;
    }

    public void setFechaSiniestro(LocalDate fechaSiniestro) {
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

    public LocalDate getFechaResolucion() {
        return fechaResolucion;
    }

    public void setFechaResolucion(LocalDate fechaResolucion) {
        this.fechaResolucion = fechaResolucion;
    }



    public int getCalificacion() {
        return calificacion;
    }

    public void setCalificacion(int calificacion) {
        this.calificacion = calificacion;
    }

    @Override
   public String toString() {
    return "Siniestro{" +
        "codigo=" + codigo +
        ", tipoSiniestro=" + tipoSiniestro +
        ", fechaSiniestro=" + fechaSiniestro +
        ", coordenadaX=" + coordenadaX +
        ", coordenadaY=" + coordenadaY +
        ", detalles='" + detalles +
        ", fechaResolucion=" + fechaResolucion +
        ", calificacion=" + calificacion +
        ", codigoBrigada=" + codigoBrigada;
}

  


  
    
}
