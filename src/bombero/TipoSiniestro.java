/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bombero;

/**
 *
 * @author pollo
 */
public class TipoSiniestro {
    // Definición de los tipos de siniestro como constantes
    public static final TipoSiniestro INCENDIO = new TipoSiniestro("Incendio");
    public static final TipoSiniestro ACCIDENTE = new TipoSiniestro("Accidente");
    public static final TipoSiniestro INUNDACION = new TipoSiniestro("Inundación");
    // Agrega más tipos de siniestro según tus necesidades

    private String nombre;

    private TipoSiniestro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
}
