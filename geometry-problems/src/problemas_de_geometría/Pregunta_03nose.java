package problemas_de_geometría;

import java.util.Scanner;

public class Pregunta_03nose{
    
    public static void main(String[] args) {
        
        double a1, b1, c1, a2, b2, c2, a3, b3, c3;
        double x1, y1, x2, y2, xc, yc, R;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los coeficientes de la 1 ecuación de la recta tangente por las que pasan por la circunferencia");
        a1 = entrada.nextInt();
        b1 = entrada.nextInt();
        c1 = entrada.nextInt();
        
        System.out.println("Ingrese los coeficientes de la 2 ecuación de la recta tangente por las que pasan por la circunferencia");
        a2 = entrada.nextInt();
        b2 = entrada.nextInt();
        c2 = entrada.nextInt();
        
        System.out.println("Ingrese la ecuación de la recta que pasa por el centro de la circunferencia");
        a3 = entrada.nextInt();
        b3 = entrada.nextInt();
        c3 = entrada.nextInt();
        //a1x + b1y = c1
        //a3x + b3y = c3
        y1 = ((a1*-c3)-(a3*-c1))/((a1*b3)-(a3*b1));
        x1 = (-c1-(b1*y1))/a1;
        
        y2 = (((a2*-c3)-(a3*-c2))/((a2*b3)-(a3*b2)));
        x2 = ((-c2-(b2*y2))/a2);
        
        xc = (x1 + x2)/2;
        yc = (y1 + y2)/2;
        
        System.out.println("El punto Centro es:"
                + "\n (" + xc + ", " + yc + ")");
        
        R = Math.abs(((xc*a1)+(yc*b1)+c1)/Math.sqrt(Math.pow(a1, 2)+ Math.pow(b1, 2)));
        
        System.out.println("La ecuación de la circunferencia es:"
                + "\n (x + " + -xc + ")^2 +(y + " + -yc + ")^2 = " + Math.pow(R, 2));
    }
}