package cadenacaracteres;

import java.util.Scanner;

/**
 *
 * @author Joan y Rem3
 */
public class StringsCadena {

    public static void main(String[] args) {

        Procesos hilo = new Procesos();
        Scanner entrada = new Scanner(System.in);
        String contraseñaG = "", contraseñaI = "", UsuarioG = "", UsuarioI = "";
        String Bienvenida = "Bienvenido a este ''programa''";

        System.out.print("----------------------------------------\n"
                + Bienvenida + "\n"
                + "-----------------------------------------\n"
                + "\nAhora pasemos a su registro: "
                + "\nCree su usuario: ");
        UsuarioG = entrada.next();

        System.out.print("Cree su contraseña: ");
        contraseñaG = entrada.next();

        System.out.println("----------------" + "\n¡Gracias!" + "\n---------------");

        hilo.start();
        try {
            hilo.join();
        } catch (InterruptedException e) {
            System.out.println("Error de hilo: " + e);
        }

        int n;
        System.out.print("\n\n-----------------------------"
                + "\nBienvenido de nuevo"
                + "\n-----------------------------");
        do {

            System.out.print("\nIngrese su Usuario:");
            UsuarioI = entrada.next();

            System.out.print("Ingrese su contraseña: ");
            contraseñaI = entrada.next();

            if (contraseñaG.equals(contraseñaI) && UsuarioG.equals(UsuarioI)) {

                System.out.println("Bienvenido al ''programa'' ===" + UsuarioI.toUpperCase() + "===");
                n = 0;

            } else {

                System.out.println("Error vuelva a intentarlon"
                        + "\npista de contraseña: "
                        + "\ncomienza con: " + contraseñaG.charAt(0));
                n = 1;
            }
        } while (n != 0);
    }
}