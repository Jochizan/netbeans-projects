package estructura_repetición_2;

import java.util.Scanner;

public class práctica_07{

    public static void main(String[] args) {
        
        int num_primo, div = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número para determinar si es primo");
        num_primo = entrada.nextInt();
        //for para ir contando la cantidad de divisores del número ingresado
        for (int i = 1; i <= num_primo; i++) {
            
            if(num_primo%i == 0){
            
                div++;
                
            }
            
        }
        if(div == 1){
        
            System.out.println("El número es el unitario");
            
        }else if(div == 2){
            
            System.out.println("El número es primo");
            
        }else
            
            System.out.println("El número no es primo");
            
    }
}