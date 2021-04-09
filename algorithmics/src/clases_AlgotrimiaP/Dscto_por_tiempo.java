package clases_AlgotrimiaP;

import java.util.Scanner;

public class Dscto_por_tiempo{
  public static void main(String args[]){
      //variables:
      int dias_d;
      String tipo = "";
      double costom, dscto;
      Scanner sc = new Scanner(System.in);
      //entrada:
      System.out.println("\n    ¿Que tipo de habitación quiere?\n"+
              "\n           Tipo   Costo"+
              "\n            A     $120"+
              "\n            B     $80"+
              "\n            C     $50");
              
      tipo = sc.nextLine();
      //procesos y salidas:
      if("A".equalsIgnoreCase(tipo)){
          
          System.out.println("¿Cuántos días se va a hospedar?");
          dias_d = sc.nextInt();
          
      if (dias_d  > 0){
          
           costom = (dias_d) * 120;
           dscto = costom * 0.02;
     
          System.out.println("El monto a pagar sería " + costom + ", pero tiene un descuento de " + dscto + 
                  " su monto neto a pagar es: " + (costom-dscto));
          
      }else{
      
          System.out.println("Error no se puede hospedar esa cantidad de tiempo.");
      
      }
      
      }else if("B".equalsIgnoreCase(tipo)){
                  
          System.out.println("¿Cuántos días se va a hospedar?");
          dias_d = sc.nextInt();
        
        if(dias_d > 0){
            
            costom = (dias_d ) *80;
            dscto = costom * 0.10;
            
           System.out.println("El monto sería " + costom + ", pero tiene un descuento de " + dscto
           + " su monto neto a pagar es: " + (costom-dscto));
            
        
      }else{
        
            System.out.println("Error no se puede hospedar esa cantidad de tiempo.");
            
      }  
          
      }else if("C".equalsIgnoreCase(tipo)){
                    
          System.out.println("¿Cuántos días se va a hospedar?");
          dias_d = sc.nextInt();
          
            if(dias_d > 0){
        
            costom = (dias_d ) * 50;
            dscto = costom * 0.1;
        
        System.out.println("El monto sería " + costom + ", pero tiene un descuento de " + dscto
         + " su monto neto a pagar es: " + (costom-dscto));
        
        
      }else{
        
            System.out.println("Error no se puede hospedar esa cantidad de tiempo.");
        
      }
      
      }else{
      
          System.out.println("Ese tipo de habitación no existe");
      
      }     
   }
}
