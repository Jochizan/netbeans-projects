package matrices_y_determinantes;

import java.util.Scanner;

public class Matriz_2D{
    
  public static void main(String args[]){
   
    int filas = 0, columnas = 0, contador = 1;
    Scanner entrada = new Scanner(System.in);
  
    System.out.println("¿Cuantas filas deseas?");
    filas = entrada.nextInt(); 
  
    System.out.println("¿Cuantas columnas deseas?");
    columnas = entrada.nextInt();   
  
    int números[][] = new int[filas][columnas];
  
    for(int i = 0; i < filas; i++){
        
        for(int j = 0; j < columnas; j++){
            
           números[i][j] = contador;
           contador++;
           System.out.print("[" + números[i][j] + "]"); 
           
        }
        System.out.println("");
    }
  }
}