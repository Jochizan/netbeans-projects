package clases_AlgotrimiaP;

import java.util.Scanner;

public class Número_3x5{
  public static void main(String args[]){
      //variables:
      int número;
      Scanner valor = new Scanner(System.in);
      //entrada:
      System.out.println("Ingrese el número");
      número = valor.nextInt();
      //salida:
      if(número%15 == 0){
          
          System.out.println("El número " + número + " es múltiplo de 3 y 5. ");
            
      }else{
       
          System.out.println("El número no es múltiplo de 3 y 5. ");
          
      }
   }
}