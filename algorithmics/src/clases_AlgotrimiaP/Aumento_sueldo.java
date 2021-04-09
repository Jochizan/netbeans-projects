package clases_AlgotrimiaP;

import java.util.Scanner;

public class Aumento_sueldo{
    
  public static void main(String args[]){
  
      float sueldo, sueldo_n;
      Scanner sc = new Scanner(System.in);

      System.out.println("Ingrese el sueldo del trabajador ");
      sueldo = sc.nextFloat();
      
      if(sueldo > 0 && sueldo < 1000){
          
          sueldo_n = (float) (sueldo * 1.15);
          
          System.out.println("Su nuevo sueldo es: " + sueldo_n);
      
      }else if(sueldo >= 1000 ){
          
          sueldo_n = (float) (sueldo*1.12);
          
          System.out.println("Su nuevo sueldo es: " + sueldo_n);
      
      }else
          
          System.out.println("Error el sueldo no puede ser negativo.");
   }
}