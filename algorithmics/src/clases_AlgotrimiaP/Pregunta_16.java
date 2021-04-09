package clases_AlgotrimiaP;

import java.util.Scanner;

public class Pregunta_16{
  public static void main(String args[]){
      //variables:
      String nombre = "";
      double peso, longitud;
      Scanner valor = new Scanner(System.in);
      //entrada:
      System.out.println("¿Cúal es el nombre del dinosaurio?");
      nombre = valor.nextLine();
      
      System.out.println("¿Cúal es el peso del dinosaurio?");
      peso = valor.nextDouble();
      
      System.out.println("¿Cúal es la longitud del dinosaurio?");
      longitud = valor.nextDouble();
      //proceso y salidas:
      if(peso > 0 && longitud > 0){
          
          System.out.println("El dinosaurio " + nombre + " pesa " + peso*0.453592 + 
                  " y mide " + longitud*0.3048);
      
      }if(peso <= 0 || longitud <= 0){
      
          System.out.println("Los valores ingresados son erróneos.");
          
      }
   }
}