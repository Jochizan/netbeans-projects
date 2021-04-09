import java.util.Scanner;
//INICIO
public class Switch1{
  public static void main(String ars[]){
     //variables:
     int parametro;
     double sueldo;
     Scanner valor = new Scanner(System.in);
     //entrada:
      System.out.println("\nIngrese que opción tiene el trabajador");
      parametro = valor.nextInt();
      
      System.out.println("Ingrese el sueldo del trabajador:");
      sueldo = valor.nextDouble();
      //procesos
  switch(parametro){
      
    //salidas: 
    case 1:
        
            System.out.println("Su aumento es: " + (sueldo*1.15));
            break;
            
    case 2:
         
            System.out.println("Su aumento es: " + (sueldo*1.10));
            break;
    
    case 3:
        
            System.out.println("Su aumento es: " + (sueldo*1.08));
            break;
    
    case 4:
        
            System.out.println("Su aumento es: " + (sueldo*1.07));
            break;
   
   default: 
       
            System.out.println("Error, la opción no existe");
            break;
        //FIN    
      }
   }
}