
package clases;

import javax.swing.JOptionPane;

/**Nombre de la clase: Ejercicio2
 *Fecha: 24-05-2018
 * Version: 1.0
 * Copyright: GPL/GNU
 * @author Carlos Lopez
 */
public class Ejercicio2 implements AccionesEj2 {
    private double val1=0.0;
    private double val2=0.0;
    private static double area=0;
    //implementando interfaces
    @Override
    public void calcularArea(String tipo){
        switch(tipo){
           
            //rectangulo, triangulos, rombo y romboide
            case "rectangulo":
                //en este caso val1 y val2 se usan como lados diferentes delrectangulo 
               area = this.val1 * this.val2;
                JOptionPane.showMessageDialog(null, "El area de el Rectangulo es: " + area);
                break;
            case "triangulo":
                //en este caso val1 y val2 se usan como base y altura de el triangulo
               area = (this.val1 * this.val2)/2;
                JOptionPane.showMessageDialog(null, "El area de el Triangulo es: " + area);
                break;
            case "rombo":
                //en este caso val1 y val2 se usan como las diagonales del rombo
                area =(this.val1 * this.val2)/2;
                JOptionPane.showMessageDialog(null, "El area de el Rombo es: " + area);
                break;
            case "romboide":
               area = this.val1 * this.val2;
                JOptionPane.showMessageDialog(null, "El area de el Romboide es: " + area);
                break;
        }
    }
     @Override
     public void mostrarResultado(){
         
     }
    public double getVal1() {
        return val1;
    }
    public void setVal1(double val1) {
        this.val1 = val1;
    }
    public double getVal2() {
        return val2;
    }
    public void setVal2(double val2) {
        this.val2 = val2;
    }
    
}
