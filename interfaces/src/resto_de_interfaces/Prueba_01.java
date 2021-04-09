package resto_de_interfaces;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @version 1.0
 * @author Joan
 */
public class Prueba_01 {
    
    private int j,i;
    
    public void Ingresosubij(){
        
        Scanner teclado = new Scanner(System.in);
        String num_i, num_j;
        
            
            System.out.print("Ingrese el subíndice i: ");
            num_i = teclado.nextLine();
           
            System.out.print("Ingrese el subíndice j: ");
            num_j = teclado.nextLine();
            
            i = Integer.parseInt(num_i);
            j = Integer.parseInt(num_j);
            
            if(num_i.equals("")||num_j.equals("")){
            
                JOptionPane.showMessageDialog(null, "Por favor rellene las casillas para empezar la evaluación"
                        + "\n y luego cálculo de su matriz.");
                
            } 
            
    }public void Action(){
        
        Scanner entrada = new Scanner(System.in);
        int MatrizM[][] = new int[i][j];
        
        for(int x = 0; x < MatrizM.length;x++){
            
            for(int y = 0; y < MatrizM[x].length; y++){
                
                System.out.print("Ingrese el valor de la posición matrizN[" + x + "][" + y + "]:");
                MatrizM[x][y] = entrada.nextInt();
                
            }
        }
        
        System.out.println("Su matriz es la siguiente: ");
        
        for(int x = 0; x < i; x++){
            
            for(int y = 0; y < j; y++){
                
                        
                    System.out.print("[" + MatrizM[x][y] + "]");
                
            }
            System.out.println("");
        }
    }
    public static void main(String[] args) {
        Prueba_01 ent = new Prueba_01();
        ent.Ingresosubij();
        ent.Action();
    }
}
