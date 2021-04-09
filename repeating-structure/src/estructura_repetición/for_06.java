package estructura_repetición;

import java.util.*;
//INICIO
public class for_06{
    
    public static void main(String[] args) {
        //variables:    
        int num,factorial = 1; 
        Scanner entrada = new Scanner(System.in);
        //entrada:
        System.out.println("Ingrese la cantidad de factoriales que quiere imprimir en pantalla");
        num = entrada.nextInt();
        //impresión del facotorial de 0 que por convención matemática es 1
        System.out.print("Los factoriales desde el 0 serian:"
                + "\n1, ");
        //condicionales:
        if(num-1 > 0){
            //for:
            for(int i = 1; i <= num-1; i++){
            //proceso:   
            factorial = i * factorial;
            //condiconal dentro de condicional (anidada)
            if(i < num-1){
            //impresión sí es  menor que la cantidad de números:   
                System.out.print(factorial + ", ");
            
            }else{
            //impresión sí es igual a dicho número:
                System.out.println(factorial);
                
            }    
        }//condición sí es el num es menor que 0
        }else { 
               //impresión de num < 0: 
                System.out.println("Error el valor solo se calcula con números positivos");
        //FIN        
        }     
    }
}