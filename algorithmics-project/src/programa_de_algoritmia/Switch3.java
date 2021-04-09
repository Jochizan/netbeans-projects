import java.util.Scanner;

public class Switch3{
  public static void main(String ars[]){
  
      Scanner valor = new Scanner(System.in);
        String parametro;

        System.out.println("\nIngrese la vocal");
        parametro = valor.nextLine();

        switch (parametro) {

            case "a":
                System.out.println("Si es una vocal");
                break;

            case "A":
                System.out.println("Si es una vocal");
                break;

            case "e":
                System.out.println("Si es una vocal");
                break;

            case "E":
                System.out.println("Si es una vocal");
                break;

            case "i":
                System.out.println("Si es una vocal");
                break;

            case "I":
                System.out.println("Si es una vocal");
                break;

            case "o":
                System.out.println("Si es una vocal");
                break;

            case "O":
                System.out.println("Si es una vocal");
                break;

            case "u":
                System.out.println("Si es una vocal");
                break;

            case "U":
                System.out.println("Si es una vocal");
                break;

            default:
                System.out.println("No es una vocal");
                break;
        }
    }
}
