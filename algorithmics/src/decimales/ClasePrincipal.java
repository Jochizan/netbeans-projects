package decimales;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 *
 * @author Joan y Rem3
 */
public class ClasePrincipal {

    public static void main(String[] args) {
        
        double numero = 2;
        double raiz = Math.sqrt(numero);
        
        System.out.println("La raíz cuadrada de " + numero + " es: " + raiz);
        
        //Utilizando la clase DecimalFormat
        DecimalFormat df = new DecimalFormat("#.00");
        System.out.println("La raíz cuadrada de " + numero + " es: " + df.format(raiz));
        
        //Utilizando String Format
        System.out.println("La raíz cuadrada de " + numero + " es: " + String.format("%.4f", raiz));
        
        //Utilizando la clase Math.round
        System.out.println("La raíz cuadrada de " + numero + " es: " + (double)Math.round(raiz*1000d)/1000);
        
        //Utilizando la clase BigDecimal
        BigDecimal bd = new BigDecimal(raiz);
        bd = bd.setScale(4, RoundingMode.HALF_UP);
        System.out.println("La raíz cuadrada de " + numero + " es: " + bd.doubleValue());
        
    }
}
