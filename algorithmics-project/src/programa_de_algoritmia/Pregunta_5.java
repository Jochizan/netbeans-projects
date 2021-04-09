package folder1;

import java.util.Scanner;

public class Pregunta_5{
  public static void main(String args[]){
    //variables: 
    double L1, L2, L3, área, S;
    Scanner valor = new Scanner(System.in);
    //entrada:
    System.out.println("Ingrese el primer lado ");
    L1 = valor.nextDouble();
    
    System.out.println("Ingrese el segundo lado ");
    L2 = valor.nextDouble();
  
    System.out.println("Ingrese el tercer lado ");
    L3 = valor.nextDouble();
    //proceso:
    S = (L1 + L2 + L3)/2;
          
    área = Math.sqrt(S*Math.abs((S - L1)*(S - L2)*(S - L3)));
    //salida:
      if(L1 > 0 && L2 > 0 && L3 > 0){
    
         System.out.println("El área es: " + área);
        
      }if(L1 <= 0 || L2 <= 0 || L3 <= 0){
          
          System.out.println("Los lados del triangulo no pueden ser negativos.");
      
      }
   }
}