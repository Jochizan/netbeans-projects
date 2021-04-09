package clases_AlgotrimiaP;

import java.util.Scanner;

public class Pregunta_20{
  public static void main(String args[]){
      //variables:
      double radio, altura;
      Scanner sc = new Scanner(System.in);
      //entrada:
      System.out.println("¿Cúal es el radio del cilindro?");
      radio = sc.nextDouble();
      
      System.out.println("¿Cúal es la altura del cilindro?");
      altura = sc.nextDouble();
      //proceso y salidas:
      if(radio > 0 && altura > 0){
          
          System.out.println("El área es " + (2*3.14159*Math.pow(radio, 2) + 2*3.14159*radio*altura) +
                  " unidades cuadradas y su volumen " + 3.14159*Math.pow(radio, 2)*altura + " unidades cúbicas.");
      
      }if(radio <=0 || altura <= 0){
          
          System.out.println("El radio o altura son erróneos");
      
      }
   }
}