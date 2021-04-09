package clases_AlgotrimiaP;

import java.util.Scanner;

public class Cuotas_de_casas{
  public static void main(String args[]){
  
      float ingreso_m;
      Scanner valor = new Scanner(System.in);
      
      System.out.println("¿Cuál es su ingreso mensual?");
      ingreso_m = valor.nextFloat();
      
      if(ingreso_m > 1000){
                   
          System.out.println("Con ese ingreso su forma de pagar el costo de la casa es: ");
          System.out.println("");
          System.out.println("Su cuota incial es del 30% del costo de la casa.");
          System.out.println("");
          System.out.println("El resto del costo sera cubierto en 75 cuotas mensuales.");
          
          
      }else if(ingreso_m >= 300 && ingreso_m <= 1000){
          
          System.out.println("Con ese ingreso su forma de pagar el costo de la casa es: ");
          System.out.println("");
          System.out.println("Su cuota incial es del 15% del costo de la casa.");
          System.out.println("");
          System.out.println("El resto del costo sera cubierto en 120 cuotas mensuales.");
      
      }else {
      
          System.out.println("Su ingreso mensual es insuficientes.");
      
      }
   }
}