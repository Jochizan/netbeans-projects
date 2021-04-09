/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problemas_de_geometría;

import java.util.Scanner;

/**
 *
 * @author Rem3
 */
public class Problemas_de_Geometría {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       double longitud_a = 0, longitud_b = 0, longitud_a_suma_b = 0, 
               longitud_a_resta_b = 0, tres_suma_dobleab = 0;
       Scanner valor = new Scanner(System.in);
       
        System.out.println("Ingrese el valor de la longitud de a");
        longitud_a = valor.nextDouble();
       
        System.out.println("Ingrese el valor de la longitud de b");
        longitud_b = valor.nextDouble();
       
        System.out.println("Ingrese la longitud del punto |a+b|");
        longitud_a_suma_b = valor.nextDouble();
       
         if(longitud_a >= 0 && longitud_b >= 0 && longitud_a_suma_b >= 0){
             tres_suma_dobleab = Math.pow(longitud_a_suma_b,2)-(Math.pow(longitud_a,2) + Math.pow(longitud_b,2));
             longitud_a_resta_b = Math.sqrt(Math.pow(longitud_a,2)+Math.pow(longitud_b,2) - tres_suma_dobleab);
                System.out.print("La longitud de |a-b| es " + longitud_a_resta_b);

         }else{
           System.out.println("Uno o los valores ingresados son inválidos.");
         }
           
    }
    
}
