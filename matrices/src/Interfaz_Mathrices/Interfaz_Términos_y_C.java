package Interfaz_Mathrices;

import javax.swing.*;

/**
 *
 * @author :3
 */
public class Interfaz_Términos_y_C extends JFrame {

    String nombre = "";
    
    public Interfaz_Términos_y_C() {
        initComponents();
        this.setBounds(0,0,600,420);
        this.setVisible(true);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        this.setTitle("Licencia de Mathrices");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage());
        
        Interfaz_inicio ventana2 = new Interfaz_inicio();
        jCheckBoxAcepto.setText("Yo " + ventana2.name + " Acepto");
        
        jButtonContinuar.setEnabled(false);
        
        jTextAreaTer.setText("Términos y Condiciones de Uso\n" +
        " \n" +
        "INFORMACIÓN RELEVANTE\n" +
        "\n" +
        "Es requisito necesario para la adquisición de los productos que se ofrecen en este sitio, que lea\n" +
        "y acepte los siguientes Términos y Condiciones que a continuación se redactan. El uso de \n" +
        "nuestros servicios así como la compra de nuestros productos implicará que usted ha leído y \n" +
        "aceptado los Términos y Condiciones de Uso en el presente documento. Todas los productos \n" +
        "que son ofrecidos por nuestro sitio web pudieran ser creadas, cobradas, enviadas o presentadas \n" +
        "por una página web tercera y en tal caso estarían sujetas a sus propios Términos y Condiciones. \n" +
        "\n" +
        "LICENCIA\n" +
        "\n" +
        "The Sistemas Company  a través de su sitio web concede una licencia para que los usuarios\n" +
        "utilicen  los productos que son vendidos en este sitio web de acuerdo a los Términos y \n" +
        "Condiciones que se describen en este documento.\n" +
        "\n" + "The Sistemas Company reserva los derechos de cambiar o de modificar estos términos sin \n" +
        "previo aviso.");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelTitle = new javax.swing.JLabel();
        jCheckBoxAcepto = new javax.swing.JCheckBox();
        jButtonContinuar = new javax.swing.JButton();
        jButtonNoAcepto = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextAreaTer = new javax.swing.JTextArea();
        jLabelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabelTitle.setForeground(new java.awt.Color(0, 0, 0));
        jLabelTitle.setText("Términos y Condiciones");
        getContentPane().add(jLabelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jCheckBoxAcepto.setActionCommand("Yo " + nombre + " Acepto");
        jCheckBoxAcepto.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                jCheckBoxAceptoStateChanged(evt);
            }
        });
        getContentPane().add(jCheckBoxAcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, -1, -1));

        jButtonContinuar.setText("Continuar");
        jButtonContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonContinuarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonContinuar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        jButtonNoAcepto.setText("No acepto");
        jButtonNoAcepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoAceptoActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNoAcepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 350, -1, -1));

        jTextAreaTer.setColumns(20);
        jTextAreaTer.setRows(5);
        jScrollPane2.setViewportView(jTextAreaTer);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, 540, 260));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 610, 400));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jCheckBoxAceptoStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_jCheckBoxAceptoStateChanged
        if(jCheckBoxAcepto.isSelected() == true){
            
            jButtonContinuar.setEnabled(true);
            jButtonNoAcepto.setEnabled(false);
            
        }else{
            
            jButtonContinuar.setEnabled(false);
            jButtonNoAcepto.setEnabled(true);
            
        }
    }//GEN-LAST:event_jCheckBoxAceptoStateChanged

    private void jButtonContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonContinuarActionPerformed

        if(evt.getSource() == jButtonContinuar){
            
            Interfaz_Mathrices ent = new Interfaz_Mathrices();
            ent.setVisible(true);
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_jButtonContinuarActionPerformed

    private void jButtonNoAceptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoAceptoActionPerformed
        if(evt.getSource() == jButtonNoAcepto){
            
            Interfaz_inicio er = new Interfaz_inicio();
            er.setVisible(true);
            this.setVisible(false);
            
        }
    }//GEN-LAST:event_jButtonNoAceptoActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Términos_y_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Términos_y_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Términos_y_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Términos_y_C.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Términos_y_C().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonContinuar;
    private javax.swing.JButton jButtonNoAcepto;
    private javax.swing.JCheckBox jCheckBoxAcepto;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextAreaTer;
    // End of variables declaration//GEN-END:variables
}
