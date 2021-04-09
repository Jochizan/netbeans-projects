package clases_AlgotrimiaP;

import java.util.Scanner;

public class Pregunta_13{
  public static void main(String args[]){
      //variables:
      int n, Suma_n_p;
      Scanner valor = new Scanner(System.in);
      //entrada:
      System.out.println("Ingrese la n cantidad de número primos quiere sumar");
      n = valor.nextInt();
      //proceso:
      Suma_n_p = (n*(n + 1))/2; 
      //salida:
       if(n >= 0){
           
           System.out.println("La suma de esos n primeros números es: " + Suma_n_p);
           
       }if(n < 0){
           
           System.out.println("El número ingresado es ilógico."); 
           
       }
   }
}