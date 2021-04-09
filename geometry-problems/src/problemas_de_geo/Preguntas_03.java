package problemas_de_geo;

import java.util.Scanner;

public class Preguntas_03 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double A, C, D, E, F;
        
        System.out.println("Hacer el cambio en la ecuación:"
                + "\n A(x^2) +  C(y^2) + Dx - Ey + F = 0, con:"
                + "\nx = x' + h "
                + "\ny = y' + k");
        System.out.println("Ingrese los coefcientes de la ecuación: ");
        A = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();
        E = entrada.nextInt();
        F = entrada.nextInt();
        
        System.out.println("Ingrese el punto (h, k): ");
        double h = entrada.nextInt();
        double k = entrada.nextInt();
        
        double A1 = A;
        double C1 = C;
        double D1 = A*2*h + D;
        double E1 = C*2*k + E;
        double F1 = A*Math.pow(h, 2) + C*Math.pow(k, 2) + D*h + E*k + F;
        
        System.out.println("La ecuación resultante es: "
                + "\n" + A1 + "(x'^2) + " + C1 + "(y'^2) + " + D1 + "x' + " + E1 + " y' + " + F1 +" = 0");
    }
}