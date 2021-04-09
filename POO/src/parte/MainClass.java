package parte;

import java.util.*;

public class MainClass extends Properties {

    private static String salir;
    private static int bandera;
    public Scanner entry = new Scanner(System.in);
    public static final Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("========================================="
                         + "\nBIENVENIDO A NUESTRO PROGRAMA DE MATRICES"
                         + "\n=========================================");
        Functioning first = new Functioning();
        do {
            first.Execution();
            System.out.print("\n¿Esta seguro que quiere salir del programa?" 
            + "\nOpciones:"
            + "\n1).S\tSI"
            + "\n2).N\tNO"
            + "\nSu opción: ");
            salir = in.nextLine();
            if (salir.equalsIgnoreCase("S")) {
                bandera = 1;
            }
        } while (bandera == 0);
    }
}
