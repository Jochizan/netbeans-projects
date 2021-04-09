package instrucciones_de_control; 
        
import java.util.Scanner;

public class Pregu_10_SC{
    
    public static void main(String[] args) {
        
        double metros_cúbicos;
        String  tipo_madera;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("\tTipo de madera\tDescuento\n"
                + "\t       A\t   4%\n"
                + "\t       B\t   8%\n"
                + "\t       C\t   10%\n");
        
        System.out.println("Ingrese la cantidad de metros cúbicos");
        metros_cúbicos = entrada.nextDouble();
        
        System.out.println("Ingrese el tipo de madera");
        tipo_madera = entrada.next();
        
        if(metros_cúbicos > 30){
            
            if(tipo_madera.equalsIgnoreCase("A")){
                
                    System.out.println("Usted tiene un descuento de:\n"
                                      + "4% del monto a pagar");
                    
            }else if(tipo_madera.equalsIgnoreCase("B")){
                
                System.out.println("Usted tiene un descuento de:\n"
                                      + "8% del monto a pagar");
            
            }else if(tipo_madera.equalsIgnoreCase("C")){
            
                System.out.println("Usted tiene un descuento de:\n"
                                      + "10% del monto a pagar");
                
            }else
                
                System.out.println("No hay ese tipo de madera ");
            
        }else if(metros_cúbicos > 0 && metros_cúbicos <= 30){
        
             if(tipo_madera.equalsIgnoreCase("A")){
                
                    System.out.println("Usted tiene un descuento de:\n"
                    + "2% del monto a pagar");
                    
            }else if(tipo_madera.equalsIgnoreCase("B")){
                
                System.out.println("Usted tiene un descuento de:\n"
                    + "2% del monto a pagar");
            
            }else if(tipo_madera.equalsIgnoreCase("C")){
            
                System.out.println("Usted tiene un descuento de:\n"
                    + "2% del monto a pagar");
                
            }else
                
                System.out.println("No hay ese tipo de madera ");
            
        }else
            
            System.out.println("Error la cantidad de metros cúbicos no puede ser menor a 0");
            
    }
}