package arrays_exp;

import java.util.Random;
import java.util.Scanner;

public class Array_2D {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int cont=0;
        
        System.out.println("¡Bienvenido!"
                + "\n\nEstas en un juego al azar en donde tus probabilidades"
                + "\nde ganar dependeran de la tabla que elijas."
                + "\n\tTABLAS\tPOSIBILIDADES"
                + "\n\t   2x2\t   25%"
                + "\n\t   3x3\t   11.1%"
                + "\n\t   4x4\t   6.25%"
                + "\n\t   5x5\t   4.00%"
                + "\n\t   6x6\t   2.77%"
                + "\n\t   7x7\t   2.04%"
                + "\n\t   8x8\t   1.56%"
                + "\n\t   9x9\t   1.23%"
                + "\n\t10x10\t   1.00%");
        
        System.out.println("¿Que tabla quiere?");
        int filcol = entrada.nextInt();
        
        Random num = new Random();
        
        int Array2D[][] = new int[filcol][filcol];
        
        for (int i = 0; i < filcol; i++) {
            
            for (int j = 0; j < filcol; j++) {
                
                Array2D[i][j] = num.nextInt(filcol*filcol);
                
            }    
        }
        for (int i = 0; i < filcol; i++) {
            
            for (int j = 0; j < filcol; j++) {
                
                System.out.print("[" + Array2D[i][j] + "]");
                
            }
            System.out.println("");
        }
        System.out.println("Eliga uno de los valores");
        int valor = entrada.nextInt();
        
        for (int i = 0; i < filcol; i++) {
            
            for (int j = 0; j < filcol; j++) {
                
                if(valor == Array2D[i][j]){
                    
                    cont++;
                    
                }       
            }
        }
        int c=0;
        for (int k = 0; k < filcol*filcol; k++) {
            ciclofor:
            for (int i = 0; i < filcol; i++) {
                 
                 for(int j = 0; j < filcol; j++){
                     
                     if (Array2D[i][j] == k) {
                            
                            c++;
                            System.out.println(c);
                            break ciclofor;
                            
                     }
                }
            }
        }
        double probabilidad = ((double)cont/((double)filcol*(double)filcol));
        
        System.out.println("Su probabilidad de ganar es de: " + probabilidad*100 + "%");

        int suerte = num.nextInt(c);
        
        if(suerte == valor){
            
            System.out.println("!Felicidades ganaste¡");
            
        }else{
            
            System.out.println("Suerte para la proxima...");
            
        }
        
    }
}
