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
    private final ArrayList<Bombero> bomberos= new ArrayList<>(4);
    private Especialidad especialidad;
    private boolean libre;
    
    
    public void designarBrigada(){
        
    }
}
