/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_de_algoritmia;

import java.util.Scanner;

/**
 *
 * @author Lenovo
 */
public class Programa_de_algoritmia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new Scanner(System.in);
        
        String nombre = "";
        int num_uno = 0, num_dos, resultado = 0;
        
        System.out.println("¿Cual es tu nombre?");
        nombre = in.nextLine();
        
        System.out.println("Dame el primer valor de la suma");
        num_uno = in.nextInt();
        
        System.out.println("Dame el segundo valor de la suma");
        num_dos = in.nextInt();
        
        resultado = num_uno + num_dos;
        
        System.out.println("Hola "+ nombre + " la suma es: " + resultado);
        
        
    }
    
}
