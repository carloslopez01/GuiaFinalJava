package clases;

/**Nombre de la clase: Estudiante
 *Fecha: 24-05-2018
 * Version: 1.0
 * Copyright: GPL/GNU
 * @author Carlos Lopez
 */
public class Estudiante {
    private String nombre;
    private String apellido;
    private String carnet;
    private int edad;
    private String genero;
    private double cum;
    private String carrera;
    private String facultad;
    
    public Estudiante(){
        
    }
    public Estudiante(String nombre, String apellido, String carnet, int edad, float cum, String carrera, String facultad) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.carnet = carnet;
        this.edad = edad;
        this.cum = cum;
        this.carrera = carrera;
        this.facultad = facultad;
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
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getCum() {
        return cum;
    }
    public void setCum(float cum) {
        this.cum = cum;
    }
    public String getCarrera() {
        return carrera;
    }
    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    
}
