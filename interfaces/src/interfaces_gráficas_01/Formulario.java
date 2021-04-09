package interfaces_gráficas_01;

import javax.swing.event.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Formulario extends JFrame implements ActionListener,ChangeListener{


  private JButton boton1;   
  private JCheckBox check1;
  private JMenuBar menubar;
  private JMenu menu1,menu2,menu3;
  private JMenuItem item1,item2,item3,item4,item5,item7;
  private JLabel label1,label2,label3,label4,label5;
  private JLabel label6,label7,label8,label9,label10,label11;
  private JComboBox combo1,combo2,combo3,combo4;
  private JTextField field1,field2,field3;

  public Formulario(){
    setLayout(null);

    menubar = new JMenuBar();
    setJMenuBar(menubar);
   
    menu1 = new JMenu("opciones");
    menubar.add(menu1);

    menu2 = new JMenu("fondos");
    menu1.add(menu2);

    menu3 = new JMenu("tamaño de la ventana");
    menu1.add(menu3);

    item1 = new JMenuItem("salir");
    item1.addActionListener(this);
    menu1.add(item1);

    item2 = new JMenuItem("rojo");
    item2.addActionListener(this);
    menu2.add(item2); 

    item3 = new JMenuItem("verde");
    item3.addActionListener(this);
    menu2.add(item3);

    item4 = new JMenuItem("Azul");
    item4.addActionListener(this);
    menu2.add(item4);   

    item5 = new JMenuItem("500*500");
    item5.addActionListener(this);
    menu3.add(item5);


    label1 = new JLabel("nombre:");
    label1.setBounds(10,20,90,30);
    add(label1);

    field1 = new JTextField();
    field1.setBounds(90,20,90,30);
    add(field1);   
 
    label2 = new JLabel("apellido:");
    label2.setBounds(210,20,90,30);
    add(label2);

    field2 = new JTextField();
    field2.setBounds(290,20,90,30);
    add(field2);

    label3 = new JLabel("contraseña:");
    label3.setBounds(10,60,90,30);
    add(label3);

    field3 = new JTextField();
    field3.setBounds(90,60,90,30);
    add(field3);

    label4 = new JLabel("Selecciona tu dia de nasimiento");
    label4.setBounds(150,100,200,30);
    add(label4);

    label5 = new JLabel("Dia:");
    label5.setBounds(10,140,90,30);
    add(label5);

    combo1 = new JComboBox();
    combo1.setBounds(50,140,90,30);
    for(int i = 0;i <= 31;i++){
      combo1.addItem(String.valueOf(i));
    }
    add(combo1);

    label6 = new JLabel("mes:");
    label6.setBounds(150,140,90,30);
    add(label6);

    combo2 = new JComboBox();
    combo2.setBounds(200,140,90,30);  

    combo2.addItem("enero");
    combo2.addItem("febrero");
    combo2.addItem("marso");
    combo2.addItem("abril");
    combo2.addItem("mayo");
    combo2.addItem("junio");
    combo2.addItem("julio");
    combo2.addItem("agosto");
    combo2.addItem("septienbre");
    combo2.addItem("octubre");
    combo2.addItem("nobiembre");
    combo2.addItem("Diciembre");
    add(combo2);

    label7 = new JLabel("año:");
    label7.setBounds(300,140,90,30);
    add(label7);

    combo3 = new JComboBox();
    combo3.setBounds(350,140,90,30);
    for(int i = 2017;i >= 1900;i--){
      combo3.addItem(String.valueOf(i));
    }
    add(combo3);

    label8 = new JLabel("selecciona tu sexo");
    label8.setBounds(200,180,200,30);
    add(label8);

    label9 = new JLabel("sexo:");
    label9.setBounds(10,200,90,30);
    add(label9);

    combo4 = new JComboBox();
    combo4.setBounds(90,200,90,30);
    combo4.addItem("En espera..");
    combo4.addItem("hombre");
    combo4.addItem("mujer");
    add(combo4);

    label10 = new JLabel("acete las condisiones de la pagina");
    label10.setBounds(10,250,250,30);
    add(label10);

    check1 = new JCheckBox("aceptar");
    check1.setBounds(10,300,100,30);
    check1.addChangeListener(this);
    add(check1);


    boton1 = new JButton("aceptar");
    boton1.setBounds(10,350,80,30);
    boton1.addActionListener(this);
    add(boton1);
    boton1.setEnabled(false);
  
    label11 = new JLabel("v.0.10");
    label11.setBounds(400,400,100,30);
    add(label11);
  }
  public void stateChanged(ChangeEvent e){
    if(check1.isSelected() == true){
    
      boton1.setEnabled(true);
    }else {
      boton1.setEnabled(false);
    }
 
  }

  public void actionPerformed(ActionEvent e){
    Container fondo = this.getContentPane();
    if(e.getSource() == item1){
      System.exit(0);
    }
    if(e.getSource() == item2){
      fondo.setBackground(new Color(255,0,0));
    }
    if(e.getSource() == item3){
      fondo.setBackground(new Color(0,255,0));
    }
    if(e.getSource() == item4){
      fondo.setBackground(new Color(0,0,255));
    }
    if(e.getSource() == item5){
      setSize(500,500);
    }
    if(e.getSource() == boton1){
      System.exit(0);
    }    
  }
  public static void main(String[]args){
    Formulario fo = new Formulario();
    fo.setBounds(0,0,600,600);
    fo.setVisible(true);
    fo.setResizable(false);
    fo.setLocationRelativeTo(null);
  }  
}