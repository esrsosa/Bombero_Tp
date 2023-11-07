/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BomberosEntidades;

/**
 *
 * @author Marcos
 */
public enum Especialidad {
    Incendios("Incedio"),
    Derrumbes("Derrumbe"),
    Rescate("Rescate"),
    Accidentes("Accidentes"),
    Inundaciones("Inundaciones"),
    OperativosPrevencion("OperativosPrevencion");
    
    private String tipoEspecialidades;         

    public String getTipoEspecialidades() {
        return tipoEspecialidades;
    }

    public void setTipoEspecialidades(String tipoEspecialidades) {
        this.tipoEspecialidades = tipoEspecialidades;
    }

    private Especialidad(String tipoEspecialidades) {
        this.tipoEspecialidades = tipoEspecialidades;
    }
}
