/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;

/**
 *
 * @author Carlos Lopez
 */
public class FrmEjercicio6 extends javax.swing.JInternalFrame {

    /**
     * Creates new form FrmEjercicio6
     */
    public FrmEjercicio6() {
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

        btnCarrera = new javax.swing.JButton();
        btnFacultad = new javax.swing.JButton();
        btnEstudiante = new javax.swing.JButton();

        setClosable(true);
        setTitle("Accion");

        btnCarrera.setText("Carreras");
        btnCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCarreraActionPerformed(evt);
            }
        });

        btnFacultad.setText("Facultad");
        btnFacultad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFacultadActionPerformed(evt);
            }
        });

        btnEstudiante.setText("Estudiante");
        btnEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstudianteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCarrera)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addComponent(btnFacultad)
                .addGap(53, 53, 53)
                .addComponent(btnEstudiante)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCarrera)
                    .addComponent(btnFacultad)
                    .addComponent(btnEstudiante))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCarreraActionPerformed
        this.dispose();
        FrmCarrera c = new FrmCarrera();
        FrmPadre p = new FrmPadre();
        p.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_btnCarreraActionPerformed

    private void btnFacultadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFacultadActionPerformed
       this.dispose();
       
    }//GEN-LAST:event_btnFacultadActionPerformed

    private void btnEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstudianteActionPerformed
        this.dispose();
        FrmEstudiantes c = new FrmEstudiantes();
        FrmPadre p = new FrmPadre();
        p.add(c);
        c.setVisible(true);
    }//GEN-LAST:event_btnEstudianteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCarrera;
    private javax.swing.JButton btnEstudiante;
    private javax.swing.JButton btnFacultad;
    // End of variables declaration//GEN-END:variables
}
