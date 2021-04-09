package problemas_de_geometría;

import java.util.Scanner;

public class Pregunta_01nose{
    
    public static void main(String[] args) {
        
        double a, b, c, x1, y2, h, k, R;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los coeficientes de la ecuación de la recta que pasa por el diámetro de la circunferencia");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        //x2=0, y1 =0
        y2 = c/b;
        x1 = c/a;
        
        h = x1/2;
        k = y2/2;
        
        R = Math.pow((h - x1), 2) + Math.pow((k - 0), 2);
        
        System.out.println("La ecuación de la circunferencia es: "
                + "\n (x + " + -h + ")^2 + (y + " + -k + ")^2 = " + R);
    }
}