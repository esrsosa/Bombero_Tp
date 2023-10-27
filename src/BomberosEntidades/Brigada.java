/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosEntidades;

import java.util.ArrayList;

/**
 *
 * @author Emanuel Sosa
 */
public class Brigada {
    
    private int codBrigada;
    private String nombreBrigada;
    private Especialidad especialidad;
    private boolean libre;
    private int nro_cuartel;

    public Brigada(int codBrigada, String nombreBrigada, Especialidad especialidad, boolean libre, int nro_cuartel) {
        this.codBrigada = codBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.libre = libre;
        this.nro_cuartel = nro_cuartel;
    }

    public Brigada(int codBrigada, String nombreBrigada, Especialidad especialidad) {
        this.codBrigada = codBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        
    }

    public Brigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public int getCodBrigada() {
        return codBrigada;
    }

    public void setCodBrigada(int codBrigada) {
        this.codBrigada = codBrigada;
    }

    public String getNombreBrigada() {
        return nombreBrigada;
    }

    public void setNombreBrigada(String nombreBrigada) {
        this.nombreBrigada = nombreBrigada;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }

    public int getNro_cuartel() {
        return nro_cuartel;
    }

    public void setNro_cuartel(int nro_cuartel) {
        this.nro_cuartel = nro_cuartel;
    }

    @Override
    public String toString() {
        return "Brigada{" + "codBrigada=" + codBrigada + ", nombreBrigada=" + nombreBrigada + ", especialidad=" + especialidad + ", libre=" + libre + ", nro_cuartel=" + nro_cuartel + '}';
    }
    
  
    
}
