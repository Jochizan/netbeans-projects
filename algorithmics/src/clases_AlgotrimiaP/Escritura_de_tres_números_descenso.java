package clases_AlgotrimiaP;

import java.util.Scanner;

public class Escritura_de_tres_números_descenso{
  public static void main(String args[]){
  
      int num_1, num_2, num_3;
      Scanner valor = new Scanner(System.in);
      
      System.out.println("Ingrese el valor del número 1");
      num_1 = valor.nextInt();
      
      System.out.println("Ingrese el valor del número 2");
      num_2 = valor.nextInt();
      
      System.out.println("Ingrese el valor del número 3");
      num_3 = valor.nextInt();
      
      System.out.println("Los números ordenados de mayor a menor es: ");  
      
        if(num_1 >= num_2 && num_2 >= num_3){
            
           System.out.println("" + num_1 + "," + num_2 + "," + num_3 ); 
           
        }else if (num_1>=num_3 && num_3>=num_2){
             
            System.out.println("" + num_1 + "," + num_3 + "," + num_2);
            
        }else if (num_2>=num_1 && num_1>=num_3){
             
            System.out.println("" + num_2 + "," + num_1 + "," + num_3); 
            
        }else if (num_2>=num_3 && num_3>=num_1){
             
            System.out.println("" + num_2 + "," + num_3 + "," + num_1); 
            
        }else if (num_3>=num_1 && num_1>=num_2){
             
            System.out.println("" + num_3 + "," + num_1 + "," + num_2); 
            
        } else{
            
              System.out.println("" + num_3 + "," + num_2 + "," + num_1);
              
        }
    }   
}