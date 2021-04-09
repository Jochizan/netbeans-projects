package problemas_de_geo;

import java.util.Scanner;

public class Preguntas_01 {

    public static void main(String[] args) {

        double p1, p2, q1, q2, r1, r2, s1, s2, h1, k1, c1, h2, k2, c2, h, k, R;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese los valores de los puntos"
                + "\nIngrese el punto P");
        p1 = entrada.nextInt();
        p2 = entrada.nextInt();

        System.out.println("Ingrese el punto Q");
        q1 = entrada.nextInt();
        q2 = entrada.nextInt();

        System.out.println("Ingrese el punto R");
        r1 = entrada.nextInt();
        r2 = entrada.nextInt();

        System.out.println("Ingrese el punto S");
        s1 = entrada.nextInt();
        s2 = entrada.nextInt();
        
        h1 = -p1*2-(-q1*2);
        k1 = -p2*2-(-q2*2);
        c1 = -(Math.pow(p1, 2) + Math.pow(p2, 2))+(Math.pow(q1, 2) + Math.pow(q2, 2));
        
        h2 = -r1*2-(-s1*2);
        k2 = -r2*2-(-s2*2);
        c2 = -(Math.pow(r1, 2) + Math.pow(r2, 2))+(Math.pow(s1, 2) + Math.pow(s2, 2));
        
        k =((h1*c2)-(h2*c1))/((h1*k2)-(h2*k1));
        h = (c1-(k1*k))/h1;
        R = Math.sqrt(Math.pow((p1-h), 2)+Math.pow((p2-k), 2));
        
        System.out.println("El punto centro de la circuanferencia es:"
                + "\n(" + h + ", " + k +  ")"
                        + "\ny su radio es:\n" + R 
                +"\nEntonces la ecuación de la circunferencia es: "
                + "\n( x + "+ (-h) + ")^2 + (y + "+(-k) + ")^2 = " + Math.ceil(Math.pow(R, 2)));
    }
}
