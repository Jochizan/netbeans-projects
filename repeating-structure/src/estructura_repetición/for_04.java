package estructura_repetición;

import java.util.Scanner;
//INICIO
public class for_04{

    public static void main(String[] args) {
        //variables:
        int num,factorial = 1;
        Scanner entrada = new Scanner(System.in);
        //entrada:
        System.out.println("Ingrese el número n para hacer la función factorial");
        num = entrada.nextInt();
        //procesos y condicionales:
        if(num >= 0){
            //for:
            for(int i = 1; i <= num; i++){

            factorial = i * factorial;

        }//impresión si se cumple la condición anterior:
            System.out.println("El factorial es: " + factorial);

        }else {
        //impresión sino se cumple la condición:
                System.out.println("Error el valor solo se calcula con positivos");
        //FIN
        }     
    }
}
