package clases_AlgotrimiaP;

import java.util.Scanner;

public class Pregunta_19{
  public static void main(String args[]){
     //variables: 
     int segundos, conversiónh, conversiónm, restos;
     Scanner valor = new Scanner(System.in);
     //entrada:
     System.out.println("Ingrese la cantidad de segundos.");
     segundos = valor.nextInt();
     //proceso.
     conversiónh = segundos/3600;
     
     conversiónm = (segundos%3600)/60;
     
     restos = segundos - (conversiónh*3600 + conversiónm*60);
     //salidas:
      if(segundos >= 0){
          
           System.out.println("La cantidad es de: " + conversiónh + " horas, " + conversiónm + " minutos y " + restos 
             + " segundos.");
           
      }if(segundos < 0){
          
          System.out.println("La cantidad de segundos no puede ser negativa.");
          
      }
   }  
}