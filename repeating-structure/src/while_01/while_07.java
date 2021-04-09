package while_01;

import java.util.Scanner;

public class while_07 {
    
    public static void main(String[] args) {
        
        int n, i = 1, num_l1, num_l2, suma1 = 0, suma2 = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese la cantidad de números de las listas");
        n = entrada.nextInt();
        
        while(n >= i){
                
            System.out.println("Ingrese el número de la lista 1 de pos.[" + i + "]");
            num_l1 = entrada.nextInt();
                
            suma1 = num_l1 + suma1;
                
            System.out.println("Ingrese el número de la lista 2 de pos.[" + i + "]");
            num_l2 = entrada.nextInt();
                
            suma2 = num_l2 + suma2;
                
            i++;
                
        }if(suma1 > suma2){
                
            System.out.println("La suma de la lista 1: " + suma1 + " es mayor a la suma de la lista 2: " + suma2);
        
        }else if(suma1 == suma2){
                
            System.out.println("Las sumas en ambas listas son iguales " + suma1 + " = " + suma2);
            
        }else
            
            System.out.println("La suma de la lista 1: " + suma1 + " es menor a la suma de la lista 2: " + suma2);
            
    }
}

