import java.util.Scanner;

public class Switch{
  public static void main(String ars[]){
  
  Scanner valor = new Scanner(System.in);
  int parametro;
  
      System.out.println("\n\tIngrese el valor que guste:\n"
              + "          1     verano\n"
              + "          2     otoño \n"
              + "          3     invierno\n"
              + "          4     verano");
      parametro = valor.nextInt();
      
  switch(parametro){

    case 1: 
            System.out.println("verano");
            break;

    case 2: 
            System.out.println("otoño");
            break;

    case 3: 
            System.out.println("invierno");
            break;

    case 4: 
            System.out.println("primavera");
            break;

   default: System.out.println("Error, la opción no existe");
            break;
  }
 }
}