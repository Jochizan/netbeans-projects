import java.util.Scanner;

public class Pregunta_9{
  public static void main(String args[]){
      //varaibles:
      int a, n; 
      double raiz;
      Scanner valor = new Scanner(System.in);
      //entrada:
      System.out.println("Ingrese el radicando. ");
      a = valor.nextInt();
      
      System.out.println("Ingrese el índice del radical. ");
      n = valor.nextInt();
      
      if(a > 0 && n > 0){
          //proceso:
          raiz = Math.pow(a, 1.0/n);
          //salida1:
          System.out.println("La raiz es: " + raiz);
          
      }if(a <= 0 || n <= 0){
          //salida2:
          System.out.println("Uno o los valores ingresados son inválidos.");
      }
  }
}