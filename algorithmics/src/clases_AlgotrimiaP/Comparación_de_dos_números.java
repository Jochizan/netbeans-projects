package clases_AlgotrimiaP;

import java.util.Scanner;

public class Comparación_de_dos_números{
  public static void main(String args[]){
  
      int num_1, num_2;
      Scanner valor = new Scanner(System.in);
      
      System.out.println("Ingresa el número 1");
      num_1 = valor.nextInt();
      
      System.out.println("Ingrese el número 2");
      num_2 = valor.nextInt();
      
      if(num_1 < num_2){
       
          System.out.println("El número 1 es menor que el número 2");
          
      }
      if(num_1 > num_2){
          
          System.out.println("El número 1 es mayor que el número 2");
          
      }
      if(num_1 == num_2){
          
          System.out.println("Los número son iguales");
      
      }
  }
}