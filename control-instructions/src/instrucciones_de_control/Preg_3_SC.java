package instrucciones_de_control;

import java.util.Scanner;
//INCIO
public class Preg_3_SC {
   
    public static void main(String[] args) {
        //variables:
        double num_1, num_2, resultado;
        String parametro ;
        Scanner entrada = new Scanner(System.in);
        //entrada:
        System.out.println("\tOperador\tResultado\n"
                + "\t    +\t\tsuma\n"
                + "\t    -\t\tresta\n"
                + "\t    *\t\tmultiplicación\n"
                + "\t    /\t\tdivisión\n");
        
        System.out.println("Ingrese el primer valor");
        num_1 = entrada.nextInt();
        
        System.out.println("Ingrese la operación");
        parametro = entrada.next();

        System.out.println("Ingrese el segundo valor");
        num_2 = entrada.nextInt();
        //procesos:
        switch (parametro) {
        //salidas:
            case "+":
                resultado = num_1 + num_2;
                System.out.println("El resultado de su suma es:\n= " + resultado);
                break;
         //salidas:
            case "-":
                resultado = num_1 - num_2;
                System.out.println("El resultado de su resta es:\n= " + resultado);
                break;
         //salidas:
            case "*":
                resultado = num_1 * num_2;
                System.out.println("El resultado de su multiplicación es:\n= " + resultado);
                break;
         //salidas:
            case "/":
                if (num_2 != 0) {
                    resultado = num_1 / num_2;
                    System.out.println("El resultado de su división es:\n= " + resultado);
         //salidas:           
                }else
                    
                    System.out.println("\n= 0");
                    break;
         //salidas:    
            default: 
                       System.out.println("Esa no es una operación");
                       break;
        //             
        }
    }
}
