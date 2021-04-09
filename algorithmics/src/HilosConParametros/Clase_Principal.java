package HilosConParametros;

import java.util.Scanner;

/**
 *
 * @author Rem3
 */
public class Clase_Principal {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        Proceso hilo1 = new Proceso("Hilo1");
        Proceso hilo3 = new Proceso("Hilo3");
        Proceso hilo2 = new Proceso("Hilo2");
        
        System.out.print("Ingrese un valor para el hilo: ");
        hilo1.valorCondición(entrada.nextInt());
        hilo2.valorCondición(13);
        hilo3.valorCondición(13);
        
        hilo1.start();
        hilo2.start();      
        hilo3.start();                
    }
}