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
public class Cuartel {

    private int codCuartel;
    private String nombre;
    private String domicilio;
    private int coordenadax;
    private int coordenaday;
    private int telefono;
    private String correoElectronico;
    private ArrayList<Brigada> brigadas;

    public Cuartel(int codCuartel, String nombre, String domicilio, int coordenadax, int coordenaday, int telefono, String correoElectronico) {
        this.codCuartel = codCuartel;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.coordenadax = coordenadax;
        this.coordenaday = coordenaday;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public int getCodCuartel() {
        return codCuartel;
    }

    public void setCodCuartel(int codCuartel) {
        this.codCuartel = codCuartel;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public int getCoordenadax() {
        return coordenadax;
    }

    public void setCoordenadax(int coordenadax) {
        this.coordenadax = coordenadax;
    }

    public int getCoordenaday() {
        return coordenaday;
    }

    public void setCoordenaday(int coordenaday) {
        this.coordenaday = coordenaday;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public ArrayList<Brigada> getBrigadas() {
        return brigadas;
    }

    public void setBrigadas(ArrayList<Brigada> brigadas) {
        this.brigadas = brigadas;
    }
    
    private void intervenir(){
        
    }
}
