/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

import clases.Ejercicio2;

/**
 *
 * @author Carlos Lopez
 */
public class FrmEjercicio2 extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEjercicio2
     */
    public FrmEjercicio2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtVal1 = new javax.swing.JTextField();
        txtVal2 = new javax.swing.JTextField();
        btnRombo = new javax.swing.JButton();
        btnRectangulo = new javax.swing.JButton();
        btnTriangulo = new javax.swing.JButton();
        btnRomboide = new javax.swing.JButton();

        setClosable(true);
        setTitle("Ejercicio 2");
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
        });

        jLabel1.setText("Ingrese VALOR 1:");

        jLabel2.setText("Ingrese VALOR 2:");

        btnRombo.setText("Rombo");
        btnRombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRomboActionPerformed(evt);
            }
        });

        btnRectangulo.setText("Rectangulo");
        btnRectangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRectanguloActionPerformed(evt);
            }
        });

        btnTriangulo.setText("Triangulo");
        btnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTrianguloActionPerformed(evt);
            }
        });

        btnRomboide.setText("Romboide");
        btnRomboide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRomboideActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtVal1)
                            .addComponent(txtVal2, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnRombo)
                            .addComponent(btnRectangulo))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnTriangulo)
                            .addComponent(btnRomboide))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtVal1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtVal2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRectangulo)
                    .addComponent(btnTriangulo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRombo)
                    .addComponent(btnRomboide))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRectanguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRectanguloActionPerformed
        llenar();
        Ejercicio2 eje = new Ejercicio2();
        eje.setVal1(Double.parseDouble(this.txtVal1.getText()));
        eje.setVal2(Double.parseDouble(this.txtVal2.getText()));
        eje.calcularArea("rectangulo");
    }//GEN-LAST:event_btnRectanguloActionPerformed

    private void btnRomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRomboActionPerformed
        llenar();
        Ejercicio2 eje = new Ejercicio2();
        eje.setVal1(Double.parseDouble(this.txtVal1.getText()));
        eje.setVal2(Double.parseDouble(this.txtVal2.getText()));
        eje.calcularArea("rombo");
    }//GEN-LAST:event_btnRomboActionPerformed

    private void btnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTrianguloActionPerformed
        Ejercicio2 eje = new Ejercicio2();
        eje.setVal1(Double.parseDouble(this.txtVal1.getText()));
        eje.setVal2(Double.parseDouble(this.txtVal2.getText()));
        eje.calcularArea("triangulo");
    }//GEN-LAST:event_btnTrianguloActionPerformed

    private void btnRomboideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRomboideActionPerformed
        Ejercicio2 eje = new Ejercicio2();
        eje.setVal1(Double.parseDouble(this.txtVal1.getText()));
        eje.setVal2(Double.parseDouble(this.txtVal2.getText()));
        eje.calcularArea("romboide");
    }//GEN-LAST:event_btnRomboideActionPerformed

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        Character c = evt.getKeyChar();
        if(!Character.isDigit(c)){
            evt.consume();
        }
    }//GEN-LAST:event_formKeyTyped
        //funcion que envia parametro a los atributos de la clase instanciada
    public void llenar(){
        Ejercicio2 ej = new Ejercicio2();
        ej.setVal1(Double.parseDouble(this.txtVal1.getText()));
        ej.setVal2(Double.parseDouble(this.txtVal2.getText()));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRectangulo;
    private javax.swing.JButton btnRombo;
    private javax.swing.JButton btnRomboide;
    private javax.swing.JButton btnTriangulo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtVal1;
    private javax.swing.JTextField txtVal2;
    // End of variables declaration//GEN-END:variables
}
