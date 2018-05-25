package clases;
/**Nombre de la clase: Ejercicio3
 *Fecha: 24-05-2018
 * Version: 1.0
 * Copyright: GPL/GNU
 * @author Carlos Lopez
 */
public class Ejercicio3 {
    private String estadoCivil, nombres, apellidos;
    private int edad;

    public Ejercicio3() {
    }
    public Ejercicio3(String nombres, String apellidos, String estadoCivil, int edad) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.estadoCivil = estadoCivil;
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombres() {
        return nombres;
    }
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public String getEstadoCivil() {
        return estadoCivil;
    }
    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }
}
