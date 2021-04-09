package ecuaciones_1;

import javax.swing.JOptionPane;

/**
 *
 * @author Rem3
 */
public class Cuadrática_01 {
    
    int a=0;
    int b=0;
    int c=0;
    
    public Cuadrática_01(){
        
         a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de a: "));
         b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de b: "));
         c = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el valor de c: "));
         double determinante = Math.pow(b, 2) - (4*a*c);
         
         if (determinante >= 0) {
             
             double x1 = (b*(-1) + Math.sqrt(determinante))/(2*a);
             double x2 = (b*(-1) - Math.sqrt(determinante))/(2*a);
             System.out.println("El valor de x1 = " + x1 + " y el de x2 = " + x2);
             
         }else{
             
             System.out.println("El determinante es negativo y no se puede completar la operación");
             
         }
    }
    public static void main(String[] args) {
        
        new Cuadrática_01();
    }
}
