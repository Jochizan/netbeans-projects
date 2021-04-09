package clases_AlgotrimiaP;

import java.util.Scanner;

public class Supermercado{
    
    public static void main(String args[]){

        int num_i = 0;
        double monto_n, monto = 0;
        Scanner sc = new Scanner(System.in);
      
        System.out.println("Ingrese el número entero");
      try{
         num_i = sc.nextInt();
      
         System.out.println("¿Cuál es monto a pagar?");
         monto = sc.nextDouble();
         
      }catch(java.util.InputMismatchException e){
          
          System.out.println("Solo ingrese números no letras");
          
      }catch(Exception e){
          
          System.out.println("Ocurrió un error");
          
      }
      if(num_i%15 == 0){
      
          monto_n = 0.75 * monto;
           
          System.out.println("El monto neto a pagar es: " + monto_n);
       
      }else if(num_i%5 == 0){
      
          monto_n = 0.80 * monto;
          
          System.out.println("El monto neto a pagar es: " + monto_n);
          
      }else if(num_i%3 == 0){
      
          monto_n = 0.85 * monto;
          
          System.out.println("El monto neto a pagar es: " + monto_n);
      
      }else {
       
          monto_n = 0.90 * monto;
          
          System.out.println("El monto neto a pagar es: " + monto_n);
      
      }  
   }
}