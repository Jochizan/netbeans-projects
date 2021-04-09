package clases_AlgotrimiaP;

import java.util.Scanner;

public class Pregunta_11{
  public static void main(String args[]){
  
      int  n, n1, r;
      Scanner valor = new Scanner(System.in);
      
      System.out.println("Ingrese un número de 5 digitos.");
      n = valor.nextInt(); 
         
       if(n <= 99999 && n >= 10000 || n <= -10000 && n >= -99999){
           
           r = n%10;
           n = n/10;
           n1 = r*10;
      
           r = n%10;
           n = n/10;
           n1 = (n1 + r)*10;
       
           r = n%10;
           n = n/10;
           n1 = (n1 + r)*10;
      
           r = n%10;
           n = n/10;
           n1 = (n1 + r)*10;
       
           n1 = n1 + n;
           
          System.out.println("El número invertido es: " + n1);
         
      }if(n >= 100000 || n <= -100000){
           
          System.out.println("Solo se pidió un número de 5 digitos.");
      
      }if(n > 0 && 9999 <= n){
      
          System.out.println("Solo se pidió un número de 5 digitos.");
      
      }if(-9999 <= n || n > 0){
  
          System.out.println("Solo se pidió un número de 5 digitos.");
          
      }
   }
}