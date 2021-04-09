package instrucciones_de_control; 
        
import java.util.Scanner;

public class Preg_9_SC{
    
    public static void main(String[] args) {
        
       int día, mes, año;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el día");
        día = entrada.nextInt();
        
        System.out.println("Ingrese el mes");
        mes = entrada.nextInt();
        
        System.out.println("Ingrese el año");
        año = entrada.nextInt();
        
        if(día >= 1 && día <= 31){
        
            if(mes >=1 && mes <= 12){
            
                if((mes == 4 && día !=31)|| (mes == 6 && día != 31)|| (mes == 9 && día != 31) || (mes == 11 && día != 31)){
                    
                        System.out.println("La fecha es correcta");
                    
                }else if(mes == 2 && ( día == 29) && (año%100 != 0 && año%4 == 0 || año%400 == 0)){
                    
                    System.out.println("La fecha es correcta");
                    
                }else if(mes == 2 && (día <= 28)){
                    
                    System.out.println("La fecha es correcta");
                    
                }else if(día <= 31 && (mes == 1 ||  mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12)){
                    
                        System.out.println("La fecha es correcta");
                                  
                }else
                    
                    System.out.println("La fecha es incorrecta");
            
            }else
                
                System.out.println("La fecha es incorrecta");
            
        }else
            
            System.out.println("La fecha es incorrecta");
       
    }
}