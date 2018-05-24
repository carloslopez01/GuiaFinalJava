package clases;

import javax.swing.JOptionPane;

/**Nombre de la clase: Ejercicio1
 *Fecha: 24-05-2018
 * Version: 1.0
 * Copyright: GPL/GNU
 * @author Carlos Lopez
 */
public class Ejercicio1 {
    private double numero1;
    private double numero2;
    private double resultado;
    //metodos constructores de la clase
    public Ejercicio1() {
    }
    public Ejercicio1(double numero1, double numero2, double resultado) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }
    //metodos get y set de los atributos de la clase.
    public double getResultado() {
        return resultado;
    }
    public void setResultado(double resultado) {
        this.resultado = resultado;
    }
    public double getNumero1() {
        return numero1;
    }
    public void setNumero1(double numero1) {
        this.numero1 = numero1;
    }
    public double getNumero2() {
        return numero2;
    }
    public void setNumero2(double numero2) {
        this.numero2 = numero2;
    }
    
    public void sumar(){
        this.resultado = this.numero1+this.numero2;
        JOptionPane.showMessageDialog(null, "El resutado de la suma es:" + this.resultado);
    }
    public double sumar(double num1, double num2){
        this.numero1 = num1;
        this.numero2 = num2;
        this.resultado = this.numero1 + this.numero2;
        return this.resultado;
    }
}
