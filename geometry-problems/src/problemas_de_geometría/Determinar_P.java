package problemas_de_geometría;

import java.util.Scanner;

public class Determinar_P{
  public static void main(String args[]){
  
      double módulo_a = 0, ab, módulo_b = 0, bc, módulo_c = 0, ca, P;
      Scanner valor = new Scanner(System.in);
      
      System.out.print("Ingrese el módulo de a: ");
      módulo_a = valor.nextDouble();
      
      System.out.print("Ingrese el módulo de b: ");
      módulo_b = valor.nextDouble();
      
      System.out.print("Ingrese el módulo de c: ");
      módulo_c = valor.nextDouble();
      
      ab = módulo_a*módulo_b*0.5;
      bc = módulo_b*módulo_c*0.5;
      ca = módulo_c*módulo_a*0.5;
      
      P = Math.sqrt(Math.pow(módulo_a, 2) + Math.pow(módulo_b, 2) + Math.pow(módulo_c, 2) + 
                 2*ab + 2*bc + 2*ca);
      
      if(módulo_a > 0 && módulo_b > 0 && módulo_c > 0){
          
          System.out.println("El valor de P es: " + P);
          
      }else{
          
        System.out.println("Uno o los valores ingresados son inválidos");
      }
  }
}