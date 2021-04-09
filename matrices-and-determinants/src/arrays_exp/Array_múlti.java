package arrays_exp;

import java.util.Scanner;

public class Array_múlti {
    
    public static void main(String[] args) {
        
        int filas, columnas, alturas, contador = 1;
        Scanner entrada = new Scanner(System.in);
  
        System.out.println("¿Cuantas filas deseas?");
        filas = entrada.nextInt(); 
  
        System.out.println("¿Cuantas columnas deseas?");
        columnas = entrada.nextInt();
        
        System.out.println("¿Cuantas alturas desea?");
        alturas = entrada.nextInt();
  
        int números [][][] = new int[alturas][filas][columnas];
        
        for(int k = 0; k < alturas; k++){
  
            for(int i = 0; i < filas; i++){
                
                for(int j = 0; j < columnas; j++){
                        
                    números[k][i][j] = contador;
                    contador++;
                    System.out.print("[" + números [k][i][j] + "]");
                    
                    }
                    System.out.println("");
                    
                }if(k < alturas - 1){
                    
                    System.out.println("^");
                }else{
                    
                    System.out.println("");
                }
            }
            System.out.println("[" + números[2][1][2]+ "]");
            
            int[][][] arreglo3 = { { { 1,2,3,4,5 }, { 2,1,3,4,5 }, { 1,4,3,2,5 } },
                                   { { 5,4,3,2,1 }, { 3,4,2,5,1 }, { 1,5,4,2,3 } } };
            
            System.out.println("[" + arreglo3[1][2][1]+ "]");
        }
    }
