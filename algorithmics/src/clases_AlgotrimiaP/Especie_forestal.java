package clases_AlgotrimiaP;

import java.util.Scanner;

public class Especie_forestal{
  public static void main(String args[]){
      //variables:
      double perdida;
      Scanner sc = new Scanner(System.in);
      //entrada:
      System.out.println("Ingrese el porcentaje de perdida de peso");
      perdida = sc.nextDouble();
      //salida:
      if(perdida >= 0 && perdida <= 1){
          
          System.out.println("La especie es altamente resistente.");
      
      }else
        if(perdida > 1 && perdida <= 5){
        
            System.out.println("La especie es resistente.");
            
      }else
        if(perdida > 5 && perdida <= 10){
        
            System.out.println("La especie es moderadamente resistente.");
            
      }else    
        if(perdida > 10 && perdida <= 30){
        
            System.out.println("La especie es muy poco resistente.");
            
      }else 
        if(perdida > 30 && perdida < 100){
           
           System.out.println("La especie es no es resistente o no existe.");
       
      }else
           
           System.out.println("Solo se toman porcentajes positivos y menores de 100");
   }
}