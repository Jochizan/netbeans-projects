package estructura_repetición;

import java.util.Scanner;

public class preg_7{

    public static void main(String[] args) {
        //variables:    
        String num_o, num;
        Scanner entrada = new Scanner(System.in);
        //entrada:
        System.out.println("Ingrese el número");
        num_o = entrada.nextLine();
        //el método substring nos recupera un digito del número que ingresamos:
        num = num_o.substring(0, 2);//[0-2>
        //imprime lo recuperado
        System.out.println(num);
        
        
    }
}