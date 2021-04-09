package Interfaz_Mathrices;

import javax.swing.ImageIcon;
import javax.swing.*;

/**
 *
 * @author :3
 */
public class Ventana_ayuda extends JFrame {
    
    public Ventana_ayuda() {
        initComponents();
        this.setBounds(720, 170, 400, 550);
        this.setResizable(false);
        this.setTitle("Mathrices");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabelAyuda = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextAreabajo = new javax.swing.JTextArea();
        jButtonOkey = new javax.swing.JButton();
        jLabelfondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelAyuda.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 24)); // NOI18N
        jLabelAyuda.setForeground(new java.awt.Color(223, 225, 250));
        jLabelAyuda.setText("Ayuda");
        getContentPane().add(jLabelAyuda, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 100, -1));

        jTextAreabajo.setColumns(20);
        jTextAreabajo.setRows(5);
        jTextAreabajo.setText("Resolución de problemas del programa Mathrices\n\nSi les sale un error de \"Error al ingreso de datos\" o parecido asegurate de\nhaber presionado la tecla enter o en su defecto siquiera una de las teclas \nde flecha para que el valor ingresado se guarde en la posición de la tabla \nen la que haya terminado de ingresar datos.\n\nPara poder ingresar tablas más rapido vaya a herramientas y seleccione \n\"Matriz 3x3\" o en su defecto cualquiera de las otras para así generar las \nmatrices más rapido, y despúes evaluar su matriz u operar con este. De \nesta formas se ahorra unos cuantos porcesos.\n\nTodos los demás problemas que pueda tener el programa no son muy \nrelevantes, pero tenga cuidado si engresa alguna letra o símbolo en alguna\ncasilla para ingresar números eso es lo único que generaría un problema.\n\nComo último detalle si quiere cálcular la determinate o inversa de una matriz\ntenga mucho cuidado de solo ingresar números de un dígito porque podría \nperderse en la tabla debido a que tiene un límite en lo que se puede mostrar\nle recomendamos, que si su matriz o matrices tienen muchas columnas y filas que\nsolo use números de un dígito o a lo mucho 2 para no perderse en la úbicación\ncorrecta para poner los datos de su matriz.\n\nGracias por usar nuestro programa.");
        jScrollPane1.setViewportView(jTextAreabajo);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 50, 380, 410));

        jButtonOkey.setText("Okey");
        jButtonOkey.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkeyActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 470, -1, 30));

        jLabelfondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabelfondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonOkeyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkeyActionPerformed
         if(evt.getSource() == jButtonOkey){
            
            this.setVisible(false);
            this.setDefaultCloseOperation(EXIT_ON_CLOSE);
         }
    }//GEN-LAST:event_jButtonOkeyActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana_ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana_ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana_ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana_ayuda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_ayuda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonOkey;
    private javax.swing.JLabel jLabelAyuda;
    private javax.swing.JLabel jLabelfondo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextAreabajo;
    // End of variables declaration//GEN-END:variables
}
