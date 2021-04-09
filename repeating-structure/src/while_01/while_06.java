package while_01;

import java.util.Scanner;

public class while_06 {
    
    public static void main(String[] args) {
        
        int N, num_inv = 0, resto=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número");
        N = entrada.nextInt();
        
        while(N != 0){
        
            resto = N%10;
            num_inv = num_inv*10 + resto;
            N = N/10;
        }
        
        System.out.println("El número invertido es: " + num_inv);
        
    }
}
