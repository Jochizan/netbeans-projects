package clases_AlgotrimiaP;

import java.util.Scanner;

public class IMC_estado{
    
     public static void main(String args[]){
  
         double peso = 0, altura = 0, IMC = 0;
         Scanner sc = new Scanner(System.in);
      
         System.out.println("Ingrese su peso");
         
         try{
         peso = sc.nextDouble();
      
         System.out.println("Ingrese su estatura");
         altura = sc.nextDouble();         
      
         IMC = peso/Math.pow(altura, 2);
         
         }catch(java.util.InputMismatchException e){
          
             System.out.println("Ocurrio un error solo ingrese números");
          
         }catch(Exception e){
          
             System.out.println("Ovurrió un error");
          
         }if(IMC > 0 && IMC < 16){
      
              System.out.println("Criterio de ingreso al hospital");
          
        }else if(IMC >= 16 && IMC < 17){
      
              System.out.println("Infrapeso");
          
        }else if(IMC >= 17 && IMC < 18){
      
              System.out.println("Bajo peso");
          
        }else if(IMC >= 18 && IMC < 25){
          
              System.out.println("Peso normal");
      
        }else if(IMC >= 25 && IMC < 30){
      
              System.out.println("Obesidad grado I");
      
        }else if(IMC >= 30 && IMC < 35){
      
              System.out.println("Obesidad grado II");
          
        }else if(IMC >= 35 && IMC < 40){
      
              System.out.println("Obesidad grado III");
      
        }else if(IMC >= 40){
      
              System.out.println("Obesidad mordida");
          
        }else{
            
            System.out.println("Error no puede tener esa cantidad de peso o altura");
        }
    }
}