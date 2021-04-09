import java.util.Scanner;

public class Switch2 {

    public static void main(String ars[]) {

        Scanner valor = new Scanner(System.in);
        int parametro;

        System.out.println("\n\tIngrese el número");
        parametro = valor.nextInt();

        switch (parametro) {

            case 0:
                System.out.println("cero");
                break;

            case 1:
                System.out.println("uno");
                break;

            case 2:
                System.out.println("dos");
                break;

            case 3:
                System.out.println("tres");
                break;

            case 4:
                System.out.println("cuatro");
                break;

            case 5:
                System.out.println("cinco");
                break;

            case 6:
                System.out.println("seis");
                break;

            case 7:
                System.out.println("siete");
                break;

            case 8:
                System.out.println("ocho");
                break;

            case 9:
                System.out.println("nueve");
                break;

            default:
                System.out.println("Error, la opción no existe");
                break;

        }
    }
}
