

import java.util.Scanner;
//INICIO

public class Switch8 {

    public static void main(String[] args) {
        //variables:
        Scanner sc = new Scanner(System.in);
        int clave_z, min;
        double c;
        //entrada:
        System.out.println("Ingrese la clave por zona: \n"
                + "\n CLAVE        ZONA            PRECIO \n"
                + "   12          NA              S/.2    \n"
                + "   15          LAN             S/.2.2  \n"
                + "   18          LAS             S/.4.5  \n"
                + "   19          EUW             S/.3.5  \n"
                + "   23          A               S/.6    \n"
                + "   25          SA              S/.6    \n"
                + "   29          OCE             S/.5     ");
        clave_z = sc.nextInt();

        System.out.println("Ingrese el numero de minutos: ");
        min = sc.nextInt();
        //procesos:
        switch (clave_z) {
            //salidas:
            case 12:
                c = min * 2;
                System.out.println("El costo por la llamada es:\nS/." + c);
                break;

            case 15:
                c = min * 2.2;
                System.out.println("El costo por la llamada es:\nS/." + c);
                break;

            case 18:
                c = min * 4.5;
                System.out.println("El costo por la llamada es:\nS/." + c);
                break;

            case 19:
                c = min * 3.5;
                System.out.println("El costo por la llamada es:\nS/." + c);
                break;

            case 23:
                c = min * 6;
                System.out.println("El costo por la llamada es:\nS/." + c);
                break;

            case 25:
                c = min * 6;
                System.out.println("El costo por la llamada es:\nS/." + c);
                break;

            case 29:
                c = min * 5;
                System.out.println("El costo por la llamada es:\nS/." + c);
                break;

            default:
                System.out.println("No existe esa clave");
            //FIN       
        }
    }
}
