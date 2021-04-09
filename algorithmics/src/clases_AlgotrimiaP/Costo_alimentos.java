package clases_AlgotrimiaP;

import java.util.Scanner;

public class Costo_alimentos {

    public static void main(String args[]) {

        int cant_a = 0, cant_b = 0, num_e1, num_e2, costo1 = 0, costo2 = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("\n     Bienvenido a la cafeteria la sabrosita\n"
                + "\n        Eliga su opción de comida  Costo:  \n"
                + "\n          1 si quiere tortas        S/.20"
                + "\n          2 si quiere panes         S/.9 "
                + "\n          3 si quiere pasteles      S/.9 "
                + "\n          4 si quiere bocaditos     S/.20");
        num_e1 = sc.nextInt();

        System.out.println("\n     Ahora estas son las elecciones en bebida\n"
                + "\n        Eliga su opción de comida   Costo:    \n"
                + "\n          1 si quiere Coca Cola      S/.5 "
                + "\n          2 si quiere Inca Cola      S/.5 "
                + "\n          3 si quiere Agua con gas   S/.4 "
                + "\n          4 si quiere Agua sin gas   S/.4 ");
        num_e2 = sc.nextInt();

        if (num_e1 == 1) {

            System.out.println("Usted eligio tortas");
            System.out.println("Cuál es la cantidad que quiere de este");
            cant_a = sc.nextInt();

            costo1 = cant_a * 20;

        } else if (num_e1 == 2) {

            System.out.println("Usted eligio panes");
            System.out.println("Cuál es la cantidad que quiere de este");
            cant_a = sc.nextInt();

            costo1 = cant_a * 9;

        } else if (num_e1 == 3) {

            System.out.println("Usted eligio pasteles");
            System.out.println("Cuál es la cantidad que quiere de este");
            cant_a = sc.nextInt();

            costo1 = cant_a * 9;

        } else if (num_e1 == 4) {

            System.out.println("Usted eligio bocaditos");
            System.out.println("Cuál es la cantidad que quiere de este");
            cant_a = sc.nextInt();

            costo1 = cant_a * 20;

        } else {

            System.out.println("Esa opcion no existe.");

        }
        if (num_e2 == 1) {

            System.out.println("Usted eligio Coca Cola");
            System.out.println("Cuál es la cantidad que quiere de este");
            cant_b = sc.nextInt();

            costo2 = cant_b * 5;

        } else if (num_e2 == 2) {

            System.out.println("Usted eligio Inca Cola");
            System.out.println("Cuál es la cantidad que quiere de este");
            cant_b = sc.nextInt();

            costo2 = cant_b * 5;

        } else if (num_e2 == 3) {

            System.out.println("Usted eligio Agua con gas");
            System.out.println("Cuál es la cantidad que quiere de este");
            cant_b = sc.nextInt();

            costo2 = cant_b * 4;

        } else if (num_e2 == 4) {

            System.out.println("Usted eligio Agua sin gas");
            System.out.println("Cuál es la cantidad que quiere de este");
            cant_b = sc.nextInt();

            costo2 = cant_b * 4;

        } else {

            System.out.println("Esa opcion no existe.");
        }
        System.out.println("El costo total a pagar por la cantidad de " + cant_a + " alimentos "
                + " y  por la cantidad de " + cant_b + " de bebidas " + " es:\n"
                + "S/." + (costo1 + costo2));
    }
}
