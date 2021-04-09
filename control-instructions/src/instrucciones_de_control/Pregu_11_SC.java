package instrucciones_de_control;

import java.util.Scanner;

public class Pregu_11_SC {

    public static void main(String args[]) {
        //variables:
        int min_u, min_d;
        String Plan;
        double costom, dscto;
        Scanner sc = new Scanner(System.in);
        //entrada:
        System.out.println("\n\tPlan\tMin libres\tcosto x Min_adicional\tDescuento"
                + "\n \tA      \t300            \tS/.0.10          \t0%"
                + "\n \tB      \t200            \tS/.0.08          \t5%"
                + "\n \tC      \t100            \tS/.0.05          \t10%"
                + "\nElija el plan que más le guste");
        Plan = sc.nextLine();
        //procesos y salidas:
        if ("A".equalsIgnoreCase(Plan)) {

            min_u = 300;
            System.out.println("Usted tiene 300 min libres\n"
                    + "¿Cuántos minutos va consumir?");
            min_d = sc.nextInt();

            if (min_d - min_u > 0) {

                costom = (min_d - min_u) * 0.10;

                System.out.println("Su monto adicional a pagar es de: S/." + costom + "\nGracias.");

            } else {

                System.out.println("Gracias solo tiene sus minutos libres.");

            }

        } else if ("B".equalsIgnoreCase(Plan)) {

            min_u = 200;
            System.out.println("Usted tiene 200 min libres\n"
                    + "¿Cuántos minutos va desea consumir?");
            min_d = sc.nextInt();

            if (min_d - min_u > 0) {

                costom = (min_d - min_u) * 0.08;
                dscto = costom * 0.05;

                System.out.println("Su monto adicional seria S/." + costom + ", pero tiene un descuento de S/:" + dscto
                        + " su monto adicional a pagar es de S/." + (costom - dscto) + "\nGracias.");

            } else {

                System.out.println("Gracias solo tiene sus minutos libres.");

            }

        } else if ("C".equalsIgnoreCase(Plan)) {

            min_u = 100;
            System.out.println("Usted tiene 100 min libres\n"
                    + "¿Cuántos minutos va desea consumir?");
            min_d = sc.nextInt();

            if (min_d - min_u > 0) {

                costom = (min_d - min_u) * 0.05;
                dscto = costom * 0.1;

                System.out.println("Su monto adicional seria S/." + costom + ", pero tiene un descuento de S/." + dscto
                        + " su monto adicional a pagar es de S/." + (costom - dscto) + "\nGracias.");

            } else {

                System.out.println("Gracias solo tiene sus minutos libres.");

            }

        } else {

            System.out.println("Ese plan no existe.");

        }
    }
}
