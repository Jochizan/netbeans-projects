package while_01;

import java.util.Scanner;

public class while_01 {
    
    public static void main(String[] args) {
        
        int i = 1, n, suma = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese los 'n' primeros números positivos");
        n = entrada.nextInt();
        
        if(n > 0){
            
            while (i <= n) {
                
                 suma = suma + i;
                 i++;
                 
            }
            
            System.out.println("La suma es: " + suma);
            
        }else{
        
            System.out.println("La cantidad 'n' solo puede ser positivo");
            
        }
    }
}
