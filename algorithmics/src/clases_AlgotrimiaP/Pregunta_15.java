package clases_AlgotrimiaP;

import java.util.Scanner;

public class Pregunta_15{
  public static void main(String args[]){
      //variables:
      double I, M, C, t, r;
      Scanner valor = new Scanner(System.in);
      //entrada:
      System.out.println("¿Cuál fue la capital con la que inicio?");
      C = valor.nextDouble();
      
      System.out.println("¿Cuál es la tasa a la que estuvo sujeta su capital?");
      r = valor.nextDouble();
      
      System.out.println("¿Cuál fue el periodo de tiempo?");
      t = valor.nextDouble();
      //proceso:
      M = Math.pow((1 + r/100), t)*C;
      
      I = M - C;
      //salidas:
      if(C > 0 && r > 0 && t > 0){
          
           System.out.println("El valor del interés compuesto fue de: " + I);
      
      }if(C <= 0 || r <= 0 || t <= 0){
          
           System.out.println("Los valores ingresados son ilógicos.");
      }
   }
}