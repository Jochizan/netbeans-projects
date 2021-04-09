package folder1;

import java.util.Scanner;

public class Pregunta_6{
    public static void main(String args[]){
        //variables:
        int A, B; 
        double Resultado;
        Scanner valor = new Scanner(System.in);
        //entrada:
        System.out.println("Ingrese el valor de A ");
        A = valor.nextInt();
       
        System.out.println("Ingrese el valor de B ");
        B = valor.nextInt();
        //proceso:
        Resultado = Math.pow(A + B, 2)/3;
        //salida:
        
        System.out.println("El resultado es: " + Resultado);   
        
    }
}