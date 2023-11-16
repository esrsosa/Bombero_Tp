/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosEntidades;

import java.util.List;

/**
 *
 * @author Emanuel Sosa
 */
public class Cuartel  {

    private int codCuartel;
    private String nombre;
    private String domicilio;
    private int coordenadax;
    private int coordenaday;
    private String telefono;
    private String correoElectronico;
    private boolean activo;
    private List<Brigada> brigadas; // Relacion con Brigada
    

    public Cuartel() {
    }

    public Cuartel(String nombre, String domicilio, int coordenadax, int coordenaday, String telefono, String correoElectronico) {
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.coordenadax = coordenadax;
        this.coordenaday = coordenaday;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    
    public Cuartel(int codCuartel, String nombre, String domicilio, int coordenadax, int coordenaday, String telefono, String correoElectronico) {
        this.codCuartel = codCuartel;
        this.nombre = nombre;
        this.domicilio = domicilio;
        this.coordenadax = coordenadax;
        this.coordenaday = coordenaday;
        this.telefono = telefono;
        this.correoElectronico = correoElectronico;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
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

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public List<Brigada> getBrigadas() {
        return brigadas;
    }

    public void setBrigadas(List<Brigada> brigadas) {
        this.brigadas = brigadas;
    }

    
    
    private void intervenir(){
        
    }

    @Override
    public String toString() {
        return "Cuartel{" + "codCuartel=" + codCuartel + ", nombre=" + nombre + ", domicilio=" + domicilio + ", coordenadax=" + coordenadax + ", coordenaday=" + coordenaday + ", telefono=" + telefono + ", correoElectronico=" + correoElectronico + ", brigadas=" + brigadas + '}';
    }

    
    
}
