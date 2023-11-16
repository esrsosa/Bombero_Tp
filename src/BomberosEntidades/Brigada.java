/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosEntidades;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Emanuel Sosa
 */
public class Brigada {
    
    private int codBrigada;
    private String nombreBrigada;
    private Especialidad especialidad;
    private Cuartel nro_cuartel; 
    List<Bombero> bomberos;//Relacion con bombero
    public Brigada() {
    }

    public Brigada(int codBrigada, String nombreBrigada, Especialidad especialidad, Cuartel nro_cuartel, List<Bombero> bomberos) {
        this.codBrigada = codBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.nro_cuartel = nro_cuartel;
        this.bomberos = bomberos;
    }

    public Brigada(String nombreBrigada, Especialidad especialidad, Cuartel nro_cuartel, List<Bombero> bomberos) {
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.nro_cuartel = nro_cuartel;
        this.bomberos = bomberos;
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

    public Cuartel getNro_cuartel() {
        return nro_cuartel;
    }

    public void setNro_cuartel(Cuartel nro_cuartel) {
        this.nro_cuartel = nro_cuartel;
    }

    @Override
    public String toString() {
        return "Brigada{" + "codBrigada=" + codBrigada + ", nombreBrigada=" + nombreBrigada + ", especialidad=" + especialidad + ", nro_cuartel=" + nro_cuartel + '}';
    }
  
    
}
