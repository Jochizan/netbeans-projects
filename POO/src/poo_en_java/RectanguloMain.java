package poo_en_java;

import poo_en_java.Rectangulo;
import java.util.Scanner;

public class  RectanguloMain{
    
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Dame el valor de la base");
        int base = sc.nextInt();
        
        System.out.println("Dame el valor de la altura");
        int altura = sc.nextInt();
        
        Rectangulo mensajero = new Rectangulo(base, altura);
        
        mensajero.Imprimir();
        
    }
}