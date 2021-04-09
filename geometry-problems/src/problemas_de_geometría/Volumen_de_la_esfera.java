package problemas_de_geometría;


import static java.lang.Math.PI;
import java.util.Scanner;

public class Volumen_de_la_esfera {

    public static void main(String[] args) {
        // TODO code application logic here
        double radio = 0, Volumen = 0;
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Ingrese el radio de la esfera");
        radio = valor.nextDouble();
        
        Volumen = 4.0/3.0*PI*Math.pow(radio, 3);
        
        System.out.println("El volumen de la esfera es: " + Volumen + " unidades cúbicas");
    }
    
}
