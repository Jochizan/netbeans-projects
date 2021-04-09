package clases_AlgotrimiaP;

import java.util.Scanner;

public class Pregunta_10{
  public static void main(String args[]){
      //variables:
      double base, altura, perimetro, superficie;
      Scanner valor = new Scanner(System.in);
      //entrada:
      System.out.println("Ingrese la base del rectangulo.");
      base = valor.nextDouble();
      
      System.out.println("Ingrese la altura del rectangulo.");
      altura = valor.nextDouble();
      
      if(base > 0 && altura > 0){
          //proceso
          perimetro = 2*(base + altura);
          superficie = base * altura;
          //salida1:
          System.out.println("El perimetro del rectángulo es " + perimetro + " y su supeficie " + superficie);
     }if(base <= 0 || altura <= 0){
          //salida2:
          System.out.println("La base o altura son ilógicos.");
     }
  }
}