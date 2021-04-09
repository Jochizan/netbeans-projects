package instrucciones_de_control;

import java.util.Scanner;

public class Tipo_madera{

    public static void main(String[] args) {
        
        char tipo_madera;
        double volumen;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el volumen");
        volumen = entrada.nextDouble();
        
        System.out.println("El tipo de madera");
        tipo_madera = entrada.next().charAt(0);
        
        System.out.println(tipo_madera);
    }
}