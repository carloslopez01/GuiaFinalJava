
package clases;

import javax.swing.JOptionPane;

/**Nombre de la clase: Ejercicio7
 *Fecha: 24-05-2018
 * Version: 1.0
 * Copyright: GPL/GNU
 * @author Carlos Lopez
 */
public class Ejercicio7 {
    private double numero1;
    private double numero2;
    public Ejercicio7() {
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
    
    public void sumar(float num1, float num2){
        //utilizo datos de coma flotante debido a que
        //puede almacenar mas valores que float
        float suma=0;        
        suma = num1 + num2;
        JOptionPane.showMessageDialog(null, "La suma es: "+suma);
    }
    public void restar(float num1, float num2){
        float resta=0;
        resta = num1 - num2;
        JOptionPane.showMessageDialog(null, "La Restar es: "+resta);
    }
    public void multiplicar(float num1, float num2){
        float multi=0;
        multi = num1 * num2;
        JOptionPane.showMessageDialog(null, "La Multiplicacion es: "+multi);
    }
    public void dividir(float num1, float num2){
        float dividir=0;
        dividir = num1 / num2;
        JOptionPane.showMessageDialog(null, "La divicion es: "+dividir);
    }
    public void pow(double num1, double num2){
        //en este no uso datos float porque da error :V
        double pow=0;
        pow = Math.pow(num1, num2);
        JOptionPane.showMessageDialog(null, "La Potencia es: "+pow);
    }
    public void sqrt(double num1, double num2){
     double sqrt=0;
     sqrt = Math.pow(num1,1/num2);
     JOptionPane.showMessageDialog(null, "La Raiz "+num2+" de " +num1 + " es: "+sqrt);
    }
}
