package prueba;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
 
public class CalculadoraMatrizJ {
   
    public static void main(String[] args) {        
        
        String ax = System.getProperty("os.name"); //variable que toma el nombre del sistema operativo que se tenga instalado
        
        if(ax.equals("Windows 10") || ax.equals("Windows")){//si es un sistema windows se aplica el skin que tiene java para windows
            try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.windows.WindowsLookAndFeel");
            interfazMatriz1 objClasInteMat = new interfazMatriz1();
            // TODO code application logic here
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        if(ax.equals("Linux")){//si es un sistema linux se aplica el skin que tiene java para linux
            try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
            interfazMatriz1 objClasInteMat = new interfazMatriz1();            
            // TODO code application logic here
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            } catch (InstantiationException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IllegalAccessException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            } catch (UnsupportedLookAndFeelException ex) {
                Logger.getLogger(CalculadoraMatrizJ.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
       
    }
}
