package estructura_repetición_2;

import java.util.Scanner;

public class práctica_03{

    public static void main(String[] args) {
        
        int N, suma_impares=0, suma_pares=0;
        Scanner entrada = new Scanner(System.in);
       
        System.out.println("Ingrese los N primeros números pares e impares que se sumarán");
        N = entrada.nextInt();
        //condición para que la cantidad sea mayor a 0:
        if(N > 0){
        //for para poner el calculo de la suma de números pares e impares:    
        for(int i = 1; i <= N; i++){
        
                suma_pares = suma_pares + i*2;
            
                suma_impares= suma_impares + i*2-1;
                  
        }
            System.out.println("La suma de pares es: " + suma_pares+"\n"
                       + "La suma de impares es: " + suma_impares);
        
        }else
            
            System.out.println("Error solo se toman valores mayores a 0");
        
    }
}