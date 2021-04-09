package estructura_repetición;

import java.util.*;
//INICIO
public class for_05 {

    public static void main(String[] args) {
        //variables:
        int n, cant_po = 0, cant_ne = 0, x, cant_cero = 0;
        double media_1 = 0, media_2 = 0;
        Scanner entrada = new Scanner(System.in);
        //entrada1:
        System.out.println("Ingrese la cantidad de números que va ingresar:\n"
                + "Se enumerara de forma x[1],  x[2],...");
        n= entrada.nextInt();
        //procesos y condicionales:
        for(int i = 1; i <= n; i++){
            //entrada2:
            System.out.print("x[" + i + "]=");
            x = entrada.nextInt();
            //condición cuando un x sea igual a 0
            if(x == 0){
                 
                cant_cero++;
            //condición cuando sean positivos     
            }else if(x > 0){
                
                media_1 = x + media_1;
                cant_po++;
            //condición cuando sean negativos   
            }else{
                
                media_2 = x + media_2;
                cant_ne++;
                 
            }              
         }
        //impresiones:
        System.out.println("Cantidad de números Positivos: " + cant_po 
                + "\nCantidad de números Negativos: " + cant_ne 
                + "\nCantidad de Ceros: " + cant_cero);
        //condición si ingresaron números positivos para que nos halle la media
        if(media_1 > 0){
            //proceso y impresión de la media de números positivos:
            media_1 = media_1/cant_po;
            System.out.println("La media de los números de positivos es: " + media_1);
        //si no ingresaron números positivos     
        }else{
            //impresión:
            System.out.println("La media de los positivos es 0");
        } //condición si ingresaron números negativos
        if(media_2 < 0){
            //proceso y impresión de la media de números negativos
            media_2 = media_2/  cant_ne;
            System.out.println("La media de los números negativos es: " + media_2);
        //condición si tampoco ingresaron números negativos    
        }else{
        //impresion:
            System.out.println("La media de los negativos es 0");
        //FIN    
        }   
    }   
}