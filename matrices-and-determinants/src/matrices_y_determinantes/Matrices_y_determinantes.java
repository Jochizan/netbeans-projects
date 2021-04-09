package matrices_y_determinantes;

import java.util.Scanner;
import java.awt.Frame;

public class Matrices_y_determinantes {

    public static void main(String[] args) {
        
        int x, y, op;
        Scanner entrada = new Scanner(System.in);
        
        System.out.print("-----------------------------------------------------------------"
                + "\n\t\033[Bienvenido a Mathrices"
                + "\n Ingrese qué es lo que quiere hacer:"
                + "\n1\tOperación entre 2 matrices"
                + "\n2\tReconomiento de una matriz"
                + "\n------------------------------------------------------------------------");
        op = entrada.nextInt();
        
        if(op == 2){
        
        System.out.print("Ingrese el subíndice 'i' de la matriz: ");
        int i = entrada.nextInt();
        
        System.out.print("Ingrese el subíndice 'j' de la matriz: ");
        int j = entrada.nextInt();
        
        int matrizN[][] = new int [i][j];
        
        for( x = 0; x < matrizN.length; x++){
            
            for( y = 0; y < matrizN[x].length; y++){
            
                System.out.print("Ingrese el valor de la posición matrizN[" + x + "][" + y + "]: ");
                matrizN[x][y] = entrada.nextInt();
                
            }
        }
        
        System.out.println("Su matriz es la siguiente: ");
        
        for( x = 0; x < i; x++){
            
            for( y = 0; y < j; y++){
                
                        
                    System.out.print("[" + matrizN[x][y] + "]");
                
            }
            System.out.println("");
        }
    }
    }    
}
