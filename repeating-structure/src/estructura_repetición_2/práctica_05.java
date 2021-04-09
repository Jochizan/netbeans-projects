package estructura_repetición_2;

import java.util.Scanner;

public class práctica_05{

    public static void main(String[] args) {
        
        int num_1, num_2, suma_div1 = 0, suma_div2 = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese en número 1");
        num_1 = entrada.nextInt();
        
        System.out.println("Ingrese el número 2");
        num_2 = entrada.nextInt();
        //for para la suma de divisores del primer número
        for (int i = 1; i < num_1; i++) {
            
            if(num_1%i == 0){
            
                suma_div1 = suma_div1 + i;
                
            }
        }//for para la suma de divisores del segundo número
        for (int j = 1; j < num_2; j++) {
            
            if(num_2%j == 0){
            
                suma_div2 = suma_div2 + j;
                
            }   
        }
        if(suma_div1 == num_2 && suma_div2 == num_1){
            
                System.out.println("Si son números amigos");
                
            }else
                
                System.out.println("No son números amigos");
    }
}