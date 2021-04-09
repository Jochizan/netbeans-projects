package instrucciones_de_control;

import java.util.Scanner;

public class Preg_4_SC{

    public static void main(String[] args) {
    
        int num_m;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("El número de meses de un año es 12\n"
                + "Ingrese un mes: ");
        num_m = entrada.nextInt();
        
        if(num_m > 0 && num_m < 4){
            
                             System.out.println("Verano");
                       
        }else if(num_m > 3 && num_m < 7){
            
                             System.out.println("Otoño");
                
        }else if(num_m > 6 && num_m < 10){
            
                             System.out.println("Invierno");
                     
        }else if(num_m > 9 && num_m < 13){
            
                             System.out.println("Primavera");
                             
        }else
            
            System.out.println("Solo ingrese un número de los meses que tiene un año");
        
    }
}
