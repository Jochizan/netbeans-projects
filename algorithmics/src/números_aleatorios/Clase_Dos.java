package números_aleatorios;

import java.util.Random;

/**
 * 
 * @author Joan y Rem3
 */
public class Clase_Dos {
    
    public static void main(String[] args) {
        
        int aleatorio = 0;
        Random random = new Random();
        
        aleatorio = (int)(random.nextDouble()*100);
        System.out.println(aleatorio);
        
    }
}
