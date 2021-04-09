package problemas_de_geo;

import java.util.Scanner;
/**
 *
 * @author Rem3
 */
public class Preguntas_05 {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        double A, B, C, D, E, F;
        double A1, B1, C1, D1, E1, F1;
        double a1, b1, c1, a2, b2, c2;
        double A2, B2, C2, F2;
        
        System.out.println("Ingrese la ecuación que desea hacer una elimanción de términos lineales"
                + "\nEjm:"
                + "\nAx^2 + Bxy + Cy^2 + Dx + Ey + F = 0");
        A = entrada.nextInt();
        B = entrada.nextInt();
        C = entrada.nextInt();
        D = entrada.nextInt();
        E = entrada.nextInt();
        F = entrada.nextInt();
        
        System.out.println("Su procedera a hacer un cambio de:"
                + "\n x = x' + h"
                + "\n y = y' + k ");
        
        a1 = A*2;
        b1 = B;
        c1 = -D;
        //System.out.println(a1+ ", " +b1 + ", " + c1);
        a2 = B;
        b2 = C*2;
        c2 = -E;
        //System.out.println(a2+ ", " +b2 + ", " + c2);
        double k = ((a1*c2)-(a2*c1))/((a1*b2)-(a2*b1));
        double h = (c1-(b1*k))/a1;
        
        System.out.println("Los puntos h y k son respectivamente:\n "+ h + " y " + k);
        A1 = A;
        B1 = B;
        C1 = C;
        D1 = a1*h+b1*k-c1;
        E1 = a2*h+b2*k-c2;
        F1 = C*Math.pow(k, 2) + A*Math.pow(h, 2) + B*h*k + D*h + E*k + F;
        
        System.out.println("Eliminando los términos lineales nos saldría los siguiente: "
                + "\n" + A1 + "x'^2 + " + B1 + "x'y' + " + C1 + "y'^2 + " + D1 + "x' + " + E1 + "y' + " + F1 + " = 0"
                + "\no simplemente:"
                + "\n" + A1 + "x'^2 + " + B1 + "x'y' + " + C1 + "y'^2 + " + F1 + " = 0");
        
        if(A1 != 0 && C1 != 0){
            
            //double ángulo = Math.toDegrees(Math.atan(B1/(A1-C1)));
            double ángulo = Math.atan(B1/(A1-C1));
            ángulo = ángulo/2;
            //ángulo = ángulo*Math.PI/180;
            
            C2 = A1*Math.pow(Math.cos(ángulo), 2) + B1*(Math.cos(ángulo)*Math.cos((Math.PI/2)-ángulo))+ C1*(Math.pow(Math.cos((Math.PI/2)-ángulo), 2));
            A2 = A1*Math.pow(Math.cos((Math.PI/2)-ángulo), 2) + B1*(Math.cos(Math.PI/2)-ángulo)*Math.cos(ángulo)+ C1*(Math.pow(Math.cos(ángulo), 2));
            F2 = -F1;
            
            System.out.println("Haciendo una rotación de ejes nos saldría: "
                    + "\n" + Math.ceil(A2) + "x''^2 +  " + Math.ceil(C2) + "y''^2 = " + F2);
            
        }else{
            
            System.out.println("No se puede hacer una rotación de ejes");
        }
    }
}
