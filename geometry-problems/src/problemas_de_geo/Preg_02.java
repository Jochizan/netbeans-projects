package problemas_de_geo;

import java.util.Scanner;

public class Preg_02 {
    
    public static void main(String[] args) {
        
         Scanner entrada=new Scanner(System.in);
         double a, b, c, a1, b1, c1,rest_1, rest_2,rest_3,x1,y1,x2,y2,vin;
        
         System.out.println("Ingrese la ecuacion de la circunferencia C1:");
         a = entrada.nextInt();
         b = entrada.nextInt();
         c = entrada.nextInt();
        
         System.out.println("Ingrese la ecuacion de la circunferencia C2:");
         a1 = entrada.nextInt();
         b1 = entrada.nextInt();
         c1 = entrada.nextInt();
        
         rest_1 = (a - a1)/12;
         rest_2 = (b - b1)/12;
         rest_3 = (c - c1)/12;

         vin = ((2*rest_1*rest_3) + a1 + (b1*rest_1));
         
         x1 = ((-1*vin) + Math.sqrt(Math.pow(vin, 2)-(4*((-1*b1)+1)*(Math.pow(rest_3, 2)+(b1*rest_3)+c1))))/(2*((-1*b1)+1));
         y1 = rest_3 - (2*x1);
         
         x2 = ((-1*vin) - Math.sqrt(Math.pow(vin, 2)-(4*((-1*b1)+1)*(Math.pow(rest_3, 2)+(b1*rest_3)+c1))))/(2*((-1*b1)+1));
         y2 = rest_3 - (2*x2);
        
            System.out.println("Los puntos son:"
                    + "\n(" + x1 + ", " + y1 + ") y (" + x2 + ", "+y2+")");
    }
}