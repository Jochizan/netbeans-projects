package ConstructorP;

import java.util.Scanner;

/**
 * 
 * @author Rem3
 */
public class SinConstructor {
    
    private Scanner entrada = new Scanner(System.in);
    String nombre = "";
    
    public void PedirNombre() {
        System.out.println("¿Cuál es tu nombre?: ");
        nombre = entrada.nextLine();
    }
    
    public void Imprimir() {
        System.out.println("Tu nombre es: " + nombre);
    }
}
