package electrostática;

import java.util.Scanner;

/**
 *
 * @author Joan y Rem3
 */
public class Electrostática1 {

    public static void main(String[] args) {
        
        double Q1, Q2, r, Fe;
        double K = 9*Math.pow(10, 9);
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la primera carga");
        Q1 = entrada.nextDouble();
        
        System.out.println("Ingrese la primera carga");
        Q2 = entrada.nextDouble();
        
        System.out.println("Ingrese la distancia entre las cargas");
        r = entrada.nextDouble();
        
        Fe = (K*Q1*Q2)/(Math.pow(r, 2));
        
        System.out.println("La fuerza electrica entre esas dos cargas es: " + Fe);
        
    }    
}
