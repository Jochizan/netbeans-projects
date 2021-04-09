package while_01;

import java.util.Scanner;

public class while_05 {
    
    public static void main(String[] args) {
        
        int N, cant = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número para contar las cifras");
        N = entrada.nextInt();
        
        while(N!=0){
            
            cant = cant + 1;
            N=N/10;
            
        }
        
        System.out.println("La cantidad de digitos del números es: " + cant);
        
    }
}
