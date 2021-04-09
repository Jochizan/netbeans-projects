

import java.util.Scanner;
//INICIO

public class Switch6 {

    public static void main(String[] args) {
        //variables:
        Scanner valor = new Scanner(System.in);
        double num;
        int a;
        //entrada:
        System.out.println("\tIngrese la cantidad en kilos de manzana\n"
                + "\t  KILOS     %DESCUENTO\n"
                + "\t  <0-2]        0% \n"
                + "\t  <2-5]        10%\n"
                + "\t  <5-10]       20%\n"
                + "\t  <10          30%");
        num = valor.nextDouble();
        //procesos:
        if (num > 0 && num <= 2) {

            a = 1;//Le puse variables diferentes a los casos para distinguir que son distintos.
            switch (a) {
                //salidas:
                case 1:
                    System.out.println("No tiene descuento");

            }

        } else if (num > 2 && num <= 5) {

            a = 2;
            switch (a) {

                case 2:
                    System.out.println("Su descuento es de:\n"
                            + "10% del monto neto");

            }

        } else if (num > 5 && num <= 10) {

            a = 3;
            switch (a) {

                case 3:
                    System.out.println("Su descuento es de:\n"
                            + "20% del monto neto");

            }

        } else if (num > 10) {

            a = 4;
            switch (a) {

                case 4:
                    System.out.println("Su descuento es de:\n"
                            + "30% del monto neto");

            }
            //salidas:    
        } else {

            System.out.println("La cantidad no puede ser negativa");
            //FIN   
        }
    }
}
