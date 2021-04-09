package problemas_de_geo;

import java.util.Scanner;

public class Preguntas_04 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double A, C, D, E, F;
        double A1, C1, D1, E1, F1, R;
        
        System.out.println("Ingrese la ecuación"
                + "\nA(x^2) + C(y^2) + Dx + Ey + F = 0");
        A = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();
        E = entrada.nextInt();
        F = entrada.nextInt();
        
        double h = D/2;
        double k = E/2;
        R = -F + (Math.pow(D/2, 2) + Math.pow(E/2, 2));
        //System.out.println(R);
        System.out.println("Ingrese los coeficientes de la recta ");
        double a = entrada.nextInt();
        double b = entrada.nextInt();
        double c = entrada.nextInt();
        
        double a1 = b;
        double b1 = -a;
        double c1;
        
        c1 = Math.sqrt(R)*Math.sqrt(Math.pow(a1, 2) + Math.pow(b1, 2));
        
        System.out.println("Las ecuaciones serían: "
                + "\n" + a1 + "x' + " + b1 + "y' + " + Math.floor(c1) + " = 0"
                + "\n" + a1 + "x' + " + b1 + "y' + " + Math.ceil(-c1) + " = 0");
    }
}
