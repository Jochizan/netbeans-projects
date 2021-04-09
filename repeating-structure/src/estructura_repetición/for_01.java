package estructura_repetición;

import java.util.Scanner;
//INICIO
public class for_01{

    public static void main(String[] args) {
        //variables
        Scanner entrada = new Scanner(System.in);
        //entrada:
        System.out.println("¿Desde que número le vamos restando de 7 en 7?\n"
                + " Nota: usar de recomendación números mayores a 7");
        int num= entrada.nextInt();
        //procesos 
        if(num >= 7){
            
        for(num = num; num >= 0; num-=7){
            
            if(num >= 7){
            //este arreglo es para que de los números con una coma al final y el último caso sin la coma.
                System.out.print(num + ", ");
        
            }else{
            //impresión si la condición anterior para el último sin coma
                System.out.println(num);
        
            }
        }
        }else{
                
                System.out.println("Error se le pidio un número mayor o igual a 7");
        //FIN        
        }    
    }
}