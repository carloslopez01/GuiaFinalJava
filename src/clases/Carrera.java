
package clases;

/**Nombre de la clase: Carrera
 *Fecha: 24-05-2018
 * Version: 1.0
 * Copyright: GPL/GNU
 * @author Carlos Lopez
 */
public class Carrera {
    private String facultad;
    private String nombre;
    private String descripcion;
//constructores :V
    public Carrera() {
    }
    public Carrera(String facultad, String nombre, String descripcion) {
        this.facultad = facultad;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
//metodos get y set para acceder a los atributos de la clase;
    public String getDescripcion() {
        return descripcion;
    }
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String getFacultad() {
        return facultad;
    }
    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
