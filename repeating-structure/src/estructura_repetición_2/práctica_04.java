package estructura_repetición_2;

import java.util.Scanner;

public class práctica_04{

    public static void main(String[] args) {
        
        int num_0, sum_div = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número perfecto");
        num_0 = entrada.nextInt();
        //condional porque no existen números negativos que sean perfectos:
        if(num_0 > 0){
            //for para encontrar la suma de los divisores del número ingresado:
            for (int i = 1; i < num_0; i++) {
            
                if(num_0%i == 0){
                
                   sum_div= i + sum_div;
                
                }
            }
            if(sum_div == num_0){
            
            System.out.println("El número es perfecto");
            
            }else{
            
                System.out.println("El número no es perfecto");
                
            }
        }else{
        
            System.out.println("Error un número perfecto solo puede ser positivo");
            
        }  
    }
}