import java.util.Scanner;

public class Pregunta_7{
  public static void main(String args[]){
      //variables:
      int a, n;
      double resultado;
      Scanner valor = new Scanner(System.in);
      //entrada:
      System.out.println("Ingrese la base de la potencia. ");
      a = valor.nextInt();
      
      System.out.println("Ingrese el exponente. ");
      n = valor.nextInt();
      
      if(a > 0 && n > 0){
          //proceso
          resultado = Math.pow(a, n);
          //salida1:
          System.out.println("La potenia es igual a: " + resultado);
          
      }if(a <= 0 || n <= 0){
          //salida2:
          System.out.println("Uno o los valores ingresados son inválidos.");
      }
  }
}