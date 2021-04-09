package estructura_repetición_2;

import java.util.Scanner;

public class práctica_02{

    public static void main(String[] args) {
        
        int N;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad");
        N = entrada.nextInt();
        //condición de que no puede haber una cantidad de negativa de números
        if(N > 0){
            //for para ir imprimiendo los primeros "N" múltiplos de 5:
            for (int i = 0; i < N; i++) {
            
                if(i < N-1){
                    
                    System.out.print(i * 5 + ", ");
            
                }else
                    
                    System.out.println(i * 5);
            } 
        }else{
        
            System.out.println("Error ingrese números mayores a 0");
            
        }
    }
}