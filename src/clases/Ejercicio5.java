
package clases;

/**Nombre de la clase: Ejercicio5
 *Fecha: 24-05-2018
 * Version: 1.0
 * Copyright: GPL/GNU
 * @author Carlos Lopez
 */
public class Ejercicio5 {
    /*
    El docente ingresa sus credenciales para ingresar al sistema. (Crear un login con 2 perfiles de usuario) 
Se ingresa la información del grupo y el número de estudiantes que posee. 
Por cada estudiante se ingresa el carnet, el nombre, la nota promedio de teoría (30%), la nota promedio de la práctica (30%) y el sistema calcula el promedio final. Promedio mayor y menor de todo el grupo. 

    */
    private String nombre;
    private String carnet;
    private double promedioTeoria;
    private double promedioPractica;
    private double promedioFinal;

    public Ejercicio5() {
    }

    public Ejercicio5(String nombre, String carnet, double promedioTeoria, double promedioPractica, double promedioFinal) {
        this.nombre = nombre;
        this.carnet = carnet;
        this.promedioTeoria = promedioTeoria;
        this.promedioPractica = promedioPractica;
        this.promedioFinal = promedioFinal;
    }

    public double getPromedioFinal() {
        return promedioFinal;
    }

    public void setPromedioFinal(double promedioFinal) {
        this.promedioFinal = promedioFinal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCarnet() {
        return carnet;
    }

    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }

    public double getPromedioTeoria() {
        return promedioTeoria;
    }

    public void setPromedioTeoria(double promedioTeoria) {
        this.promedioTeoria = promedioTeoria;
    }

    public double getPromedioPractica() {
        return promedioPractica;
    }

    public void setPromedioPractica(double promedioPractica) {
        this.promedioPractica = promedioPractica;
    }
    
}
