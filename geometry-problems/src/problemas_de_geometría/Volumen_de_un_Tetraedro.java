package problemas_de_geometría;

import java.util.Scanner;

public class Volumen_de_un_Tetraedro {

    public static void main(String[] args){
      
     Scanner valor = new Scanner(System.in);
             
      int V;
    
      System.out.println("Recuerde cuando te pida los valores ([0],[1],[2]) se refiere a (x, y, z) respectivamente. ");
              
      int puntoa [] = new int [3];
       puntoa[0] = 0;
       puntoa[1] = 0;
       puntoa[2] = 0;
       
      for (int x=0; x < puntoa.length; x++) {
           
         System.out.println("Introduzca el valor del punto A de la posición [" + x + "]");
         puntoa[x] = valor.nextInt();
      
     }
      int puntob[] = new int [3];
       puntob[0] = 0;
       puntob[1] = 0;
       puntob[2] = 0;
       
       for (int x=0; x < puntob.length; x++) {
            
         System.out.println("Introduzca el valor del punto B de la posición [" + x + "]");
         puntob[x] = valor.nextInt();
      
     }
      
      int puntoc[] = new int [3]; 
       puntoc[0] = 0;
       puntoc[1] = 0;
       puntoc[2] = 0;
       
       for (int x=0; x < puntoc.length; x++){
            
         System.out.println("Introduzca el valor del punto C de la posición [" + x + "]");
         puntoc[x] = valor.nextInt();
      
     }
      
      int puntod[] = new int [3];
       puntod[0] = 0;
       puntod[1] = 0;
       puntod[2] = 0;
       
       for (int x=0; x < puntod.length; x++) {
            
         System.out.println("Introduzca el valor del punto D de la posición [" + x + "]");
         puntod[x] = valor.nextInt();
      
     }
       
      int matriz[][] = new int [3][3];
      
       matriz[0][0] = puntob[0] - puntoa[0];
       matriz[0][1] = puntob[1] - puntoa[1];
       matriz[0][2] = puntob[2] - puntoa[2];
       matriz[1][0] = puntoc[0] - puntoa[0];
       matriz[1][1] = puntoc[1] - puntoa[1];
       matriz[1][2] = puntoc[2] - puntoa[2];
       matriz[2][0] = puntod[0] - puntoa[0];
       matriz[2][1] = puntod[1] - puntoa[1];
       matriz[2][2] = puntod[2] - puntoa[2];
       
       V = Math.abs(((matriz[0][0]*matriz[1][1]*matriz[2][2]) + matriz[1][0]*matriz[2][1]*matriz[0][2] + 
               matriz[0][1]*matriz[1][2]*matriz[2][0]) - (matriz[0][2]*matriz[1][1]*matriz[2][0] + 
               matriz[0][1]*matriz[1][0]*matriz[2][2] + matriz[1][2]*matriz[2][1]*matriz[0][0]))/6; 
       
       System.out.println("El volumen del tetraedro es " + V + " unidades cúbicas.");
    }
}