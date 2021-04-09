package estructura_repetición;

import java.util.Scanner;
//INICIO
public class for_02{
    
    public static void main(String[] args) {
        //variables:    
        int num, suma = 0, cant;
        Scanner valor = new Scanner(System.in);
        //entrada1:
        System.out.println("Ingrese la cantidad de números que quiere sumar");
        cant = valor.nextInt();
        //procesos
        for(int i = 1; i <= cant; i++){
            //entrada2:
            System.out.println("Ingrese el número");
            num = valor.nextInt();
            //procesos
            suma = num + suma;
        }
        //imprimir:
        System.out.println("La suma de los " + cant + " números ingresados es:\n" + suma);
    //FIN
    }
}