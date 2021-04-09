package problemas_de_geometría;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Puntos_medios{

    public static void main(String[] args) {
    
        double a1,b1,a2,b2,a3,b3;
        String anm;
        double an, bn, am, bm, añ, bñ, as, bs, a4, b4, a5, b5, a6, b6;
        double alm1, blm1, clm1, alm2, blm2, clm2, alm3, blm3, clm3; 
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Ingrese los puntos A, B y C");
        anm = JOptionPane.showInputDialog("Ingrese el número");
        an = Double.parseDouble(anm);
        bn = sc.nextDouble();
        am = sc.nextDouble();
        bm = sc.nextDouble();
        añ = sc.nextDouble();
        bñ = sc.nextDouble();
        
        a4 = 2*(an);
        b4 = 2*(bn);
        a5 = 2*(am);
        b5 = 2*(bm);
        a6 = 2*(añ);
        b6 = 2*(bñ);
        
        as = an + am + añ ;
        bs = bn + bm + bñ; 
        
        a1 = as - a4;
        a2 = as - a5;
        a3 = as - a6;
        b1 = bs - b4;
        b2 = bs - b5;
        b3 = bs - b6;
         
        System.out.println("Los puntos A, B y C son respectivamente:\n"
                    + "(" + a1 +", "+ b1 + "), (" + a2 + ", " + b2 + "), (" + a3 + ", " + b3 + ")");
        
        alm1 = -(b1 - b2);
        blm1 = (a1 - a2);
        clm1 = (-(b1 - b2) * (-a2)) + ((a1 - a2) * (-b2));

        alm2 = -(b2 - b3);
        blm2 = (a2 - a3);
        clm2 = (-(b2 - b3) * (-a3)) + ((a2 - a3) * (-b3));

        alm3 = -(b3 - b1);
        blm3 = (a3 - a1);
        clm3 = (-(b3 - b1) * (-a1)) + ((a3 - a1) * (-b1));
        
        if(alm1 > 0 && alm2 > 0 && alm3 > 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + alm1 + "x + " + blm1 + "y + " + clm1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + alm2 + "x + " + blm2 + "y + " + clm2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + alm3 + "x + " + blm3 + "y + " + clm3 + " = 0");
        
        }else if(alm1 < 0 && alm2 > 0 && alm3 >0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + -alm1 + "x + " + -blm1 + "y + " + -clm1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + alm2 + "x + " + blm2 + "y + " + clm2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + alm3 + "x + " + blm3 + "y + " + clm3 + " = 0");
        
        }else if(alm1 < 0 && alm2 < 0 && alm3 > 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + -alm1 + "x + " + -blm1 + "y + " + -clm1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + -alm2 + "x + " + -blm2 + "y + " + -clm2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + alm3 + "x + " + blm3 + "y + " + clm3 + " = 0");
        
        }else if(alm1 < 0 && alm2 < 0 && alm3 < 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + -alm1 + "x + " + -blm1 + "y + " + -clm1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + -alm2 + "x + " + -blm2 + "y + " + -clm2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + -alm3 + "x + " + -blm3 + "y + " + -clm3 + " = 0");
        
        }else if(alm1 > 0 && alm2 > 0 && alm3 < 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + alm1 + "x + " + blm1 + "y + " + clm1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + alm2 + "x + " + blm2 + "y + " + clm2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + -alm3 + "x + " + -blm3 + "y + " + -clm3 + " = 0");
        
        }else if(alm1 > 0 && alm2 < 0 && alm3 < 0){
         
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + alm1 + "x + " + blm1 + "y + " + clm1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + -alm2 + "x + " + -blm2 + "y + " + -clm2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + -alm3 + "x + " + -blm3 + "y + " + -clm3 + " = 0");
        
        }else if(alm1 > 0 && alm2 < 0 && alm3 > 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + alm1 + "x + " + blm1 + "y + " + clm1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + -alm2 + "x + " + -blm2 + "y + " + -clm2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + alm3 + "x + " + blm3 + "y + " + clm3 + " = 0");
        
        }else if(alm1 < 0 && alm2 > 0 && alm3 < 0){
            
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + -alm1 + "x + " + -blm1 + "y + " + -clm1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + alm2 + "x + " + blm2 + "y + " + clm2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + -alm3 + "x + " + -blm3 + "y + " + -clm3 + " = 0");
        }else {
        
        System.out.println("La ecuación de la intersección  de L1 y L2 con la mediana opuesta es:\n"
                + alm1 + "x + " + blm1 + "y + " + clm1 + " = 0\n"
                + "La ecuación de la intersección  de L2 y L3 con la mediana opuesta es:\n"
                + alm2 + "x + " + blm2 + "y + " + clm2 + " = 0\n"
                + "La ecuación de la intersección  de L3 y L1 con la mediana opuesta es:\n"
                + alm3 + "x + " + blm3 + "y + " + clm3 + " = 0");
        
        }
    }
}