package while_01;

import java.util.Scanner;

public class while_04 {
    
    public static void main(String[] args) {
        
        int N, i = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de 'N' múltiplos de 5 que quiere imprimir");
        N = entrada.nextInt();
        
        while (i < N) {            
            
            if(i < N-1){
                
                System.out.print(5*i + ", ");
                
            }else{
            
                System.out.println(5*i);
                
            }
            i++;   
        }
        
    }
}
