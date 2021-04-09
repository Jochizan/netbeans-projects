package interfaces_gráficas_01;

import  javax.swing.*;
import  java.awt.*;
import  java.awt.event.*;

public class interfaz_F extends JFrame implements ActionListener{
    
    private JLabel label1, labelDepartamento;
    private JButton boton1;
    private JMenu menu1;
    
    public interfaz_F(){
    setLayout(null);
    
    labelDepartamento = new JLabel("Seleciona el Departamento");
    labelDepartamento.setBounds(220,188,180,25);
    labelDepartamento.setFont(new Font("Andale Mono", 1, 12));
    labelDepartamento.setForeground(new Color(255, 255, 255));
    add(labelDepartamento);
    
    label1 = new JLabel("AEA MANO");
    label1.setBounds(150,70,300,200);
    label1.setFont(new Font("New Times Roman", 1, 18));
    add(label1);
            
    }
    public void actionPerformed(ActionEvent e){
    
    }
    public static void main(String[] args) {
        interfaz_F nerd = new interfaz_F();
        nerd.setBounds(0,0,600,600);
        nerd.setVisible(true);
        nerd.setLocationRelativeTo(null);
        nerd.setResizable(false);
        
    }
}