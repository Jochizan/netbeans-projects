package instrucciones_de_control;

import java.util.Scanner;

public class Preg_2_SC {

    public static void main(String[] args) {

        int edad;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Ingrese la edad");
        edad = entrada.nextInt();
        
        if(edad >= 0 && edad <=6){
            
                           System.out.println("Infante o aún bebe");
            
        }else if(edad > 6 && edad <= 12){
            
                           System.out.println("Niñez");
              
        }else if(edad > 12 && edad <= 18){
        
                           System.out.println("Adolecente");
                                       
        }else if(edad > 18 && edad <= 25){
            
                           System.out.println("Juventud");
            
            
        }else if(edad > 25 && edad <= 40){
            
                           System.out.println("Adultez temprana");
                
        }else if(edad > 40 && edad <=60){
        
                          System.out.println("Adlutez tardía");
                              
        }else if(edad > 60 && edad < 120){
        
                           System.out.println("Vejez");
        
        }else

            System.out.println("La edad es errónea");
    }
}
