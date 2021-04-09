package cadenacaracteres;

import java.util.Scanner;

/**
 *
 * @author Joan y Rem3
 */
public class ClaseString {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        String palabra = "", invertido = "";
        int num_ca;

        System.out.print("Ingrese una palabra: ");
        palabra = entrada.nextLine();

        num_ca = palabra.length();

        while (num_ca != 0) {

            invertido += palabra.substring(num_ca - 1, num_ca);
            num_ca--;
        }

        String array[] = new String[palabra.length()];

        System.out.println("La palabra invertida es: " + invertido);
        
        if (palabra.equalsIgnoreCase(invertido)) {
            System.out.println("Las palabras es palíndroma" );
        } else {
            System.out.println("Las palabras no es palíndroma" );
        }
        
        for (num_ca = 0; num_ca < invertido.length(); num_ca++) {

            array[num_ca] = Character.toString(invertido.charAt(invertido.length() - num_ca - 1));

            if (num_ca == 0) {
                System.out.print("La palabra incial fue: " + array[num_ca]);
            } else if (num_ca < invertido.length()-1) {
                System.out.print(array[num_ca]);
            } else {
                System.out.println(array[num_ca]);
            }
        }
    }
}
