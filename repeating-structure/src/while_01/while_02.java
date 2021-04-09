package while_01;

import java.util.Scanner;

public class while_02 {

    public static void main(String[] args) {
        
        int inf, sup, cant = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el rango inferior");
        inf = entrada.nextInt();
        
        System.out.println("Ingrese el rango superior");
        sup = entrada.nextInt();
        
        int i = inf + 1;
        //while para contar enteros en un rango:
        while (i < sup || inf > i) {            
            
            cant = cant + 1;
            i++;
            
        }
        System.out.println("La cantidad de enteros es: " + cant);
    }
}