package problemas_de_geo;

import java.util.Scanner;

public class Preg_01 {
    
    public static void main(String[]args){
        
        Scanner entrada = new Scanner(System.in); 
        double px,py,a1,b1,c1,h,k,R,pen,N,D;
        
        System.out.println("Ingrese el punto P ");
        px = entrada.nextInt();
        py = entrada.nextInt();
        
        System.out.println("Ingrese la ecuacion de la circunferencia: ");
        a1 = entrada.nextInt();
        b1 = entrada.nextInt();
        c1 = entrada.nextInt();
        
        h = -1*(a1/2);
        k = -1*(b1/2);
        R = (-1*c1) + Math.pow(h, 2) + Math.pow(k, 2);

        pen = -((R - Math.pow((h-1), 2))/8);
        N = (R/16);
        D = 2;
  
        System.out.println("La ecuación de la recta L1 es:" +
                  "\n " + pen*-1 + "x + " + 1 +"y" + ((-1*py)+px*pen) + " = 0" +
                  "La ecuación de la recta 2 es: " +
                  "\n"+ N + "x + "+ (D * -1)+ "y + " + ((py*D) + ((-1*px) * N)) + " = 0");
    }  
}