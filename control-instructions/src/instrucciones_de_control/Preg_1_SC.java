package instrucciones_de_control;

import java.util.Scanner;

public class Preg_1_SC{

    public static void main(String[] args) {

        int num_1;
        Scanner entrada = new Scanner(System.in);

        System.out.println("\tIngrese el día de la semana\n"
                + "\t         Rango [1-7]");
        num_1 = entrada.nextInt();

        switch(num_1){
            
            case 1: 
                        System.out.println("Es domingo");
                         break;
                         
            case 2: 
                        System.out.println("Es lunes");
                        break;
            
            case 3: 
                        System.out.println("Es martes");
                        break;
            
            case 4: 
                        System.out.println("Es miércoles");
                        break;
            
            case 5: 
                        System.out.println("Es jueves");
                        break;
            
            case 6: 
                        System.out.println("Es viernes");
                        break;
            
            case 7: 
                        System.out.println("Es sábado");
                        break;
                  
             default:
                         System.out.println("Solo puede ingresar números del 1 al 7");
        
        }
    }
}
