package instrucciones_de_control;

import java.util.Scanner;

public class Preg_5_SC{

    public static void main(String[] args) {
    
        String codigo_ns, tipo_colegio;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese su nivel social");
        codigo_ns = entrada.nextLine();
        
        System.out.println("Ingrese su tipo de colegio");
        tipo_colegio = entrada.nextLine();
        
        codigo_ns = codigo_ns.toUpperCase();
        
        switch(codigo_ns){
            
            case "A": 
                
                         if(tipo_colegio.equalsIgnoreCase("Particular")){
                             
                             System.out.println("S/. 500");
                             
                         }else if(tipo_colegio.equalsIgnoreCase("Nacional")){
                         
                             System.out.println("S/.300");
                         
                         }else
                             
                             System.out.println("No existe ese tipo de colegio");
                             break;
                             
            case "B": 
                
                         if(tipo_colegio.equalsIgnoreCase("Particular")){
                             
                             System.out.println("S/. 300");
                             
                         }else if(tipo_colegio.equalsIgnoreCase("Nacional")){
                         
                             System.out.println("S/.200");
                         
                         }else
                             
                             System.out.println("No existe ese tipo de colegio");
                             break;
                             
            case "C": 
                
                         if(tipo_colegio.equalsIgnoreCase("Particular")){
                             
                             System.out.println("S/. 150");
                             
                         }else if(tipo_colegio.equalsIgnoreCase("Nacional")){
                         
                             System.out.println("S/.100");
                         
                         }else
                             
                             System.out.println("No existe ese tipo de colegio");
                             break;
                             
            default:
                        System.out.println("El nivel social indicado es erróneo");
                        break;
                             
        }
    }
}