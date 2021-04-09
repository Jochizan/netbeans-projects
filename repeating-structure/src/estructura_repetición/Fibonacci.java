package estructura_repetición;

import java.util.Scanner;

public class Fibonacci{
  public static void main(String args[]){
      Scanner leer = new Scanner(System.in);
      int n, f = 0;
      int t1 = 1;
      int t2;
      System.out.println("¿Cuantos números de la serie de Fibonacci quiere generar?");
      n = leer.nextInt();
      for (int i = 1 ; i <= n; i++){
          t2 = f;
          f = t1 + f;
          t1 = t2;
          System.out.println( + t1);
      }   
   }
}
  