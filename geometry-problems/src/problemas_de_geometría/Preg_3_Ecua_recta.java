package Problemas_de_Geometría;

import java.util.Scanner;

/**
 * 
 * @author Joan Roca Hormaza
 * @version 1.0(xDe)
 */
public class Preg_3_Ecua_recta{
  public static void main(String args[]){
        //variables:
        double BP,PC,a,b,c,d,e,f;
        Scanner valor = new Scanner(System.in);
        //entradas:
        System.out.println("\nRecuerde que cuando te pida el valor en ([0],[1]) se refiere a (x,y)");
        //aquí declaro variables para el punto P.
        double puntoP[] = new double[2];
            puntoP[0] = 0;//(x)
            puntoP[1] = 0;//(y)
        //utlización del for y length para que nos vaya pidiendo valor de posición([0],[1] = (x,y)).
        for (int x = 0; x < puntoP.length; x++) {

            System.out.println("Introduzca el valor del punto P de la posición [" + x + "]");
            puntoP[x] = valor.nextDouble();
        //aquí pido que me introduzcan a que valor son proporcionales BP y PC, y como también se relacionan.
        }
           System.out.println("¿BP es directamente proporcional a?");
           BP = valor.nextDouble();
           //2
           System.out.println("¿PC es directamente proporcional a?");
           PC = valor.nextDouble();
           //3
        double coef_1[] = new double[3];// creación de los coeficientes de la ecuación de la recta L1.
        coef_1[0] = 0;//(a1) ax +by+c=0
        coef_1[1] = 0;//(b1)
        coef_1[2] = 0;//(c1)
        //aquí lo mismo que con el punto P
        for (int x = 0; x < coef_1.length; x++) {

            System.out.println("Introduzca el coeficiente de la ecuación L1 de posición [" + x + "]");
            coef_1[x] = valor.nextDouble();

        }
        
        double coef_2[] = new double[3];// creación de los coeficientes de la ecuación de la recta L2.
        coef_2[0] = 0;//(a2)
        coef_2[1] = 0;//(b2)
        coef_2[2] = 0;//(c2)

        for (int x = 0; x < coef_2.length; x++) {

            System.out.println("Introduzca el coeficiente de la ecuación L2 de posición [" + x + "]");
            coef_2[x] = valor.nextDouble();

        }
        //Aquí la declaración de los puntos B=(x1,y1) y C(x2,y2).
        double PuntoBL1x = 0;//x1
        double PuntoBL1y = 0;//y1

        double PuntoCL2x = 0;//x2
        double PuntoCL2y = 0;//y2
        //procesos:
        a=-PC;//guardo -PC en "a" ("a" es la variable para las dos ecuaciones con dos variables) 
        b=-BP;                              // a.x1 + b.x2 = c
        c=(-puntoP[0]*PC)+ BP*(-puntoP[0]); // d.x1 + e.x2 = f
        d=((coef_1[0]/coef_1[1])*PC*coef_2[1]);
        e=-(BP*(-coef_2[0]));
        f=-(((puntoP[1]-(coef_1[2]/-coef_1[1]))*coef_1[1])/coef_1[1]*PC*coef_2[1])
                +(BP*(-coef_2[2]+(coef_2[1]*-puntoP[1])));

        PuntoCL2x=((f * a) - (d * c)) / ((e * a) - (d * b));//con estas lineas de codigó se puede hallar el
        PuntoBL1x=(c - (b * PuntoCL2x)) / a;                //valor de x1 y x2 con solo sus coefcientes.
        
        PuntoBL1y=-(((coef_1[0]/coef_1[1])*PuntoBL1x)+coef_1[2]/coef_1[1]);//guardo el valor reemplazando en
        PuntoCL2y=-(((coef_2[0]/coef_2[1])*PuntoCL2x)+coef_2[2]/coef_2[1]);//la ecución de la recta.
        //Aqui declaració de variables para guardar los coeficientes de la ecuación de la recta que nos pidió.
        double coef_3[] = new double[3];    
        coef_3[0] = 0;//(a3)
        coef_3[1] = 0;//(b3)
        coef_3[2] = 0;//(c3)
        //El cálculo de dichos coeficientes con los valores del punto P y del punto B.
        coef_3[0] = -(PuntoBL1y - puntoP[1]);
        coef_3[1] = (PuntoBL1x-puntoP[0]);
        coef_3[2] = (-(PuntoBL1y - puntoP[1])*(-puntoP[0]))+((PuntoBL1x-puntoP[0])*(-puntoP[1]));
        //salidas:
        System.out.println("Los puntos B y C son:\n" 
                + "(" + PuntoBL1x + ", " + PuntoBL1y + ")" + " y " + "(" + PuntoCL2x + ", " + PuntoCL2y + ")");
        
        System.out.println("Las ecaciones que se forman son:\n"
                + a +"x1 + " + b + "x2 = " + c +"\n"
                + d +"x1 + " + e + "x2 = " + f );
        
        System.out.println("La ecuación de la recta es:\n"
                + coef_3[0] + ".x + " + coef_3[1] + ".y + " + coef_3[2] + " = 0");
        
  }
}