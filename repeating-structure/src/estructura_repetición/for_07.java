package estructura_repetición;

import java.util.Scanner;
//INCIO
public class for_07 {
 
    public static void main(String[] args) {
        //variables:
        int base, num_c, n=1,y;
        String num_cadena, num_cadenaI = "";
        Scanner valor = new Scanner(System.in);
        //entrada1:
        System.out.println("Ingrese el número"
                + "\nNota:  Solo ingrese números");
        num_cadena = valor.nextLine();
        //entrada2;
        System.out.println("Ingrese su base"
                + "\nNota: Tratar de ingresar una base mayor a los digitos ingresados");
        base = valor.nextInt();
        y = num_cadena.length();
        //usamos legth para invertir la cadena ingresada anteriormente        
        //Integer.parseInt(num_cadena.substring(num_cadena.length()-1));
        //condicionales://System.out.println(num_cadena + " de base " + base + " a base 10 es " + Integer.parseInt(num_cadena,base));
            if(base > 1){
                //usando el metodo lenght, substring y el parseInt podemos hacer una evaluación de sí un digito del número ingresado es mayor que la base.
                for(int g = 1; g<=num_cadena.length();g++){
                    
                    num_c = Integer.parseInt(num_cadena.substring(y-1, y));
                    //System.out.println(num_c);
                    
                if(base > num_c){
                //impresión si se cumple que todos los caracteres del número ingresado son mayores a su base:
                y--;
                
                }else if(base <= num_c){ 
                //impresión si uno de los digitos del número es mayor a su base:    
                   System.out.println("Error la base es menor o igual a uno de los digitos del número");
                   System.exit(0);
                   
                    }
                }
                
                System.out.println(num_cadena + " de base " + base + " a base 10 es " + Integer.parseInt(num_cadena,base));
                
            }else{
                //impresión si la base es menor que 1:
                System.out.println("Error la base solo trabaja con números mayores a 1");
        //FIN    
        }
        
    }
    
}