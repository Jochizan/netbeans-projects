package clases_AlgotrimiaP;

import java.util.Scanner;

public class Pregunta_17{
  public static void main(String args[]){
      //variales:
      double r, área;
      Scanner sc = new Scanner(System.in);
      //entrada:
      System.out.println("Ingrese el radio del círculo");
      r = sc.nextDouble();
      //proceso y salidas:
      if(r > 0){
      
          System.out.println("El área del círculo es: " + 3.14159*Math.pow(r, 2) + "unidades cuadradas");
          
      }if(r <= 0){
      
          System.out.println("El radio ingresasdo es ilógico");
          
      }
   }
}