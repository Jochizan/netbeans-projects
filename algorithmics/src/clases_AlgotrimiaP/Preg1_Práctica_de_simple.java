package clases_AlgotrimiaP;

import java.util.Scanner;

public class Preg1_Práctica_de_simple{
  public static void main(String args[]){
   
    int num_0 = 0;
    Scanner valor = new Scanner(System.in);
    
    System.out.print("Ingrese el valor ");
    num_0 = valor.nextInt();
    
      if(num_0 > 0){
         
          System.out.print("El número es entero y positivo ");
    
     } 
      if(num_0 == 0){
          
          System.out.print("El número es nuetro ");
          
     }
      if(num_0 < 0){
       
          System.out.print("El número es entero y negativo "); 
     }
  }
}