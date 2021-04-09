package estructura_repetición_2;

import java.util.Scanner;

public class práctica_06{

    public static void main(String[] args) {
        
        int rango_sup, rango_inf, M, mdeM = 0;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el limite inferior");
        rango_inf = entrada.nextInt();
        
        System.out.println("Ingrese el limite superior");
        rango_sup = entrada.nextInt();
        
        System.out.println("Ingrese el número M");
        M = entrada.nextInt();
        //for para ir cotando los números múltiplos de M:
        for (int i = rango_inf+1; i < rango_sup; i++) {
            
            if(i%M == 0){   
                
                mdeM++;
                
            }        
        }
        
        System.out.println("La cantidad de multiplos del rango ]" + rango_inf + "," + rango_sup + "[ que son multiplos de "+ M +" :\n"
                + mdeM);
        
    }    
}