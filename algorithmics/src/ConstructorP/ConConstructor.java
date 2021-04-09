package ConstructorP;

import java.util.Scanner;

/**
 * 
 * @author 
 */
public class ConConstructor {
    
    public ConConstructor() {
        
        Scanner enScanner = new Scanner(System.in);
        String nombre = "";
        
        System.out.println("¿Cuál es tu nombre?");
        nombre = enScanner.nextLine();
        System.out.println("Tu nombre es: " + nombre);
        
    }
}
