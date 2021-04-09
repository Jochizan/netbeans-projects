package Problemas_de_Geometría;

import java.util.Scanner;

public class Punto_Mediana_Bisectriz{

    public static void main(String[] args) {
        
        double a1, b1, c1, a2, b2, c2, cm1, cm2, xa1, ya1, mAB, mBC, mCA, m1, m2, parteizBC;
        double xb1, yb1, xc1, yc1, a3, b3, c3, a4, b4, c4, a5, b5, c5;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el punto A");
        xa1 = entrada.nextDouble();
        ya1 = entrada.nextDouble();
        
        System.out.println("Ingrese los coeficientes de la ecuación de la bisectriz 'L1'");
        a1 = entrada.nextDouble();
        b1 = entrada.nextDouble();
        c1 = entrada.nextDouble();
        
        System.out.println("Ingrese los coeficientes de la ecuación de la mediana 'L2'");
        a2 = entrada.nextDouble();
        b2 = entrada.nextDouble();
        c2 = entrada.nextDouble();
        //punto A:
        //xa1 = 3;
        //ya1 = -1;
        //coeficientes de L1
        //a1 = 1;
        //b1 = -4;
        //c1 = 10;
        m1 = -(a1/b1);
        //coeficientes de L2
        //a2 = 6;
        //b2 = 10;
        //c2 = -59;
        m2 = -(a2/b2);
        //El  valor reemplazando el punto M
        cm2 = -c2-((ya1*b2/2) + (xa1*(a2/2)));
        cm1 = -c1;
        
        yb1 = ((a2/2 * cm1)-(a1 * cm2))/((b1 * a2/2)-(b2/2 * a1));
        xb1 = -((-cm1 + (b1 * yb1))/a1);
        
        System.out.println("El punto B es: (" + xb1 + ", " + yb1 +")");
        
        mAB = (ya1-yb1)/(xa1-xb1);
        
        System.out.println("La pendiente de L1 es: " + m1 
                + "\nLa pendiente de L2 es: " + m2
                + "\nLa pendiente de AB es: " + mAB);
        
        parteizBC = (mAB - m1)/(1 + (m1*mAB));
        
        mBC = (m1-(parteizBC))/((m1 * parteizBC)+ 1);
        
        System.out.println("La pendiente de BC es: " + mBC);
        
        a3 = mBC*9;
        b3 = -Math.pow(-mBC, -1)*2;
        c3 = -(mBC*9*(xb1)-Math.pow(-mBC, -1)*2*yb1);
        
        yc1 = ((a2*-c3)-(a3*-c2))/((a2*b3)-(a3*b2));
        xc1 = (-c2-(b2*yc1))/a2;
        
        mCA = (yc1-ya1)/(xc1-xa1);
        
        System.out.println("El punto C es: (" + xc1 + ", "+yc1 +")"
                + "\nLa pendiente de CA es: " + mCA);
        
        a4 = -(yb1-ya1);
        b4 = (xb1-xa1);
        c4 = (-(yb1-ya1)*(-xa1))+((xb1-xa1)*(-ya1));
        
        //a3 = -(yc1-yb1);
        //b3 = (xc1-xb1);
        //c3 = (-(yc1-yb1)*(-xb1))+((xc1-xb1)*(-yb1));
        
        a5 = -(ya1-yc1);
        b5 = (xa1-xc1);
        c5 = (-(ya1-yc1)*(-xc1))+((xa1-xc1)*(-yc1));
        
        if(a3 > 0 && a4 > 0 && a5 > 0){
            
        System.out.println("La ecuación del lado AB es:"
                + "\n" + a4 + "x + " + b4 + "y + " + c4 + " = 0"
                + "\n La ecuación del lado BC es: "
                + "\n" + a3 + "x + " + b3 + "y + " + c3 + " = 0"
                + "\nLa ecuación del lado CA es:"
                + "\n" + a5 + "x + " + b5 + "y + " + c5 + " = 0");
        
        }else if(a3 < 0 && a4 > 0 && a5 >0){
            
        System.out.println("La ecuación del lado AB es:"
                + "\n" + a4 + "x + " + b4 + "y + " + c4 + " = 0"
                + "\n La ecuación del lado BC es: "
                + "\n" + -a3 + "x + " + -b3 + "y + " + -c3 + " = 0"
                + "\nLa ecuación del lado CA es:"
                + "\n" + a5 + "x + " + b5 + "y + " + c5 + " = 0");
        
        }else if(a3 < 0 && a4 < 0 && a5 > 0){
            
        System.out.println("La ecuación del lado AB es:"
                + "\n" + -a4 + "x + " + -b4 + "y + " + -c4 + " = 0"
                + "\n La ecuación del lado BC es: "
                + "\n" + -a3 + "x + " + -b3 + "y + " + -c3 + " = 0"
                + "\nLa ecuación del lado CA es:"
                + "\n" + a5 + "x + " + b5 + "y + " + c5 + " = 0");
        
        }else if(a3 < 0 && a4 < 0 && a5 < 0){
            
        System.out.println("La ecuación del lado AB es:"
                + "\n" + -a4 + "x + " + -b4 + "y + " + -c4 + " = 0"
                + "\n La ecuación del lado BC es: "
                + "\n" + -a3 + "x + " + -b3 + "y + " + -c3 + " = 0"
                + "\nLa ecuación del lado CA es:"
                + "\n" + -a5 + "x + " + -b5 + "y + " + -c5 + " = 0");
        
        }else if(a3 > 0 && a4 > 0 && a5 < 0){
            
        System.out.println("La ecuación del lado AB es:"
                + "\n" + a4 + "x + " + b4 + "y + " + c4 + " = 0"
                + "\n La ecuación del lado BC es: "
                + "\n" + a3 + "x + " + b3 + "y + " + c3 + " = 0"
                + "\nLa ecuación del lado CA es:"
                + "\n" + -a5 + "x + " + -b5 + "y + " + -c5 + " = 0");
        
        }else if(a3 > 0 && a4 < 0 && a5 < 0){
         
        System.out.println("La ecuación del lado AB es:"
                + "\n" + -a4 + "x + " + -b4 + "y + " + -c4 + "= 0"
                + "\n La ecuación del lado BC es: "
                + "\n" + a3 + "x + " + b3 + "y + " + c3 + "= 0"
                + "\nLa ecuación del lado CA es:"
                + "\n" + -a5 + "x + " + -b5 + "y + " + -c5 + "= 0");
        
        }else if(a3 > 0 && a4 < 0 && a5 > 0){
            
        System.out.println("La ecuación del lado AB es:"
                + "\n" + -a4 + "x + " + -b4 + "y + " + -c4 + "= 0"
                + "\n La ecuación del lado BC es: "
                + "\n" + a3 + "x + " + b3 + "y + " + c3 + "= 0"
                + "\nLa ecuación del lado CA es:"
                + "\n" + a5 + "x + " + b5 + "y + " + c5 + "= 0");
        
        }else {
            
        System.out.println("La ecuación del lado AB es:"
                + "\n" + a4 + "x + " + b4 + "y + " + c4 + " = 0"
                + "\n La ecuación del lado BC es: "
                + "\n" + -a3 + "x + " + -b3 + "y + " + -c3 + " = 0"
                + "\nLa ecuación del lado CA es:"
                + "\n" + -a5 + "x + " + -b5 + "y + " + -c5 + " = 0");
        
        }
    }
}