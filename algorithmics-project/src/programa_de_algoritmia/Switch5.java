package programa_de_algoritmia;

import java.util.Scanner;
//INICIO

public class Switch5 {

    public static void main(String args[]) {
        //variables:
        int num_1, num_2, num_3, n;
        Scanner valor = new Scanner(System.in);
        //entrada:
        System.out.println("Ingrese el valor del número 1, 2 y 3");
        num_1 = valor.nextInt();
        num_2 = valor.nextInt();
        num_3 = valor.nextInt();
        //procesos:
        if (num_3 >= num_2 && num_2 >= num_1) {
            //salidas:
            n = 1;
            switch (n) {

                case 1:
                    System.out.println("Si esta de forma ascendente");

            }
        } else if (num_3 == num_2 && num_2 == num_1) {

            n = 2;
            switch (n) {

                case 2:
                    System.out.println("Todos los valores son iguales");
                //FIN      
            }
        } else {

            System.out.println("No esta en forma ascendente");
        }
    }
}
