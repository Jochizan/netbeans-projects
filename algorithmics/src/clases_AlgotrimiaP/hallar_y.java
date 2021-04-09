package clases_AlgotrimiaP;

import java.util.Scanner;

public class hallar_y{
  public static void main(String args[]){
  
      double x, y;
      Scanner valor = new Scanner(System.in);
      
      System.out.println("Introduzca el valor de x");
      x = valor.nextDouble();
      
      if(x != 0){
          
          y = (Math.pow(x, 3) + 5) / x;
          
          System.out.println("El valor de y es: " + y);
      
      }else {
      
          System.out.println("El valor no puede ser cero");
          
      }
  }
}