package problemas_de_geometría;

import java.util.Scanner;

public class Pregunta_02nose{
    
    public static void main(String[] args) {
        
        double a, b, c, x1, y1, x2, y2, h, k, R;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los coeficientes de la ecuación");
        a = entrada.nextInt();
        b = entrada.nextInt();
        c = entrada.nextInt();
        
        System.out.println("Ingrese el punto A");
        x1 = entrada.nextInt();
        y1 = entrada.nextInt();
        
        System.out.println("Ingrese el punto B");
        x2 = entrada.nextInt();
        y2 = entrada.nextInt();
        
        System.out.println("Recordemos que el módulo de AC es igual al módulo de BC");
        
        
        double coefh = x1*2-x2*2;
        double coefk = y1*2-y2*2;
        double sumhk = -Math.pow(x1, 2) + Math.pow(x2, 2) - Math.pow(y1, 2) + Math.pow(y2, 2);
        //coefh*h +coefk*k = sumhk;
        //h + 2k = 6
        k = ((a*sumhk)-(coefh*-c))/((a*coefk)-(b*coefh));
        h = (-c-(b*k))/a;
        
        System.out.println("El punto Centro es: (" + h + ", "+ k + ")   ");
        
        R = Math.pow(h-x1,2)+Math.pow(k-y1,2);
        
        
        System.out.println("La ecuación de la circunferencia es: "
                + "\n (x + " + -h + ")^2 +(y + " + -k + ")^2 = " + R);
    }
}