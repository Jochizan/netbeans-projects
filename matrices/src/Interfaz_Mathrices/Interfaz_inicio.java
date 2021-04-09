package Interfaz_Mathrices;

import javax.swing.*;
import java.awt.event.*;

/**
 *
 * @author  :3
 */
public class Interfaz_inicio extends JFrame {
    
    public static String name = "";

    public Interfaz_inicio() {
        initComponents();
        this.setTitle("Bienvenido");
        this.setBounds(0,0,350,450);
        this.setResizable(false);
        this.setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelNombre = new javax.swing.JLabel();
        jLabelTitulo = new javax.swing.JLabel();
        jTextFieldNombre = new javax.swing.JTextField();
        jLabelCreate = new javax.swing.JLabel();
        jButtonIngresar = new javax.swing.JButton();
        jLabelLogo = new javax.swing.JLabel();
        labelFondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelNombre.setFont(new java.awt.Font("Century Gothic", 1, 14)); // NOI18N
        jLabelNombre.setForeground(new java.awt.Color(226, 225, 253));
        jLabelNombre.setText("Ingrese su nombre");
        getContentPane().add(jLabelNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabelTitulo.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 24)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(219, 219, 252));
        jLabelTitulo.setText("Bienvenido a Mathtrices");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, -1, 40));

        jTextFieldNombre.setForeground(new java.awt.Color(76, 101, 210));
        jTextFieldNombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldNombreKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, 260, -1));

        jLabelCreate.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelCreate.setForeground(new java.awt.Color(223, 225, 250));
        jLabelCreate.setText("©2020 The Sistemas Company");
        getContentPane().add(jLabelCreate, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, -1, -1));

        jButtonIngresar.setForeground(new java.awt.Color(76, 101, 210));
        jButtonIngresar.setText("Ingresar");
        jButtonIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIngresarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 310, -1, -1));

        jLabelLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/matrizIcon.png"))); // NOI18N
        jLabelLogo.setText("jLabel1");
        getContentPane().add(jLabelLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 20, 260, 130));

        labelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(labelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 420));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIngresarActionPerformed
        if(evt.getSource() == jButtonIngresar){
            
            name = jTextFieldNombre.getText();
            
            if(name.equals("")){
                
                JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");
                
            }else{
                
                Interfaz_Términos_y_C ent = new Interfaz_Términos_y_C();
                ent.setVisible(true);
                this.setVisible(false);
                
            }
        }
    }//GEN-LAST:event_jButtonIngresarActionPerformed

    private void jTextFieldNombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldNombreKeyTyped
        char cTeclaPress = evt.getKeyChar();
        
        if(cTeclaPress == KeyEvent.VK_ENTER){
            
            jButtonIngresar.doClick();
            
        }
    }//GEN-LAST:event_jTextFieldNombreKeyTyped

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
            java.util.logging.Logger.getLogger(Interfaz_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonIngresar;
    private javax.swing.JLabel jLabelCreate;
    private javax.swing.JLabel jLabelLogo;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JTextField jTextFieldNombre;
    private javax.swing.JLabel labelFondo;
    // End of variables declaration//GEN-END:variables

}
