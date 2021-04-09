package programa_de_algoritmia;

import java.util.Scanner;

public class Pregunta_2{
  public static void main(String args[]){
    //variables:
    float num_1, num_2, num_3, P;
    Scanner valor = new Scanner(System.in);
    //entrada:
    System.out.println("Ingrese la nota 1 ");
    num_1 = valor.nextFloat();
    
    System.out.println("Ingrese la nota 2 ");
    num_2 = valor.nextFloat();
    
    System.out.println("Ingrese la nota 3 ");
    num_3 = valor.nextFloat();
    //proceso:
    P = (num_1 + num_2 + num_3)/3;
    //salida:
     if(num_1 >= 0 && num_1 <= 20 && num_2 >= 0 && num_2 <= 20 && num_3 >= 0 && num_3 <= 20){
    
        System.out.println("EL promedio de las notas es: " +  P);
    
    }if(num_1 <= 0 || num_1 >= 20 || num_2 <= 0 || num_2 >= 20 || num_3 <= 0 || num_3 >= 20){
        
        System.out.println("Los valores ingreados son ilógicos.");
    
    }
  }
}