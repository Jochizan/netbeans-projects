package clases_AlgotrimiaP;

import java.util.Scanner;

public class Pregunta_12{
  public static void main(String args[]){
      //variables:
      double Precio_P, Dinero_C, Cambio;
      Scanner valor = new Scanner(System.in);
      //entrada:
      System.out.println("Cual es el precio del producto");
      Precio_P = valor.nextDouble();
      
      System.out.println("Cuanto dinero pagaste");
      Dinero_C = valor.nextDouble();
      //proceso:
      Cambio = Dinero_C - Precio_P;
      //salidas:
       if(Dinero_C > Precio_P && Dinero_C > 0 && Precio_P > 0){
          
          System.out.println("EL cambio es: " + Cambio);
      
      }if(Dinero_C < 0 || Precio_P < 0 || Dinero_C < Precio_P ){
          
          System.out.println("A ingresado valores de un caso ilógico.");
      }
  }
}