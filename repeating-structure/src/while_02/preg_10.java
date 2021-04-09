package while_02;

import java.util.Scanner;

/**
 *
 * @author Rem3
 */
public class preg_10 {
    
    public static void main(String[] args) {
        
        int num_n, cant, base, resto;
        String num_CON ="", num_N ="";
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número en base 10");
        num_n = entrada.nextInt();
        
        System.out.println("Ingrese a que base quiere llevar su número");
        base = entrada.nextInt();
        
        if(num_n > 0){
            
            if(base > 1){
            
            while(num_n != 0){
                
                resto = 0;
                if(num_n%base == 0){
                    
                    num_CON += 0;
                    
                }else{
                    
                    resto =num_n%base;
                    num_CON += resto;
                    
                }

                num_n = num_n/base;
                
            }
            cant = num_CON.length();
            
            while(cant != 0){
                
                num_N += num_CON.substring(cant-1, cant);
                cant--;
            }
            
            
            System.out.println("El número "+num_n+" llevado a la base " + base + " es:\n" + num_N);
            
            }else{
            
            System.out.println("El número no puede llevarse a una base menor a 2");
        
            }
        }else
        
        
        System.out.println("El programa cálcula solo con números positivos");
        
    }
}
