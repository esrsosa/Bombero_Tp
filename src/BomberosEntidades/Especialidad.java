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
    Incendios("Incedios"),
    Derrumbes("Derrumbes"),
    Rescate("Rescate"),
    Accidentes("Accidentes"),
    Inundaciones("Inundaciones"),
    OperativosPrevencion("OperativosPrevencio");
    
    private String tipoEspecialidades;         

    public String getTipoEspecialidades() {
        return tipoEspecialidades;
    }

    @Override
    public String toString() {
        return  tipoEspecialidades ;
    }

    public void setTipoEspecialidades(String tipoEspecialidades) {
        this.tipoEspecialidades = tipoEspecialidades;
    }

    private Especialidad(String tipoEspecialidades) {
        this.tipoEspecialidades = tipoEspecialidades;
    }
}
