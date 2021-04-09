package while_02;

import java.util.Scanner;

/**
 *
 * @author Rem3
 */
public class preg_09 {
    
    public static void main(String[] args) {
        
        int  dig, num_N, sum_dig = 0, a = 0;
        String num_n;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el número");
        num_n = entrada.nextLine();
        num_N = Integer.parseInt(num_n);
        
        while(num_N != 0){
            
            dig = Integer.parseInt(num_n.substring(a, a+1));
            System.out.println(dig);
            
            if(dig != 0){
                
                sum_dig = (int)Math.pow(dig,3)+ sum_dig;
                System.out.println(sum_dig);
            }
            
            num_N/=10;
            a++;
        }
        if(Integer.toString(sum_dig).equals(num_n)){
            
            System.out.println("El número un anstrong");
            
        }else{
            
            System.out.println("El número no es un anstrong");
            
        }
    }
}
