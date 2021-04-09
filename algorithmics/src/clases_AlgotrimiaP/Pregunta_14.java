package clases_AlgotrimiaP;

import java.util.Scanner;

public class Pregunta_14{
  public static void main(String args[]){
        //variables:
        double base, altura, superficie;
        Scanner valor = new Scanner(System.in);
        //entrada:
        System.out.println("Ingrese la base del triángulo");
        base = valor.nextDouble();
        
        System.out.println("Ingrese la altura del triángulo");
        altura = valor.nextDouble();
        //proceso:
        superficie = (base*altura)/2;
        //salidas:
         if(base >= 0 && altura >= 0){
            
            System.out.println("La superficie es: " + superficie);
        
        }if(base < 0 || altura < 0){
            
            System.out.println("Las distancias no pueden ser negativas.");
            
        }
   }
}