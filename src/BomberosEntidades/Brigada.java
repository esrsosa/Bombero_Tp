/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosEntidades;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Emanuel Sosa
 */
public class Brigada {

    private int codBrigada;
    private String nombreBrigada;
    private Especialidad especialidad;
    private Cuartel nro_cuartel; //Relacion con cuartel
    List<Bombero> bomberos = new ArrayList(4);//Relacion con bombero
    private boolean libre = true;

    public Brigada() {
    }

    public Brigada(int codBrigada, String nombreBrigada, Especialidad especialidad, Cuartel nro_cuartel) {
        this.codBrigada = codBrigada;
        this.nombreBrigada = nombreBrigada;
        this.especialidad = especialidad;
        this.nro_cuartel = nro_cuartel;

    }

    public Brigada(String nombreBrigada, Especialidad especialidad, Cuartel nro_cuartel) {
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

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
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

    public List<Bombero> getBomberos() {
        return bomberos;
    }

    public void setBomberos(List<Bombero> bomberos) {
        this.bomberos = bomberos;
    }

  
    @Override
    public String toString() {
        return nombreBrigada;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Brigada brigada = (Brigada) obj;
        return Objects.equals(codBrigada, brigada.codBrigada);
    }

}
