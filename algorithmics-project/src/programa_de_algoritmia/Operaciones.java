package programa_de_algoritmia;

import java.util.Scanner;

public class Operaciones{
  public static void main(String ars[]){
  
    int num_uno = 5, num_dos = 3, resultado = 0;
    int parametro;
    Scanner sc = new  Scanner(System.in);
    
    System.out.println("Ingrese el num");
      parametro = sc.nextInt();
      
  switch(parametro){

    case 1: resultado = num_uno + num_dos;
            System.out.println("El resulatdo de la suma es: " + resultado);
            break;

    case 2: resultado = num_uno - num_dos;
            System.out.println("El resulatdo de la resta es: " + resultado);
            break;

    case 3: resultado = num_uno * num_dos;
            System.out.println("El resulatdo de la multiplicación es: " + resultado);
            break;

    case 4: resultado = num_uno / num_dos;
            System.out.println("El resulatdo de la división es: " + resultado);
            break;

   default: System.out.println("Error, la opción no existe");
            break;
    }
  }
}