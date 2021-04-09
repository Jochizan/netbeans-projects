package programa_de_algoritmia;

import java.util.Scanner;

public class Pregunta_1{
  public static void main(String args[]){
      //variables:
      double radio, área;
      Scanner valor = new Scanner(System.in);
      //entrada:
      System.out.println("Introduzca el radio del círculo");
      radio = valor.nextDouble();
      //proceso:
      área = Math.PI*Math.pow(radio,2);
      //salida:
      if(radio > 0){
      
         System.out.println("El área de la circunferencia es: " + área);
      
      }if(radio <= 0){
       
          System.out.println("El radio no puede ser negativo o cero");
      
      }
   }
}