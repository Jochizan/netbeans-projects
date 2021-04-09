package programa_de_algoritmia;

import java.util.Scanner;
//INICIO

public class Switch7 {

    public static void main(String[] args) {
        //vairables:
        int días, meses;
        Scanner valor = new Scanner(System.in);
        //entrada:
        System.out.println("Ingrese el día");
        días = valor.nextInt();

        System.out.println("Ingrese el mes");
        meses = valor.nextInt();
        //procesos:
        if (días > 0 && días <= 31) {

            switch (meses) {
                //salidas:
                case 1:
                case 2://Podemos ser más especificos, pero la pregunta no dice si tomemos años bisiestos.

                    /* if(días > 28 & días <= 31){
                        
                        System.out.println("Dependera del año(talvez sea bisiesto)");
                        break;
                    }*/
                    System.out.println("Verano");
                    break;

                case 3:

                    if (días > 0 & días <= 20) {

                        System.out.println("Verano");

                    } else {

                        System.out.println("Otoño");
                    }
                //salidas:    
                case 4:
                case 5:

                    System.out.println("Otoño");
                    break;
                //salidas:    
                case 6:

                    if (días > 0 & días <= 21) {

                        System.out.println("Otoño");

                    } else {

                        System.out.println("Invierno");

                    }
                //salidas:    
                case 7:
                case 8:

                    System.out.println("Invierno");
                    break;

                case 9:

                    if (días > 0 & días <= 22) {

                        System.out.println("Invierno");

                    } else {

                        System.out.println("Primavera");

                    }
                //salidas:    
                case 10:
                case 11:

                    System.out.println("Primavera");
                    break;

                case 12:

                    if (días > 0 & días <= 20) {

                        System.out.println("Primavera");

                    } else {

                        System.out.println("Verano");

                    }
            }
            //salidas:
        } else {

            System.out.println("No existe ese día del mes");
            //FIN
        }
    }
}
