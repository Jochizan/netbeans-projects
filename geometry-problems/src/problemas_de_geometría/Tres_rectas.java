package Problemas_de_Geometría;

import java.util.Scanner;

/**
 *
 * @author Joan Roca Hormaza 
 * @version 1.0(xdxd)
 */
public class Tres_rectas {

    public static void main(String[] args) {

        double a, b, c, d, e, f, g, h, i;
        double x1, x2, x3, a1, b1, c1, xm1, xm2, xm3;
        double y1, y2, y3, a2, b2, c2, ym1, ym2, ym3;
        double             a3, b3, c3;
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el los coeficientes la ecuación de L1");
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();

        System.out.println("Ingrese el los coeficientes la ecuación de L2");
        d = sc.nextDouble();
        e = sc.nextDouble();
        f = sc.nextDouble();

        System.out.println("Ingrese el los coeficientes la ecuación de L3");
        g = sc.nextDouble();
        h = sc.nextDouble();
        i = sc.nextDouble();

        y1 = ((a * -f) - (d * -c)) / ((e * a) - (d * b));
        x1 = (-c - (b * y1)) / a;

        y2 = ((d * -i) - (g * -f)) / ((h * d) - (g * e));
        x2 = (-f - (e * y2)) / d;

        y3 = ((g * -c) - (a * -i)) / ((b * g) - (a * h));
        x3 = (-i - (h * y3)) / g;

        System.out.println("El punto entre L1 y L2 es:\n"
                + "(" + x1 + ", " + y1 + ")\n"
                + "entre L2 y L3 es:\n"
                + "(" + x2 + ", " + y2 + ")\n"
                + "entre L3 y L1 es:\n"
                + "(" + x3 + ", " + y3 + ")");

        xm1 = (x2 + x3) / 2;
        ym1 = (y2 + y3) / 2;

        xm2 = (x3 + x1) / 2;
        ym2 = (y3 + y1) / 2;

        xm3 = (x1 + x2) / 2;
        ym3 = (y1 + y2) / 2;

        System.out.println("Los puntos de las medianas del triángulo que se formo son:\n"
                + "(" + xm1 + ", " + ym1 + "), (" + xm2 + ", " + ym2 + "), (" + xm3 + ", " + ym3 + ")");

        a1 = -(y1 - ym1);
        b1 = (x1 - xm1);
        c1 = (-(y1 - ym1) * (-xm1)) + ((x1 - xm1) * (-ym1));

        a2 = -(y2 - ym2);
        b2 = (x2 - xm2);
        c2 = (-(y2 - ym2) * (-xm2)) + ((x2 - xm2) * (-ym2));

        a3 = -(y3 - ym3);
        b3 = (x3 - xm3);
        c3 = (-(y3 - ym3) * (-xm3)) + ((x3 - xm3) * (-ym3));
        /* 
        a1 = -(y1 - y2);
        b1 = (x1 - x2);
        c1 = (-(y1 - y2)*(-x2))+((x1-x2)*(-y2));
         */
        if(a1 > 0 && a2 > 0 && a3 > 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + a1 + "x + " + b1 + "y + " + c1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + a2 + "x + " + b2 + "y + " + c2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + a3 + "x + " + b3 + "y + " + c3 + " = 0");
        
        }else if(a1 < 0 && a2 > 0 && a3 >0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + -a1 + "x + " + -b1 + "y + " + -c1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + a2 + "x + " + b2 + "y + " + c2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + a3 + "x + " + b3 + "y + " + c3 + " = 0");
        
        }else if(a1 < 0 && a2 < 0 && a3 > 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + -a1 + "x + " + -b1 + "y + " + -c1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + -a2 + "x + " + -b2 + "y + " + -c2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + a3 + "x + " + b3 + "y + " + c3 + " = 0");
        
        }else if(a1 < 0 && a2 < 0 && a3 < 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + -a1 + "x + " + -b1 + "y + " + -c1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + -a2 + "x + " + -b2 + "y + " + -c2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + -a3 + "x + " + -b3 + "y + " + -c3 + " = 0");
        
        }else if(a1 > 0 && a2 > 0 && a3 < 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + a1 + "x + " + b1 + "y + " + c1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + a2 + "x + " + b2 + "y + " + c2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + -a3 + "x + " + -b3 + "y + " + -c3 + " = 0");
        
        }else if(a1 > 0 && a2 < 0 && a3 < 0){
         
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + a1 + "x + " + b1 + "y + " + c1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + -a2 + "x + " + -b2 + "y + " + -c2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + -a3 + "x + " + -b3 + "y + " + -c3 + " = 0");
        
        }else if(a1 > 0 && a2 < 0 && a3 > 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + a1 + "x + " + b1 + "y + " + c1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + -a2 + "x + " + -b2 + "y + " + -c2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + a3 + "x + " + b3 + "y + " + c3 + " = 0");
        
        }else if(a1 < 0 && a2 > 0 && a3 < 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + -a1 + "x + " + -b1 + "y + " + -c1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + a2 + "x + " + b2 + "y + " + c2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + -a3 + "x + " + -b3 + "y + " + -c3 + " = 0");
        }else {
        
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + a1 + "x + " + b1 + "y + " + c1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + a2 + "x + " + b2 + "y + " + c2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + a3 + "x + " + b3 + "y + " + c3 + " = 0");
        
        }
    }
}
