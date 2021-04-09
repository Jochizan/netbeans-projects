package folder1;

import java.util.Scanner;

public class Pregunta_4{
  public static void main(String args[]){
      //variable:
      double peso, estatura, IMC;
      Scanner entrada = new Scanner(System.in);
      //entrada:
      System.out.println("Ingrese su peso: ");
      peso = entrada.nextDouble();
      
      System.out.println("Ingrese su estatura: ");
      estatura = entrada.nextDouble();
      //proceso:
      IMC = peso/(Math.pow(estatura, 2));
      //salida:
      if(peso > 0 && estatura > 0){
      
         System.out.println("Su IMC es: " + IMC);
      
     }if(peso <= 0 || estatura <= 0){
         
         System.out.println("El peso o estatura son ilógicos.");
     
     }  
   }
}