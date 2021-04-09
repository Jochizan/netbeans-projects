package Interfaz_Mathrices;

import javax.swing.table.DefaultTableModel;
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;

/**
 *
 * @author :3
 * @version 1.1
 */
public class Interfaz_Mathrices extends JFrame {

    DefaultTableModel modeloA = new DefaultTableModel();
    DefaultTableModel modeloB = new DefaultTableModel();
    DefaultTableModel modeloC = new DefaultTableModel();
    public int Afila;
    public int Acol;
    public int Bfila;
    public int Bcol;

    public Interfaz_Mathrices() {

        initComponents();
        this.setBounds(0, 0, 550, 690);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        this.setTitle("Mathrices");
        setIconImage(new ImageIcon(getClass().getResource("/imagenes/Icono.png")).getImage());
        Interfaz_inicio ventana3 = new Interfaz_inicio();
        jLabelBienvenida.setText("Bienvenido " + ventana3.name);

        txtAfila.setText("2");
        txtAcolumna.setText("2");
        txtBfila.setText("2");
        txtBcolumna.setText("2");
        JButtonMatA.doClick();
        jButtonMatB.doClick();
        txtAfila.setText("");
        txtAcolumna.setText("");
        txtBfila.setText("");
        txtBcolumna.setText("");
    }

    public Icon imagenes(String path, int width, int height) {

        Icon Buena = new ImageIcon(getClass().getResource("/imagenes/buena2.png"));
        return Buena;

    }

    public Icon image(String path, int width, int height) {

        Icon Mala = new ImageIcon(getClass().getResource("/imagenes/mala2.png"));
        return Mala;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonMatB = new javax.swing.JButton();
        JButtonMatA = new javax.swing.JButton();
        JPanelPrimero = new javax.swing.JPanel();
        txtAfila = new javax.swing.JTextField();
        jLabelFilasA = new javax.swing.JLabel();
        jLabelColumnasA = new javax.swing.JLabel();
        txtAcolumna = new javax.swing.JTextField();
        JPanelSegundo = new javax.swing.JPanel();
        jLabelFilasB = new javax.swing.JLabel();
        txtBfila = new javax.swing.JTextField();
        jLabelColumnasB = new javax.swing.JLabel();
        txtBcolumna = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaA = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaB = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaResultado = new javax.swing.JTable();
        JButtonMultiplicar = new javax.swing.JButton();
        jLabelTitulo = new javax.swing.JLabel();
        JButtonSuma = new javax.swing.JButton();
        JButtonResta = new javax.swing.JButton();
        JButtonIdentidad = new javax.swing.JButton();
        jButtonTriangulares = new javax.swing.JButton();
        jButtonEscalar = new javax.swing.JButton();
        jButtonNula = new javax.swing.JButton();
        jLabelDerechos = new javax.swing.JLabel();
        jLabelBienvenida = new javax.swing.JLabel();
        jButtonDiagonal = new javax.swing.JButton();
        jButtonEscalar2 = new javax.swing.JButton();
        jButtonTrans = new javax.swing.JButton();
        jButtonSimetrica = new javax.swing.JButton();
        jButtonTraza = new javax.swing.JButton();
        jButtonDeterminante = new javax.swing.JButton();
        jLabelFondo = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuopciones = new javax.swing.JMenu();
        jMenuItemInstrucciones = new javax.swing.JMenuItem();
        jMenuItemmath = new javax.swing.JMenuItem();
        jMenuItemSalir = new javax.swing.JMenuItem();
        jMenuHerramientas = new javax.swing.JMenu();
        jMenuItemMath3 = new javax.swing.JMenuItem();
        jMenuItemMath4 = new javax.swing.JMenuItem();
        jMenuItemMath5 = new javax.swing.JMenuItem();
        jMenuItemMath6 = new javax.swing.JMenuItem();
        jMenuAcercade = new javax.swing.JMenu();
        jMenuItemCreador = new javax.swing.JMenuItem();
        jMenuAyuda = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButtonMatB.setForeground(new java.awt.Color(76, 101, 210));
        jButtonMatB.setText("Generar matriz B");
        jButtonMatB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonMatBActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonMatB, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 170, 130, 40));

        JButtonMatA.setForeground(new java.awt.Color(76, 101, 210));
        JButtonMatA.setText("Generar matriz A");
        JButtonMatA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonMatAActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonMatA, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 170, 140, 40));

        JPanelPrimero.setBackground(new java.awt.Color(252, 253, 234));
        JPanelPrimero.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz A"));
        JPanelPrimero.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        JPanelPrimero.add(txtAfila, new org.netbeans.lib.awtextra.AbsoluteConstraints(121, 30, 44, -1));

        jLabelFilasA.setText("    # Filas");
        JPanelPrimero.add(jLabelFilasA, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 32, 53, -1));

        jLabelColumnasA.setText("    # Columnas");
        JPanelPrimero.add(jLabelColumnasA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, -1, -1));

        txtAcolumna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtAcolumnaKeyTyped(evt);
            }
        });
        JPanelPrimero.add(txtAcolumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 70, 44, -1));

        getContentPane().add(JPanelPrimero, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 180, 110));

        JPanelSegundo.setBackground(new java.awt.Color(252, 253, 234));
        JPanelSegundo.setBorder(javax.swing.BorderFactory.createTitledBorder("Matriz B"));
        JPanelSegundo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelFilasB.setText("# Filas");
        JPanelSegundo.add(jLabelFilasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 32, 53, -1));
        JPanelSegundo.add(txtBfila, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 30, 40, -1));

        jLabelColumnasB.setText("# Columnas");
        JPanelSegundo.add(jLabelColumnasB, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 70, 94, -1));

        txtBcolumna.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtBcolumnaKeyTyped(evt);
            }
        });
        JPanelSegundo.add(txtBcolumna, new org.netbeans.lib.awtextra.AbsoluteConstraints(123, 68, 40, -1));

        getContentPane().add(JPanelSegundo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 60, 180, 110));

        TablaA.setBackground(new java.awt.Color(252, 253, 234));
        TablaA.setBorder(new javax.swing.border.MatteBorder(null));
        TablaA.setForeground(new java.awt.Color(0, 0, 0));
        TablaA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaA.setGridColor(new java.awt.Color(0, 0, 0));
        TablaA.setSelectionBackground(new java.awt.Color(31, 32, 85));
        jScrollPane1.setViewportView(TablaA);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 230, 188, 148));

        TablaB.setBackground(new java.awt.Color(252, 253, 234));
        TablaB.setBorder(new javax.swing.border.MatteBorder(null));
        TablaB.setForeground(new java.awt.Color(0, 0, 0));
        TablaB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaB.setGridColor(new java.awt.Color(0, 0, 0));
        TablaB.setSelectionBackground(new java.awt.Color(43, 39, 91));
        jScrollPane2.setViewportView(TablaB);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 184, 148));

        TablaResultado.setBackground(new java.awt.Color(252, 253, 234));
        TablaResultado.setBorder(new javax.swing.border.MatteBorder(null));
        TablaResultado.setForeground(new java.awt.Color(0, 0, 0));
        TablaResultado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        TablaResultado.setGridColor(new java.awt.Color(0, 0, 0));
        TablaResultado.setSelectionBackground(new java.awt.Color(255, 255, 228));
        TablaResultado.setSelectionForeground(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(TablaResultado);

        getContentPane().add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 270, 170));

        JButtonMultiplicar.setText("Multiplicar");
        JButtonMultiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonMultiplicarActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonMultiplicar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 410, 100, 30));

        jLabelTitulo.setFont(new java.awt.Font("Copperplate Gothic Light", 2, 36)); // NOI18N
        jLabelTitulo.setForeground(new java.awt.Color(223, 225, 250));
        jLabelTitulo.setText("Mathrices");
        getContentPane().add(jLabelTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 210, -1));

        JButtonSuma.setText("Suma");
        JButtonSuma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonSumaActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonSuma, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 410, 80, 30));

        JButtonResta.setText("Resta");
        JButtonResta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonRestaActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonResta, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 410, 90, 30));

        JButtonIdentidad.setForeground(new java.awt.Color(76, 101, 210));
        JButtonIdentidad.setText("Identidad");
        JButtonIdentidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                JButtonIdentidadActionPerformed(evt);
            }
        });
        getContentPane().add(JButtonIdentidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 140, 120, 30));

        jButtonTriangulares.setForeground(new java.awt.Color(76, 101, 210));
        jButtonTriangulares.setText("Triangular");
        jButtonTriangulares.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTriangularesActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTriangulares, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 110, 30));

        jButtonEscalar.setText("xEscalar");
        jButtonEscalar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscalarActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEscalar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 90, 30));

        jButtonNula.setForeground(new java.awt.Color(76, 101, 210));
        jButtonNula.setText("Nula");
        jButtonNula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNulaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonNula, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 420, 110, 30));

        jLabelDerechos.setFont(new java.awt.Font("Dialog", 1, 13)); // NOI18N
        jLabelDerechos.setForeground(new java.awt.Color(223, 225, 250));
        jLabelDerechos.setText("©2020 The Sistemas Company");
        getContentPane().add(jLabelDerechos, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, -1, -1));

        jLabelBienvenida.setFont(new java.awt.Font("Copperplate Gothic Light", 1, 15)); // NOI18N
        jLabelBienvenida.setForeground(new java.awt.Color(223, 225, 250));
        getContentPane().add(jLabelBienvenida, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 30, -1, -1));

        jButtonDiagonal.setForeground(new java.awt.Color(76, 101, 210));
        jButtonDiagonal.setText("Diagonal");
        jButtonDiagonal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDiagonalActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDiagonal, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 180, 120, 30));

        jButtonEscalar2.setForeground(new java.awt.Color(76, 101, 210));
        jButtonEscalar2.setText("Escalar");
        jButtonEscalar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEscalar2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonEscalar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 260, 110, 30));

        jButtonTrans.setForeground(new java.awt.Color(76, 101, 210));
        jButtonTrans.setText("Transpuesta");
        jButtonTrans.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTransActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTrans, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 300, 110, 30));

        jButtonSimetrica.setForeground(new java.awt.Color(76, 101, 210));
        jButtonSimetrica.setText("Simétrica");
        jButtonSimetrica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSimetricaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSimetrica, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 220, 110, 30));

        jButtonTraza.setForeground(new java.awt.Color(76, 101, 210));
        jButtonTraza.setText("Traza");
        jButtonTraza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTrazaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonTraza, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 380, 110, 30));

        jButtonDeterminante.setForeground(new java.awt.Color(76, 101, 210));
        jButtonDeterminante.setText("Determinante");
        jButtonDeterminante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonDeterminanteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonDeterminante, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 100, 120, 30));

        jLabelFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/FondoAzul.png"))); // NOI18N
        getContentPane().add(jLabelFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jMenuopciones.setText("Opciones");

        jMenuItemInstrucciones.setText("Instrucciones");
        jMenuItemInstrucciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemInstruccionesActionPerformed(evt);
            }
        });
        jMenuopciones.add(jMenuItemInstrucciones);

        jMenuItemmath.setText("Matrices");
        jMenuItemmath.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItemmathMouseClicked(evt);
            }
        });
        jMenuItemmath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemmathActionPerformed(evt);
            }
        });
        jMenuopciones.add(jMenuItemmath);

        jMenuItemSalir.setText("Salir");
        jMenuItemSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemSalirActionPerformed(evt);
            }
        });
        jMenuopciones.add(jMenuItemSalir);

        jMenuBar1.add(jMenuopciones);

        jMenuHerramientas.setText("Herramientas");
        jMenuHerramientas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuHerramientasMouseClicked(evt);
            }
        });
        jMenuHerramientas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuHerramientasActionPerformed(evt);
            }
        });

        jMenuItemMath3.setText("matriz 3x3");
        jMenuItemMath3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMath3ActionPerformed(evt);
            }
        });
        jMenuHerramientas.add(jMenuItemMath3);

        jMenuItemMath4.setText("matriz 4x4");
        jMenuItemMath4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMath4ActionPerformed(evt);
            }
        });
        jMenuHerramientas.add(jMenuItemMath4);

        jMenuItemMath5.setText("matriz 5x5");
        jMenuItemMath5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMath5ActionPerformed(evt);
            }
        });
        jMenuHerramientas.add(jMenuItemMath5);

        jMenuItemMath6.setText("matriz 6x6");
        jMenuItemMath6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemMath6ActionPerformed(evt);
            }
        });
        jMenuHerramientas.add(jMenuItemMath6);

        jMenuBar1.add(jMenuHerramientas);

        jMenuAcercade.setText("Acerca de");

        jMenuItemCreador.setText("El creador");
        jMenuItemCreador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemCreadorActionPerformed(evt);
            }
        });
        jMenuAcercade.add(jMenuItemCreador);

        jMenuBar1.add(jMenuAcercade);

        jMenuAyuda.setText("Ayuda");
        jMenuAyuda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuAyudaMouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void JButtonMatAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonMatAActionPerformed
        try {
            int Afila = Integer.parseInt(txtAfila.getText());
            int Acol = Integer.parseInt(txtAcolumna.getText());

            genA(Afila, Acol);
        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (java.lang.RuntimeException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }

    }//GEN-LAST:event_JButtonMatAActionPerformed

    private void JButtonMultiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonMultiplicarActionPerformed
        try {
            int r, i, j, S = 0;
            int Afila = Integer.parseInt(txtAfila.getText());
            int Acol = Integer.parseInt(txtAcolumna.getText());
            int Bfila = Integer.parseInt(txtBfila.getText());
            int Bcol = Integer.parseInt(txtBcolumna.getText());

            if (Acol != Bfila) {

                JOptionPane.showMessageDialog(null, "Las columnas de A deben ser igual a las filas de B "
                        + "\npara que se pueda multiplicar ");

            } else {

                genC(Afila, Bcol);

                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Bcol; j++) {

                        for (r = 0; r < Acol; r++) {

                            S = S + Integer.parseInt(modeloA.getValueAt(i, r).toString()) * Integer.parseInt(modeloB.getValueAt(r, j).toString());

                        }

                        modeloC.setValueAt(S + "", i, j);
                        S = 0;

                    }
                }
            }
        } catch (java.lang.RuntimeException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Hubo un error", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_JButtonMultiplicarActionPerformed

    private void jMenuItemSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemSalirActionPerformed

        if (evt.getSource() == jMenuItemSalir) {
            System.exit(0);
        }
    }//GEN-LAST:event_jMenuItemSalirActionPerformed

    private void jMenuHerramientasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuHerramientasMouseClicked

    }//GEN-LAST:event_jMenuHerramientasMouseClicked

    private void jMenuItemmathMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItemmathMouseClicked

    }//GEN-LAST:event_jMenuItemmathMouseClicked

    private void jButtonMatBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonMatBActionPerformed
        try {
            int Bfila = Integer.parseInt(txtBfila.getText());
            int Bcol = Integer.parseInt(txtBcolumna.getText());

            genB(Bfila, Bcol);
        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (java.lang.RuntimeException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonMatBActionPerformed

    private void jButtonEscalarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscalarActionPerformed
        try {
            if (evt.getSource() == jButtonEscalar) {
                String entradaUsuario;
                int num_xescalar;

                entradaUsuario = JOptionPane.showInputDialog("Introduzca el escalar que se le va multiplicar:");
                num_xescalar = Integer.parseInt(entradaUsuario);

                int i, j, S = 0;
                int Afila = Integer.parseInt(txtAfila.getText());
                int Acol = Integer.parseInt(txtAcolumna.getText());

                genC(Afila, Acol);

                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Acol; j++) {

                        S = Integer.parseInt(modeloA.getValueAt(i, j).toString()) * num_xescalar;
                        modeloC.setValueAt(S + "", i, j);
                        S = 0;

                    }
                }
            }
        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (java.lang.RuntimeException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonEscalarActionPerformed

    private void JButtonRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonRestaActionPerformed
        try {
            int i, j, S = 0;
            int Afila = Integer.parseInt(txtAfila.getText());
            int Acol = Integer.parseInt(txtAcolumna.getText());
            int Bfila = Integer.parseInt(txtBfila.getText());
            int Bcol = Integer.parseInt(txtBcolumna.getText());

            if (Acol != Bcol || Afila != Bfila) {

                JOptionPane.showMessageDialog(null, "Las columnas de la matriz A debe ser igual a las de B "
                        + "\ny las filas de la matriz de A igual a las de B");

            } else {
                genC(Afila, Bcol);

                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Bcol; j++) {

                        S = S + Integer.parseInt(modeloA.getValueAt(i, j).toString()) - Integer.parseInt(modeloB.getValueAt(i, j).toString());
                        modeloC.setValueAt(S + "", i, j);
                        S = 0;

                    }
                }
            }
        } catch (java.lang.RuntimeException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_JButtonRestaActionPerformed

    private void jMenuItemCreadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemCreadorActionPerformed
        if (evt.getSource() == jMenuItemCreador) {
            JOptionPane.showMessageDialog(null, "Este programa fue creado por el 6to Grupo del"
                    + "\n III Ciclo de Ingeniería de Sistemas conformado por:"
                    + "\n Roca Hormaza Joan"
                    + "\n Fabian Sinti Estefany"
                    + "\n Medrano Quispe Samuel"
                    + "\n Muñoz Ingaruca Carlos"
                    + "\n\t\t\t Gracias.");
        }
    }//GEN-LAST:event_jMenuItemCreadorActionPerformed

    private void jButtonNulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNulaActionPerformed
        try {
            if (evt.getSource() == jButtonNula) {

                int i, j, S = 0;
                int Afila = Integer.parseInt(txtAfila.getText());
                int Acol = Integer.parseInt(txtAcolumna.getText());

                genC(Afila, Acol);

                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Acol; j++) {

                        if (Integer.parseInt(modeloA.getValueAt(i, j).toString()) == 0) {
                            S++;
                        }
                    }
                }
                if (S == (Afila * Acol)) {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ ES NULA", "Mathrices", JOptionPane.INFORMATION_MESSAGE, imagenes("Buena2.png", 40, 40));

                } else {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ NO ES NULA", "Mathrices", JOptionPane.INFORMATION_MESSAGE, image("Mala2.png", 40, 40));

                }
            }
        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (java.lang.RuntimeException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonNulaActionPerformed

    private void jButtonTriangularesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTriangularesActionPerformed
        try {
            if (evt.getSource() == jButtonTriangulares) {

                int i, j, S = 0, s = 0, C = 0;
                int Afila = Integer.parseInt(txtAfila.getText());
                int Acol = Integer.parseInt(txtAcolumna.getText());

                genC(Afila, Acol);
                //Triangular superior
                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Acol; j++) {

                        if (i > j) {
                            s = s + Integer.parseInt(modeloA.getValueAt(i, j).toString());
                        }
                    }
                }
                //Trinagular Inferior
                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Acol; j++) {

                        if (j > i) {
                            S = S + Integer.parseInt(modeloA.getValueAt(i, j).toString());
                        }
                    }
                }
                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Acol; j++) {

                        if (Integer.parseInt(modeloA.getValueAt(i, j).toString()) == 0) {
                            C++;
                        }
                    }
                }
                if (s == 0 && C != Afila * Acol) {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ ES TRIANGULAR SUPERIOR", "Mathrices", JOptionPane.INFORMATION_MESSAGE, imagenes("Buena2.png", 40, 40));

                } else {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ NO ES TRIANGULAR SUPERIOR", "Mathrices", JOptionPane.INFORMATION_MESSAGE, image("Mala2.png", 40, 40));

                }
                if (S == 0 && C != Afila * Acol) {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ TRIANGULAR INFERIOR", "Mathrices", JOptionPane.INFORMATION_MESSAGE, imagenes("Buena2.png", 40, 40));

                } else {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ NO ES TRIANGULAR INFERIOR", "Mathrices", JOptionPane.INFORMATION_MESSAGE, image("Mala2.png", 40, 40));

                }
            }
        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error algo salió mal ", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonTriangularesActionPerformed

    private void JButtonIdentidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonIdentidadActionPerformed
        try {
            if (evt.getSource() == JButtonIdentidad) {

                int i, j;
                int Afila = Integer.parseInt(txtAfila.getText());
                int Acol = Integer.parseInt(txtAcolumna.getText());

                genC(Afila, Acol);
                //Identidad
                int c = 0, f = 0;
                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Acol; j++) {

                        if (i == j) {

                            if (Integer.parseInt(modeloA.getValueAt(i, j).toString()) == 1) {
                                c++;
                            }
                        } else {
                            f = f + (Integer.parseInt(modeloA.getValueAt(i, j).toString()));
                        }
                    }
                }
                if (c == Afila && f == 0) {

                    JOptionPane.showMessageDialog(null, "ES UNA MATRIZ IDENTIDAD", "Mathrices", JOptionPane.INFORMATION_MESSAGE, imagenes("Buena2.png", 40, 40));

                } else {

                    JOptionPane.showMessageDialog(null, "NO ES UNA MATRIZ IDENTIDAD ", "Mathrices", JOptionPane.INFORMATION_MESSAGE, image("Mala2.png", 40, 40));

                }
            }
        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_JButtonIdentidadActionPerformed

    private void jButtonDiagonalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDiagonalActionPerformed
        try {
            if (evt.getSource() == jButtonDiagonal) {

                int i, j;
                int Afila = Integer.parseInt(txtAfila.getText());
                int Acol = Integer.parseInt(txtAcolumna.getText());

                genC(Afila, Acol);
                //Diagonal
                int d = 0, S = 0;
                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Acol; j++) {

                        if (i != j) {

                            if (Integer.parseInt(modeloA.getValueAt(i, j).toString()) == 0) {
                                d++;
                            }
                        }
                    }
                }
                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Acol; j++) {

                        if (Integer.parseInt(modeloA.getValueAt(i, j).toString()) == 0) {
                            S++;
                        }
                    }
                }

                if (d == (Afila * Acol) - Acol && (S != Afila * Acol)) {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ ES DIAGONAL", "Mathrices", JOptionPane.INFORMATION_MESSAGE, imagenes("/imagenes/Buena2.png", 40, 40));

                } else {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ NO ES DIAGONAL", "Mathrices", JOptionPane.INFORMATION_MESSAGE, image("/imagenes/Mala2.png", 40, 40));

                }
            }
        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \n no deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonDiagonalActionPerformed

    private void jButtonEscalar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEscalar2ActionPerformed
        try {
            if (evt.getSource() == jButtonEscalar2) {

                int i, j;
                int Afila = Integer.parseInt(txtAfila.getText());
                int Acol = Integer.parseInt(txtAcolumna.getText());

                genC(Afila, Acol);
                //escalar
                int e = 0, l = 0, S = 0;
                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Acol; j++) {

                        if (i == j) {
                            if (Integer.parseInt(modeloA.getValueAt(i, j).toString()) == Integer.parseInt(modeloA.getValueAt(0, 0).toString())) {
                                e++;
                            }
                        } else {
                            l = l + Integer.parseInt(modeloA.getValueAt(i, j).toString());
                        }
                    }
                }
                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Acol; j++) {

                        if (Integer.parseInt(modeloA.getValueAt(i, j).toString()) == 0) {
                            S++;
                        }
                    }
                }

                if (l == 0 && e == Afila && S != (Afila * Acol)) {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ ES ESCALAR", "Mathrices", JOptionPane.INFORMATION_MESSAGE, imagenes("/imagenes/Buena2.png", 40, 40));

                } else {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ NO ES ESCALAR", "Mathrices", JOptionPane.INFORMATION_MESSAGE, image("/imagenes/Mala2.png", 40, 40));

                }
            }
        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonEscalar2ActionPerformed

    private void jButtonTransActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTransActionPerformed
        try {
            if (evt.getSource() == jButtonTrans) {

                int i, j;
                int Afila = Integer.parseInt(txtAfila.getText());
                int Acol = Integer.parseInt(txtAcolumna.getText());

                genC(Afila, Acol);

                JFrame ventanaRespuesta = new JFrame("Su transpuesta es: ");
                ventanaRespuesta.setBounds(0, 0, 120, 120);
                ventanaRespuesta.setLocationRelativeTo(null);

                JTextArea jtA = new JTextArea(20, 20);
                jtA.setBackground(new Color(246, 245, 245));
                jtA.setForeground(new Color(51, 51, 51));
                String trans = ""; //variable para guardar lo del arreglo a mostrar

                //ciclo para mostrar el arreglo que se recibe...
                for (j = 0; j < Acol; j++) {
                    for (i = 0; i < Afila; i++) {
                        trans += "[" + Integer.parseInt(modeloA.getValueAt(i, j).toString()) + "]   ";
                    }
                    trans += "\n";
                }

                jtA.setText(trans);

                ventanaRespuesta.add(jtA);
                ventanaRespuesta.setResizable(false);
                ventanaRespuesta.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                ventanaRespuesta.setVisible(true);

            }
        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonTransActionPerformed

    private void jButtonSimetricaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSimetricaActionPerformed
        try {
            if (evt.getSource() == jButtonSimetrica) {

                int i, j;
                int Afila = Integer.parseInt(txtAfila.getText());
                int Acol = Integer.parseInt(txtAcolumna.getText());

                genC(Afila, Acol);
                //simetrica
                int c = 0;
                for (i = 0; i < Afila; i++) {
                    for (j = 0; j < Acol; j++) {
                        if (Integer.parseInt(modeloA.getValueAt(i, j).toString()) == Integer.parseInt(modeloA.getValueAt(j, i).toString())) {
                            c = c + 1;
                        }
                    }
                }
                if (c == Afila * Acol) {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ ES SIMÉTRICA", "Mathrices", JOptionPane.INFORMATION_MESSAGE, imagenes("/imagenes/Buena2.png", 40, 40));

                } else {

                    JOptionPane.showMessageDialog(null, "SU MATRIZ NO ES SIMÉTRICA", "Mathrices", JOptionPane.INFORMATION_MESSAGE, image("/imagenes/Mala2.png", 40, 40));
                }
            }
        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonSimetricaActionPerformed

    private void jButtonTrazaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTrazaActionPerformed
        try {
            if (evt.getSource() == jButtonTraza) {

                int i, j, S = 0;
                int Afila = Integer.parseInt(txtAfila.getText());
                int Acol = Integer.parseInt(txtAcolumna.getText());

                genC(Afila, Acol);

                if (Afila == Acol) {

                    for (i = 0; i < Acol; i++) {

                        j = i;
                        S = S + Integer.parseInt(modeloA.getValueAt(i, j).toString());

                    }
                    JOptionPane.showMessageDialog(null, "La traza de su matriz es: "
                            + "" + S);
                } else {

                    JOptionPane.showMessageDialog(null, "Solo se cálcula la traza de matrices cuadradas"
                            + "\nsino sabes lo que es una matriz cuadrada ve a ayuda."
                            + "\n#Adminstradora: 959989011");

                }
            }
        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_jButtonTrazaActionPerformed

    private void jMenuItemmathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemmathActionPerformed
        if (evt.getSource() == jMenuItemmath) {

            JOptionPane.showMessageDialog(null, "Estamos trabajando en esto");

        }
    }//GEN-LAST:event_jMenuItemmathActionPerformed

    private void JButtonSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_JButtonSumaActionPerformed
        try {
            int i, j, S = 0;
            int Afila = Integer.parseInt(txtAfila.getText());
            int Acol = Integer.parseInt(txtAcolumna.getText());
            int Bfila = Integer.parseInt(txtBfila.getText());
            int Bcol = Integer.parseInt(txtBcolumna.getText());

            if (Acol != Bcol || Afila != Bfila) {

                JOptionPane.showMessageDialog(null, "Las columnas de la matriz A debe ser igual a las de B "
                        + "\ny las filas de la matriz de A igual a las de B");

            } else {

                genC(Afila, Bcol);

                for (i = 0; i < Afila; i++) {

                    for (j = 0; j < Bcol; j++) {

                        S = Integer.parseInt(modeloA.getValueAt(i, j).toString()) + Integer.parseInt(modeloB.getValueAt(i, j).toString());
                        modeloC.setValueAt(S + "", i, j);
                        S = 0;

                    }
                }
            }
        } catch (java.lang.RuntimeException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_JButtonSumaActionPerformed

    private void txtAcolumnaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtAcolumnaKeyTyped
        char cTeclaPress = evt.getKeyChar();

        if (cTeclaPress == KeyEvent.VK_ENTER) {

            JButtonMatA.doClick();

        }
    }//GEN-LAST:event_txtAcolumnaKeyTyped

    private void txtBcolumnaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtBcolumnaKeyTyped
        char cTeclaPress = evt.getKeyChar();

        if (cTeclaPress == KeyEvent.VK_ENTER) {

            jButtonMatB.doClick();

        }
    }//GEN-LAST:event_txtBcolumnaKeyTyped

    private void jButtonDeterminanteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonDeterminanteActionPerformed
        try {
            int Afila = Integer.parseInt(txtAfila.getText());
            int Acol = Integer.parseInt(txtAcolumna.getText());

            int x = 0, a, b, c, d;
            int matriz[][] = new int[Afila][Acol];
            if (Afila == Acol) {

                if (Afila == 1 && Acol == 1) {
                    matriz[0][0] = Integer.parseInt(modeloA.getValueAt(0, 0).toString());
                    JOptionPane.showInputDialog("La determinante es: " + matriz[0][0]);
                } //JOptionPane.showInputDialog("La determinante es: "+matriz[0][0]);
                else if (Afila == 2) {
                    matriz[0][0] = Integer.parseInt(modeloA.getValueAt(0, 0).toString());
                    matriz[1][0] = Integer.parseInt(modeloA.getValueAt(1, 0).toString());
                    matriz[0][1] = Integer.parseInt(modeloA.getValueAt(0, 1).toString());
                    matriz[1][1] = Integer.parseInt(modeloA.getValueAt(1, 1).toString());
                    x = (matriz[0][0] * matriz[1][1]) - (matriz[0][1] * matriz[1][0]);
                    JOptionPane.showMessageDialog(null, "La determinante es: " + x);
                    //JOptionPane.showMessageDialog(null, "La determinante es: "+x);
                } else if (Afila == 3) {
                    matriz[0][0] = Integer.parseInt(modeloA.getValueAt(0, 0).toString());
                    matriz[1][0] = Integer.parseInt(modeloA.getValueAt(1, 0).toString());
                    matriz[0][1] = Integer.parseInt(modeloA.getValueAt(0, 1).toString());
                    matriz[1][1] = Integer.parseInt(modeloA.getValueAt(1, 1).toString());
                    matriz[2][0] = Integer.parseInt(modeloA.getValueAt(2, 0).toString());
                    matriz[1][2] = Integer.parseInt(modeloA.getValueAt(1, 2).toString());
                    matriz[0][2] = Integer.parseInt(modeloA.getValueAt(0, 2).toString());
                    matriz[2][1] = Integer.parseInt(modeloA.getValueAt(2, 1).toString());
                    matriz[2][2] = Integer.parseInt(modeloA.getValueAt(2, 2).toString());
                    x = ((matriz[0][0] * matriz[1][1] * matriz[2][2]) + (matriz[1][0] * matriz[2][1] * matriz[0][2]) + (matriz[2][0] * matriz[0][1] * matriz[1][2])) - ((matriz[0][2] * matriz[1][1] * matriz[2][0]) + (matriz[1][2] * matriz[2][1] * matriz[0][0]) + (matriz[2][2] * matriz[0][1] * matriz[1][0]));
                    JOptionPane.showMessageDialog(null, "La determinante es: " + x);
                }//JOptionPane.showInputDialog("La determinante es: "+x);}
                else if (Afila == 4) {
                    matriz[0][0] = Integer.parseInt(modeloA.getValueAt(0, 0).toString());
                    matriz[1][0] = Integer.parseInt(modeloA.getValueAt(1, 0).toString());
                    matriz[0][1] = Integer.parseInt(modeloA.getValueAt(0, 1).toString());
                    matriz[1][1] = Integer.parseInt(modeloA.getValueAt(1, 1).toString());
                    matriz[2][0] = Integer.parseInt(modeloA.getValueAt(2, 0).toString());
                    matriz[1][2] = Integer.parseInt(modeloA.getValueAt(1, 2).toString());
                    matriz[0][2] = Integer.parseInt(modeloA.getValueAt(0, 2).toString());
                    matriz[2][1] = Integer.parseInt(modeloA.getValueAt(2, 1).toString());
                    matriz[2][2] = Integer.parseInt(modeloA.getValueAt(2, 2).toString());
                    matriz[0][3] = Integer.parseInt(modeloA.getValueAt(0, 3).toString());
                    matriz[1][3] = Integer.parseInt(modeloA.getValueAt(1, 3).toString());
                    matriz[2][3] = Integer.parseInt(modeloA.getValueAt(2, 3).toString());
                    matriz[3][0] = Integer.parseInt(modeloA.getValueAt(3, 0).toString());
                    matriz[3][1] = Integer.parseInt(modeloA.getValueAt(3, 1).toString());
                    matriz[3][2] = Integer.parseInt(modeloA.getValueAt(3, 2).toString());
                    matriz[3][3] = Integer.parseInt(modeloA.getValueAt(3, 3).toString());
                    if (matriz[0][0] >= 0) {
                        a = matriz[0][3] * (((matriz[1][0] * matriz[2][1] * matriz[3][2]) + (matriz[2][0] * matriz[3][1] * matriz[1][2]) + (matriz[3][0] * matriz[1][1] * matriz[2][2])) - ((matriz[1][2] * matriz[2][1] * matriz[3][0]) + (matriz[2][2] * matriz[3][1] * matriz[1][0]) + (matriz[3][2] * matriz[1][1] * matriz[2][0])));
                        b = matriz[1][3] * (((matriz[0][0] * matriz[2][1] * matriz[3][2]) + (matriz[2][0] * matriz[3][1] * matriz[0][2]) + (matriz[3][0] * matriz[0][1] * matriz[2][2])) - ((matriz[0][2] * matriz[2][1] * matriz[3][0]) + (matriz[2][2] * matriz[3][1] * matriz[0][0]) + (matriz[3][2] * matriz[0][1] * matriz[2][0])));
                        c = matriz[2][3] * (((matriz[0][0] * matriz[1][1] * matriz[3][2]) + (matriz[1][0] * matriz[3][1] * matriz[0][2]) + (matriz[3][0] * matriz[0][1] * matriz[1][2])) - ((matriz[0][2] * matriz[1][1] * matriz[3][0]) + (matriz[1][2] * matriz[3][1] * matriz[0][0]) + (matriz[3][2] * matriz[0][1] * matriz[1][0])));
                        d = matriz[3][3] * (((matriz[0][0] * matriz[1][1] * matriz[2][2]) + (matriz[1][0] * matriz[2][1] * matriz[0][2]) + (matriz[2][0] * matriz[0][1] * matriz[1][2])) - ((matriz[0][2] * matriz[1][1] * matriz[2][0]) + (matriz[1][2] * matriz[2][1] * matriz[0][0]) + (matriz[2][2] * matriz[0][1] * matriz[1][0])));
                        x = -a + b - c + d;
                        JOptionPane.showMessageDialog(null, "La determinante es: " + x);
                    }//  JOptionPane.showInputDialog("La determinante es: "+x);}
                    else if (matriz[0][0] < 0) {
                        a = matriz[0][3] * (((matriz[1][0] * matriz[2][1] * matriz[3][2]) + (matriz[2][0] * matriz[3][1] * matriz[1][2]) + (matriz[3][0] * matriz[1][1] * matriz[2][2])) - ((matriz[1][2] * matriz[2][1] * matriz[3][0]) + (matriz[2][2] * matriz[3][1] * matriz[1][0]) + (matriz[3][2] * matriz[1][1] * matriz[2][0])));
                        b = matriz[1][3] * (((matriz[0][0] * matriz[2][1] * matriz[3][2]) + (matriz[2][0] * matriz[3][1] * matriz[0][2]) + (matriz[3][0] * matriz[0][1] * matriz[2][2])) - ((matriz[0][2] * matriz[2][1] * matriz[3][0]) + (matriz[2][2] * matriz[3][1] * matriz[0][0]) + (matriz[3][2] * matriz[0][1] * matriz[2][0])));
                        c = matriz[2][3] * (((matriz[0][0] * matriz[1][1] * matriz[3][2]) + (matriz[1][0] * matriz[3][1] * matriz[0][2]) + (matriz[3][0] * matriz[0][1] * matriz[1][2])) - ((matriz[0][2] * matriz[1][1] * matriz[3][0]) + (matriz[1][2] * matriz[3][1] * matriz[0][0]) + (matriz[3][2] * matriz[0][1] * matriz[1][0])));
                        d = matriz[3][3] * (((matriz[0][0] * matriz[1][1] * matriz[2][2]) + (matriz[1][0] * matriz[2][1] * matriz[0][2]) + (matriz[2][0] * matriz[0][1] * matriz[1][2])) - ((matriz[0][2] * matriz[1][1] * matriz[2][0]) + (matriz[1][2] * matriz[2][1] * matriz[0][0]) + (matriz[2][2] * matriz[0][1] * matriz[1][0])));
                        x = a - b + c - d;
                        JOptionPane.showMessageDialog(null, "La determinante es: " + x);
                    }//  JOptionPane.showInputDialog("La determinante es: "+x);}
                } else { //if(Afila>4){
                    JOptionPane.showMessageDialog(null, "Disculpe estamos trabajando en esto");
                }
            } else {

                JOptionPane.showMessageDialog(null, "Disculpe tiene que ser una matriz cuadrada");

            }

        } catch (java.lang.NumberFormatException e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos\n(Solo ingrese números y \nno deje espacios en blanco)", "Mathrices", JOptionPane.WARNING_MESSAGE);

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, "Error al ingreso de datos", "Mathrices", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButtonDeterminanteActionPerformed

    private void jMenuHerramientasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuHerramientasActionPerformed

    }//GEN-LAST:event_jMenuHerramientasActionPerformed

    private void jMenuItemMath3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMath3ActionPerformed
        if (evt.getSource() == jMenuItemMath3) {
            txtAfila.setText("3");
            txtAcolumna.setText("3");
            txtBfila.setText("3");
            txtBcolumna.setText("3");

            JButtonMatA.doClick();
            jButtonMatB.doClick();
        }
    }//GEN-LAST:event_jMenuItemMath3ActionPerformed

    private void jMenuItemMath4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMath4ActionPerformed
        if (evt.getSource() == jMenuItemMath4) {
            txtAfila.setText("4");
            txtAcolumna.setText("4");
            txtBfila.setText("4");
            txtBcolumna.setText("4");

            JButtonMatA.doClick();
            jButtonMatB.doClick();
        }
    }//GEN-LAST:event_jMenuItemMath4ActionPerformed

    private void jMenuItemMath5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMath5ActionPerformed
        if (evt.getSource() == jMenuItemMath5) {
            txtAfila.setText("5");
            txtAcolumna.setText("5");
            txtBfila.setText("5");
            txtBcolumna.setText("5");

            JButtonMatA.doClick();
            jButtonMatB.doClick();
        }
    }//GEN-LAST:event_jMenuItemMath5ActionPerformed

    private void jMenuItemMath6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemMath6ActionPerformed
        if (evt.getSource() == jMenuItemMath6) {

            txtAfila.setText("6");
            txtAcolumna.setText("6");
            txtBfila.setText("6");
            txtBcolumna.setText("6");

            JButtonMatA.doClick();
            jButtonMatB.doClick();
        }
    }//GEN-LAST:event_jMenuItemMath6ActionPerformed

    private void jMenuAyudaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuAyudaMouseClicked
        if (evt.getSource() == jMenuAyuda) {
            Ventana_ayuda ent = new Ventana_ayuda();
            ent.setVisible(true);
        }
    }//GEN-LAST:event_jMenuAyudaMouseClicked

    private void jMenuItemInstruccionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemInstruccionesActionPerformed
        if (evt.getSource() == jMenuItemInstrucciones) {

            JOptionPane.showMessageDialog(this, "Para la evaluación de su matriz se le recomienda que "
                    + "\nsea cuadrada y además que solo se evaluara la matrizA"
                    + "\n y no la B para cuando usted quiera las propiedades como "
                    + "\nsaber si es diagonal, triangular, nula, identidad, y así. "
                    + "\nSi quiere hacer operaciones entre dos matrices tiene"
                    + "\nque ingresar valores en todas las celdas de la matriz"
                    + "\nGracias.");

        }
    }//GEN-LAST:event_jMenuItemInstruccionesActionPerformed

    private void genA(int fil, int col) {

        modeloA.setRowCount(fil);
        modeloA.setColumnCount(col);
        TablaA.setModel(modeloA);
    }

    private void genB(int fil, int col) {
        modeloB.setRowCount(fil);
        modeloB.setColumnCount(col);
        TablaB.setModel(modeloB);
    }

    private void genC(int fil, int col) {
        modeloC.setColumnCount(col);
        modeloC.setRowCount(fil);
        TablaResultado.setModel(modeloC);
    }

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
            java.util.logging.Logger.getLogger(Interfaz_Mathrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Mathrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Mathrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Mathrices.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Mathrices().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton JButtonIdentidad;
    private javax.swing.JButton JButtonMatA;
    private javax.swing.JButton JButtonMultiplicar;
    private javax.swing.JButton JButtonResta;
    private javax.swing.JButton JButtonSuma;
    private javax.swing.JPanel JPanelPrimero;
    private javax.swing.JPanel JPanelSegundo;
    private javax.swing.JTable TablaA;
    private javax.swing.JTable TablaB;
    private javax.swing.JTable TablaResultado;
    private javax.swing.JButton jButtonDeterminante;
    private javax.swing.JButton jButtonDiagonal;
    private javax.swing.JButton jButtonEscalar;
    private javax.swing.JButton jButtonEscalar2;
    private javax.swing.JButton jButtonMatB;
    private javax.swing.JButton jButtonNula;
    private javax.swing.JButton jButtonSimetrica;
    private javax.swing.JButton jButtonTrans;
    private javax.swing.JButton jButtonTraza;
    private javax.swing.JButton jButtonTriangulares;
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JLabel jLabelColumnasA;
    private javax.swing.JLabel jLabelColumnasB;
    private javax.swing.JLabel jLabelDerechos;
    private javax.swing.JLabel jLabelFilasA;
    private javax.swing.JLabel jLabelFilasB;
    private javax.swing.JLabel jLabelFondo;
    private javax.swing.JLabel jLabelTitulo;
    private javax.swing.JMenu jMenuAcercade;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenu jMenuHerramientas;
    private javax.swing.JMenuItem jMenuItemCreador;
    private javax.swing.JMenuItem jMenuItemInstrucciones;
    private javax.swing.JMenuItem jMenuItemMath3;
    private javax.swing.JMenuItem jMenuItemMath4;
    private javax.swing.JMenuItem jMenuItemMath5;
    private javax.swing.JMenuItem jMenuItemMath6;
    private javax.swing.JMenuItem jMenuItemSalir;
    private javax.swing.JMenuItem jMenuItemmath;
    private javax.swing.JMenu jMenuopciones;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTextField txtAcolumna;
    private javax.swing.JTextField txtAfila;
    private javax.swing.JTextField txtBcolumna;
    private javax.swing.JTextField txtBfila;
    // End of variables declaration//GEN-END:variables
}
