//package estructura_repetición_2;

import java.util.Scanner;

public class práctica_08_01{

    public static void main(String[] args) {
        
        int num_o, num_inf, num_sup, num_n = 0, cant_cap = 0, resto;
        Scanner entrada = new  Scanner(System.in);
        
        System.out.println("Ingresa el limite inferior");
        num_inf = entrada.nextInt();
        
        System.out.println("Ingresa el limite superior");
        num_sup = entrada.nextInt();
        
        if(num_inf > 10){
              //for para ir contando los números que hay en todo el rango dado:
              for (num_inf = num_inf; num_inf < num_sup; num_inf++) {
               //reset para volver al for anidado:
               num_o=num_inf;
               num_n = 0;
               //for anidado para evaluar cada número y ver si su inverso es igual al número original:
               for (num_o=num_o; num_o > 0; num_o /= 10) {
            
                   resto = num_o%10;
                   num_n = num_n * 10 + resto;
                 
                   if(num_inf == num_n){
                
                   cant_cap++;
                
                   }
               }  
           }
         }else{
        
            System.out.println("Solo se tomara un limite inferior mayor a 10");
            
        }
        System.out.println("La cantidad de números capicuas es: " + cant_cap);
    }
}
 