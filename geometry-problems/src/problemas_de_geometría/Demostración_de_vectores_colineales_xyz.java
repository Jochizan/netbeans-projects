package problemas_de_geometría;

import java.util.Scanner;

public class Demostración_de_vectores_colineales_xyz{
public static void main(String[] args) {
        // TODO code application logic here
        Scanner valor = new Scanner(System.in);
        int puntoA [] = new int [3];
           puntoA[0] = 0;
           puntoA[1] = 0;
           puntoA[2] = 0;
           
        for (int x=0; x < puntoA.length-1; x++) {
            
            System.out.println("Introduzca los valor del punto A de la posición [" + x + "]");
            puntoA[x] = valor.nextInt();
      
     }  
        int puntoB [] = new int [3];
           puntoB[0] = 0;
           puntoB[1] = 0;
           puntoB[2] = 0;
           
        for (int x=1; x < puntoB.length; x++) {
            
           System.out.println("Introduzca los valor del punto B de la posición [" + x + "]");
           puntoB[x] = valor.nextInt();
      
     }
           
        puntoB[0] = (puntoB[1]*puntoA[0])/puntoA[1];
        puntoA[2] = (puntoA[1]*puntoB[2])/puntoB[1];
        
        System.out.println("El valor de α es " + puntoB[0] + " y el de β " + puntoA[2] + ".");
     }

}
