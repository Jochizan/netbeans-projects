package instrucciones_de_control;

import java.util.Scanner;

public class Preg_8_SC {

    public static void main(String[] args) {

        double salario;
        String genero;
        Scanner valor = new Scanner(System.in);

        System.out.println("Ingrese el género");
        genero = valor.next();

        if (genero.equalsIgnoreCase("F")) {
            
            System.out.println("Ingrese el salario");
            salario = valor.nextDouble();
        
            if(salario > 300){
                
                System.out.println("Tiene un descuento de AFP es:\n" + (salario*0.0625) 
                        + "\nSu salario neto es: " + (salario*0.9375));
                
            }else if(salario > 0 && salario <= 300){
                
                System.out.println("Usted no tiene descuento"
                        + "\nSu salario neto es: " + salario);
                
            }else
                
                System.out.println("Su salario no puede ser negativo");
                
        }else if(genero.equalsIgnoreCase("M")){
            
            System.out.println("Ingrese el salario");
            salario = valor.nextDouble();
            
            if(salario > 300){
                
                System.out.println("Su descuento por AFP es:\n" + (salario*0.0625) 
                        + "\nPor ISSS es de:\n" + (salario*0.03) 
                        + "\nPor conceptos de RENTA de:\n" + (salario*0.1) 
                        + "\nSu salario neto es:\n" + (salario-(salario*0.0625+salario*0.03+salario*0.1)));
                
            }else if(salario > 0 && salario <= 300){
                
                System.out.println("Su descuento por AFP es:\n" + (salario*0) 
                        + "\nPor ISSS es de:\n" + (salario*0.03) 
                        + "\nPor conceptos de RENTA de:\n" + (salario*0.1) 
                        + "\nSu salario neto es:\n" + (salario-(salario*0.03+salario*0.1)));
            }else
                
                System.out.println("Su salario no puede ser negativo");
            
        }else 
            
            System.out.println("Solo se considera dos géneros");
            
    }
}
