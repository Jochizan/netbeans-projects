package poo_matrices;

import javax.swing.*;
import proyectomathrices.InterfazInicio;
import proyectomathrices.InterfazMathrices;

/**
 *
 * @author Joan y Rem3
 */
public class InterfazTyC extends JFrame {

    public InterfazTyC() {
        initComponents();
        this.setBounds(0, 0, 600, 420);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Licencia de Mathrices");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage());
        InterfazInicio ant = new InterfazInicio();
        CheckBoxAcepto.setText("Yo " + ant.name + " Acepto");
        BotonContinuar.setEnabled(false);
        TextAreaTC.setFocusable(true);
        TextAreaTC.setEditable(false);
        TextAreaTC.setText("Términos y Condiciones de Uso\n"
                + " \n"
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ScrollPane1 = new javax.swing.JScrollPane();
        TextAreaTC = new javax.swing.JTextArea();
        LabelTitulo = new javax.swing.JLabel();
        CheckBoxAcepto = new javax.swing.JCheckBox();
        BotonContinuar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        LabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TextAreaTC.setColumns(20);
        TextAreaTC.setRows(5);
        ScrollPane1.setViewportView(TextAreaTC);

        getContentPane().add(ScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 60, 510, 220));

        LabelTitulo.setFont(new java.awt.Font("Lucida Fax", 1, 24)); // NOI18N
        LabelTitulo.setText("Terminos y condiciones ");
        getContentPane().add(LabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 0, 330, 60));

        CheckBoxAcepto.setFont(new java.awt.Font("Lucida Fax", 1, 12)); // NOI18N
        CheckBoxAcepto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                CheckBoxAceptoStateChanged(evt);
            }
        });
        getContentPane().add(CheckBoxAcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 300, -1, -1));

        BotonContinuar.setText("Continuar");
        BotonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, -1, -1));

        BotonCancelar.setText("Cancelar");
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(BotonCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 340, -1, -1));

        LabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/Fondo_azul2.png"))); // NOI18N
        getContentPane().add(LabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-14, -14, 650, 440));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CheckBoxAceptoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_CheckBoxAceptoStateChanged
        if (CheckBoxAcepto.isSelected() == true) {
            BotonContinuar.setEnabled(true);
            BotonCancelar.setEnabled(false);
        } else {
            BotonContinuar.setEnabled(false);
            BotonCancelar.setEnabled(true);
        }
    }//GEN-LAST:event_CheckBoxAceptoStateChanged

    private void BotonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonContinuarActionPerformed
        if (evt.getSource() == BotonContinuar) {
            InterfazMathrices next = new InterfazMathrices();
            next.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_BotonContinuarActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        if (evt.getSource() == BotonCancelar) {
            InterfazInicio ant = new InterfazInicio();
            ant.setVisible(true);
            this.setVisible(false);
        }
    }//GEN-LAST:event_BotonCancelarActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(InterfazTyC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InterfazTyC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InterfazTyC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InterfazTyC.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InterfazTyC().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCancelar;
    private javax.swing.JButton BotonContinuar;
    private javax.swing.JCheckBox CheckBoxAcepto;
    private javax.swing.JLabel LabelFondo;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JScrollPane ScrollPane1;
    private javax.swing.JTextArea TextAreaTC;
    // End of variables declaration//GEN-END:variables
}
