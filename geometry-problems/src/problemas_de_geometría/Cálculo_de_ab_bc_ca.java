package problemas_de_geometría;

import java.util.Scanner;

public class Cálculo_de_ab_bc_ca{
  public static void main(String args[]){
    //variables:
    double módulo_a , módulo_b , módulo_c , ab_bc_ca;
    Scanner valor = new Scanner(System.in);
    //entrada:
    System.out.print("Ingrese el módulo de a: ");
    módulo_a = valor.nextDouble();
    
    System.out.print("Ingrese el módulo de b: ");
    módulo_b = valor.nextDouble();
    
    System.out.print("Ingrese el módulo de c: ");
    módulo_c = valor.nextDouble();
    //proceso:
    ab_bc_ca = (Math.pow(módulo_a,2) + Math.pow(módulo_b,2)+Math.pow(módulo_c,2))/-2;
    
    if(módulo_a >= 0 && módulo_b >= 0 && módulo_c >= 0){
    //salida:    
    System.out.println("El valor de ab + bc + ca es: " + ab_bc_ca);
    
    }else{
      System.out.println("Uno o los valores ingresados son inválidos");
    }
  }
}