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
    private int nro_cuartel; // cambiar a cuartel

    public Brigada(int codBrigada, String nombreBrigada, Especialidad especialidad, int nro_cuartel) {
        this.codBrigada = codBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.nro_cuartel = nro_cuartel;
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

    public int getNro_cuartel() {
        return nro_cuartel;
    }

    public void setNro_cuartel(int nro_cuartel) {
        this.nro_cuartel = nro_cuartel;
    }

    @Override
    public String toString() {
        return "Brigada{" + "codBrigada=" + codBrigada + ", nombreBrigada=" + nombreBrigada + ", especialidad=" + especialidad + ", nro_cuartel=" + nro_cuartel + '}';
    }
  
    
}
