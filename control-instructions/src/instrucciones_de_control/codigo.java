package instrucciones_de_control;

import javax.swing.JOptionPane;
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import javax.swing.event.*;

public class codigo{
    
    public static void main(String[] args) {
     
        String anm;
        double an;
        anm = JOptionPane.showInputDialog("Ingrese e número");
        an = Double.parseDouble(anm);
        
        System.out.println(an);
    }
}

