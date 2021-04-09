package poo_matrices;

import java.util.Scanner;

public class ClasePrincipal {

    public static void main(String[] args) {
        String finish = "N";
        Scanner in = new Scanner(System.in);
        do {
            Funcionamiento ejec = new Funcionamiento();
            ejec.Ejecucion();
            System.out.print("\n¿Esta seguro que quiere salir del programa? "
                    + "\nIngrese S = SI"
                    + "\nIngrese N = NO"
                    + "\n(S/N): ");
            if(finish != "S") {
                System.out.println("Te mamaste :D");
            }
            finish = in.nextLine();
        } while (finish == "N");
    }
}
