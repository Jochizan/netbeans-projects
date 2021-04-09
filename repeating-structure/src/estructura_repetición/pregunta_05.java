package estructura_repetición;

import java.util.Scanner;

public class pregunta_05{

    public static void main(String[] args) {
        
        int num_0 = 0;
        double medias_posis = 1, medias_negas, num_n;
        Scanner entrada = new Scanner(System.in);
        
        for(int i = 1; i <= 10; i++){
       
            System.out.println("Ingrese el num de orden " + i);
            num_n = entrada.nextDouble();
            if(num_n == 0){
                
                num_0 = num_0 + 1;
            }
            
        }
        
        
        System.out.println(num_0);
    }
    
}