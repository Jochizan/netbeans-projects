package arrays_exp;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Joan
 */
public class Clase_Muestra_Aleatoria {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int x=0, y=0, z=0;
        
        System.out.println("¿Cuántas filas tiene su tabla de datos?");
        try{
        x = entrada.nextInt();
        }catch( java.util.InputMismatchException e){
            System.out.println("Ingrese solo números");
            System.exit(0);
        }
        System.out.println("¿Cuántas columnas tiene su tabla de datos?");
        try{
        y = entrada.nextInt();
        }catch( java.util.InputMismatchException e){
            System.out.println("Ingrese solo números");
            System.exit(0);
        }
        System.out.println("¿Cuál es el límite de edad?");
        try{
        z = entrada.nextInt();
        }catch( java.util.InputMismatchException e){
            System.out.println("Ingrese solo números");
            System.exit(0);
        }
        Random random = new Random();
        
        int Arreglo[][] = new int[x][y];
        
        for (int i = 0; i < x; i++) {
            
            for (int j = 0; j < y; j++) {
                
                Arreglo[i][j] = random.nextInt(z+1);
                
            }
        }
        System.out.println("Esta es la tabla que manejaremos");
        
        for (int i = 0; i < x; i++) {
            
            for (int j = 0; j < y; j++) {
                
                System.out.print("[" + Arreglo[i][j] + "]      ");
                
            }
            System.out.println("");
        }
        System.out.println("Ahora pasaremos a el ordenamiento de los datos aleatorios...");
        int cant;
        int guardado[][] = new int[x][y];
        int edad[] = new int[z+1];
        
        for (int k = 0, n=0, m=0, ñ=0; k < z+1; k++){
             cant=0;
             for (int i = 0; i < x; i++) {
                 
                 for (int j = 0; j < y; j++) {
                      
                      if(Arreglo[i][j] == k){
                                
                          cant++;
                          
                      }
                  }
             }
             if(cant != 0){
             System.out.println("Hay una cantidad de "+cant+" personas que tienen " + k + " años");
             
             guardado[n][m] = cant;
             edad[ñ] = k;         
                  if(m == guardado[0].length-1){
                       n++;
                       m=0;
                  }else{
                       m++;
                  }
                  ñ++;
             }
        }
        int espacios;
        int cantidad=0;
        for (int i = 0, ñ = 0; i < x; i++) {
            espacios=0;
            for (int j = 0; j < y; j++) {
                
               if(guardado[i][j] != 0){ 
               System.out.print("[" + guardado[i][j] +", " + edad[ñ] + " años" + "]  ");
               espacios = guardado[i][j];
               cantidad = cantidad + guardado[i][j];
               ñ++;
               }
            }
            if(espacios != 0){
            System.out.println("");
            }
        }
        System.out.println("La cantidad de datos generados por random es: " + cantidad);
    }
}
