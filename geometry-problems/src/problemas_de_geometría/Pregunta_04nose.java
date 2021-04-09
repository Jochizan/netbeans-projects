package problemas_de_geometría;

import java.util.Scanner;

/**
 *
 * @author Rem3
 */
public class Pregunta_04nose {
    
    public static void main(String[] args) {
        
        double a, b, c, x1, y1, h, k, D1, D2;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los valores del punto P");
        x1 = entrada.nextInt();
        y1 = entrada.nextInt();
        
        System.out.println("Ingrese los coeficientes de la ecuación de la circunferencia");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        
        h = -a/2;
        k = -b/2;
        
        D1 = Math.sqrt(h);
    }
}