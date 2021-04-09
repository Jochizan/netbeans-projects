package estructura_repetición_2;

import java.util.Scanner;

public class práctica_01 {

    public static void main(String[] args) {
        
        int limite_inf, limite_sup, num=0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el límite inferior");
        limite_inf = entrada.nextInt();
        
        System.out.println("Ingrese el límite superior");
        limite_sup = entrada.nextInt();
        
        limite_inf = limite_inf +1;
        //for para contar la cantidad de números pares en un rango:
        for(limite_inf = limite_inf; limite_inf < limite_sup; limite_inf++){
            //condición para saber si es par:
            if(limite_inf%2 == 0){
                 
               num = num + 1;
               
               if(limite_inf < limite_sup-2){
                  
                 System.out.print(limite_inf + ", ");
                 
                }else 
                  
                    System.out.print(limite_inf);
              
            }   
        }
        
        System.out.println("\nLa cantidad de números pares son: " + num);
        
    }
}