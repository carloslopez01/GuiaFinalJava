
package clases;

/**Nombre de la clase: Ejercicio2
 *Fecha: 24-05-2018
 * Version: 1.0
 * Copyright: GPL/GNU
 * @author Carlos Lopez
 */
public class Ejercicio10 {
    /**Crear un formulario que capture el carnet (6 dígitos), 
     * nombre, edad, salario, genero, intereses, dui, nit, 
     * #licencia de un empleado, # de teléfono, departamento, 
     * cargo, sueldo final. /
     * **/
    private String carnet;
    private String nombre;
    private int edad;
    private double salario;
    private String genero;
    private String intereses;
    private String dui;
    private String nit;
    private String licencia;
    private String telefono;
    private String departamento;
    private String cargo;
    private String sueldoFinal;

    public Ejercicio10() {
    }
    public Ejercicio10(String carnet, String nombre, int edad, double salario, String genero, String intereses, String dui, String nit, String licencia, String telefono, String departamento, String cargo, String sueldoFinal) {
        this.carnet = carnet;
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
        this.genero = genero;
        this.intereses = intereses;
        this.dui = dui;
        this.nit = nit;
        this.licencia = licencia;
        this.telefono = telefono;
        this.departamento = departamento;
        this.cargo = cargo;
        this.sueldoFinal = sueldoFinal;
    }
    public String getSueldoFinal() {
        return sueldoFinal;
    }
    public void setSueldoFinal(String sueldoFinal) {
        this.sueldoFinal = sueldoFinal;
    }
    public String getCarnet() {
        return carnet;
    }
    public void setCarnet(String carnet) {
        this.carnet = carnet;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public double getSalario() {
        return salario;
    }
    public void setSalario(double salario) {
        this.salario = salario;
    }
    public String getGenero() {
        return genero;
    }
    public void setGenero(String genero) {
        this.genero = genero;
    }
    public String getIntereses() {
        return intereses;
    }
    public void setIntereses(String intereses) {
        this.intereses = intereses;
    }
    public String getDui() {
        return dui;
    }
    public void setDui(String dui) {
        this.dui = dui;
    }
    public String getNit() {
        return nit;
    }
    public void setNit(String nit) {
        this.nit = nit;
    }
    public String getLicencia() {
        return licencia;
    }
    public void setLicencia(String licencia) {
        this.licencia = licencia;
    }
    public String getTelefono() {
        return telefono;
    }
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    public String getDepartamento() {
        return departamento;
    }
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    public String getCargo() {
        return cargo;
    }
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
    
    public void sueldoFinal(){
        double sueldo= 0;
       if( this.salario>0 &&  this.salario<300){
          sueldo = (this.salario *0.1)  + this.salario;
       }else if(this.salario>=300 &&  this.salario<600){
          sueldo = (this.salario *0.12)  + this.salario;
       }else if(this.salario>600){
          sueldo = (this.salario *0.14)  + this.salario; 
       }
       
       this.sueldoFinal = " $"+sueldo;
    }
}
