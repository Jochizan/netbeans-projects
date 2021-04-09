package clases_AlgotrimiaP;

import java.util.Scanner;

public class Plan_min{
  public static void main(String args[]){
      //variables:
      int min_u, min_d;
      String Plan = "";
      double costom, dscto;
      Scanner sc = new Scanner(System.in);
      //entrada:
      System.out.println("¿Cuál es su plan?");
      Plan = sc.nextLine();
      //procesos y salidas:
      if("A".equalsIgnoreCase(Plan)){
          
          min_u = 300;
          System.out.println("Usted tiene 300 min libres");
          System.out.println("¿Cuántos minutos desea consumir?");
          min_d = sc.nextInt();
          
      if (min_d - min_u > 0){
          
           costom = (min_d - min_u) * 0.10;
     
          System.out.println("Su monto adicional a pagar es " + costom + " y su descuento nulo.");
          
      }else{
      
          System.out.println("Gracias solo tiene sus minutos libres.");
      
      }
      
      }else if("B".equalsIgnoreCase(Plan)){
          
          min_u = 200;
          System.out.println("Usted tiene 200 min libres");
          System.out.println("¿Cuántos minutos desea consumir?");
          min_d = sc.nextInt();
        
        if(min_d - min_u > 0){
            
            costom = (min_d - min_u) * 0.08;
            dscto = costom * 0.05;
            
           System.out.println("Su monto adicional seria " + costom + ", pero tiene un descuento de " + dscto
            + " su verdadero monto adicional a pagar es de " + (costom - dscto));
        
      }else{
        
            System.out.println("Gracias solo tiene sus minutos libres.");
            
      }  
          
      }else if("C".equalsIgnoreCase(Plan)){
          
          min_u = 100;
          System.out.println("Usted tiene 100 min libres");
          System.out.println("¿Cuántos minutos desea consumir?");
          min_d = sc.nextInt();
          
        if(min_d - min_u > 0){
        
        costom = (min_d - min_u) * 0.05;
        dscto = costom * 0.1;
        
        System.out.println("Su monto adicional seria " + costom + ", pero tiene un descuento de " + dscto
        + " su verdadero monto adicional a pagar es de " +(costom - dscto));
        
      }else{
        
            System.out.println("Gracias solo tiene sus minutos libres.");
        
      }
      
      }else{
      
          System.out.println("Ese plan no existe.");
      
      }     
   }
}
