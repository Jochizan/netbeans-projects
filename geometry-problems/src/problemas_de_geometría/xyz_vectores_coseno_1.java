package problemas_de_geometría;

import static java.lang.Math.PI;
import static java.lang.Math.cos;
import java.util.Scanner;

public class xyz_vectores_coseno_1{
  public static void main(String args[]){
      
      double módulo_a = 0, módulo_b = 0, módulo_ab = 0, módulo_ba = 0, ángulo_a = 0, ángulo_b = 0, ab = 0;
      Scanner valor = new Scanner(System.in);
      
      System.out.print("Ingrese el módulo de a : ");
      módulo_a = valor.nextDouble();
      
      System.out.print("Ingrese el módulo de b : ");
      módulo_b = valor.nextDouble();
      
      System.out.print("Ingrese el angulo beta: ");
      ángulo_b = valor.nextDouble();
      
      ángulo_b = ángulo_b*(Math.PI/180);  
      ab = módulo_a*módulo_b*cos(ángulo_b);
      módulo_ab = Math.sqrt(Math.pow(módulo_a, 2) + Math.pow(módulo_b, 2) + 2*ab);
      módulo_ba = Math.sqrt(Math.pow(módulo_a, 2) + Math.pow(módulo_b, 2) - 2*ab);
      ángulo_a = Math.acos(((Math.pow(módulo_a, 2) - Math.pow(módulo_b, 2)))/módulo_ab*módulo_ba);
      ángulo_a = (ángulo_a*180)/Math.PI;
      
      System.out.print("El valor de del ángulo alfa es: " + ángulo_a);
  }
}