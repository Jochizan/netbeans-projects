package programa_de_algoritmia;

import java.util.Scanner;

public class Pregunta_3{
  public static void main(String args[]){
      //variables:
      double peso, masa;
      Scanner valor = new Scanner(System.in);
      //entrada:
      System.out.println("Ingrese la masa del cuerpo: ");
      masa = valor.nextDouble();
      //proceso:
      peso = masa*9.81;
      //salida:
       if(masa > 0){
          
          System.out.println("El peso de dicho cuerpo es: " + peso + " Newtons");
      
      }if(masa <= 0){
          
          System.out.println("La masa de un cuerpo no puede ser nulo o negativo.");
      
      }
   }
}