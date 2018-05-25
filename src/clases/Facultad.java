/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**Nombre de la clase: Facultad
 *Fecha: 24-05-2018
 * Version: 1.0
 * Copyright: GPL/GNU
 * @author Carlos Lopez
 */
public class Facultad {
    private String universidad="UES";
    private String sede="San Salvador";
    private int numeroCarreras=29;

    public Facultad() {
    }
    public String getUniversidad() {
        return universidad;
    }
    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }
    public String getSede() {
        return sede;
    }
    public void setSede(String sede) {
        this.sede = sede;
    }
    public int getNumeroCarreras() {
        return numeroCarreras;
    }
    public void setNumeroCarreras(int numeroCarreras) {
        this.numeroCarreras = numeroCarreras;
    }
    
    
}
