package instrucciones_de_control;

import java.util.Scanner;

public class Preg_7_SC{
    
    public static void main(String[] args) {
    
        int mes, año;
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Ingrese el mes");
        mes = valor.nextInt();
        
        System.out.println("Ingrese el año");
        año = valor.nextInt();
        
        if(mes >= 1 && mes <= 12){
            
            switch(mes){
                
                case 1:
                    System.out.println("El mes es Enero, y tiene 31 días");
                    break;          
                    
                case 2:
                    if(año%100 != 0 && año%4 == 0 || año%400 == 0){
                    
                        System.out.println("El mes es Febrero, y tiene 29 días");
                        
                    
                    }else 
                        
                        System.out.println("El mes es Febrero, y tiene 28 días");
                        break;
                        
                case 3:
                    System.out.println("El mes es Marzo, y tiene 31 días");
                    break;
                    
                case 4:
                    System.out.println("El mes es Abril, y tiene 30 días");
                    break;
                    
                case 5:
                    System.out.println("El mes es Mayo, y tiene 31 días");
                    break;

                case 6:
                    System.out.println("El mes es Junio, y tiene 30 días");
                    break;
                    
                case 7:
                    System.out.println("El mes es Julio, y tiene 31 días");
                    break;
                    
                case 8:
                    System.out.println("El mes es Agosto, y tiene 31 días");
                    break;
                    
                case 9:
                    System.out.println("El mes es Setiembre, y tiene 30 días");
                    break;
                    
                case 10:
                    System.out.println("El mes es Octubre, y tiene 31 días");
                    break;
                    
                case 11:
                    System.out.println("El mes es Noviembre, y tiene 30 días");
                    break;
                    
                case 12:
                    System.out.println("El mes es Diciembre, y tiene 31 días");
                    break;
            }
            
        }else
            
            System.out.println("El mes no existe");
            
    }
}