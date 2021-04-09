package clases_AlgotrimiaP;

import java.util.Scanner;

public class Pregunta_18{
  public static void main(String args[]){
      //variables:
      double galones;
      Scanner sc = new Scanner(System.in);
      //entrada:
      System.out.println("¿Cuántos galones se a llenado?");
      galones = sc.nextDouble();
      //proceso y salidas:
       if(galones > 0){
              
          System.out.println("El monto a pagar es de: " + galones*3.785*8.20 + "dólares.");
      
      }if(galones <= 0){
          
          System.out.println("La cantidad de galones no puede ser negativa");
      
      }
   }
}