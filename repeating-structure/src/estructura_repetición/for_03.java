package estructura_repetición;

import java.util.Scanner;
//INICIO
public class for_03 {

    public static void main(String[] args) {
        //variables:
        int números,multiplicación=1; 
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese los 10 primeros números impares");
        //procesos:
        for(int i = 1; i <= 10; i++){
            //entrada:
            System.out.println("Ingrese el número");
            números = entrada.nextInt();
            //procesos:
            multiplicación = números * multiplicación;
                
        }
        //imprimir:
        System.out.println(multiplicación);
    //FIN    
    }    
}
