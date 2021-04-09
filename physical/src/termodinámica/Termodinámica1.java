package termodinámica;

import java.util.Scanner;

/**
 *
 * @author Joan y Rem3
 */
public class Termodinámica1 {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        int opcion; 
        String[] Variables = {"Q", "W", "AU", "P", "V", "T"};
        double[] Variabless = new double[6];
        
        System.out.println("Bienvenido este programa cálcula ejercicios de Termodinámica básicos\n"
                       + "\nOpciones:\tProcesos:"
                       + "\n   1).\t\tIsobárico"
                       + "\n   2).\t\tIsotérmico"
                       + "\n   3).\t\tIsocórico"
                       + "\n   4).\t\tAdiabático");
        opcion = entrada.nextInt();
        
        if (opcion == 1) {
            
            System.out.println("Su proceso es Isobárico"
                           + "\nP = cte");
            
            for (int i = 0; i < Variables.length; i++) {
                
                System.out.print("Ingrese el valor de:\n" + Variables[i] + ": ");
                Variables[i] = entrada.nextLine();
                
            }
            for (int i = 0; i < Variabless.length; i++) {
                
                Variabless[i] = Integer.parseInt(Variables[i]);
                
            }
        } else if(opcion == 2) {
            
            System.out.println("Su proceso es Isotérmico"
                           + "\nT = cte");
            
            for (int i = 0; i < Variables.length; i++) {
                
                System.out.print("Ingrese el valor de:\n" + Variables[i] + ": ");
                Variables[i] = entrada.nextLine();
                
            }
            for (int i = 0; i < Variabless.length; i++) {
                
                Variabless[i] = Integer.parseInt(Variables[i]);
                
            }
        } else if(opcion == 3) {
            
            System.out.println("Su proceso es Isocórico"
                           + "\nV = cte");
            
            for (int i = 0; i < Variables.length; i++) {
                
                System.out.print("Ingrese el valor de:\n" + Variables[i] + ": ");
                Variables[i] = entrada.nextLine();
                
            }
            for (int i = 0; i < Variabless.length; i++) {
                
                Variabless[i] = Integer.parseInt(Variables[i]);
                
            }
        } else if(opcion == 4) {
            
            System.out.println("Su proceso es Adiabático"
                           + "\nTo = Tf ");
            
            for (int i = 0; i < Variables.length; i++) {
                
                System.out.print("Ingrese el valor de:\n" + Variables[i] + ": ");
                Variables[i] = entrada.nextLine();
                
            }
            for (int i = 0; i < Variabless.length; i++) {
                
                Variabless[i] = Integer.parseInt(Variables[i]);
                
            }
        }
    }
}
