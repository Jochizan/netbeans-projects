package while_01;

import java.util.Scanner;

public class while_03 {
    
    public static void main(String[] args) {
        
        int inf, sup, suma_p = 0, cant = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el rango inferior");
        inf = entrada.nextInt();
        
        System.out.println("Ingrese el rango superior");
        sup = entrada.nextInt();
        
        inf = inf + 1;
        
        while(inf < sup){
            
            if(inf%2 == 0){
            
                suma_p = suma_p + inf;
                cant++;  
            }
            inf++;
        }
        
            System.out.println("La suma de los términos pares en el rango dado es: " + suma_p + " y la cantidad es: " + cant);
        
    }
}
