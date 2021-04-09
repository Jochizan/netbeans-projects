/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programa_de_algoritmia;

/**
 *
 * @author Rem3
 */
  import java.util.Scanner;

public class Iniciosesion{
  public static void main(String args[]){

   Scanner in = new Scanner(System.in);
   String nombre1 = "";
   String clave1 = "";
   String nombre2 = "";
   String clave2 = "";
   
   System.out.println( "***************************************************************************** ");
   System.out.println( "*hola , bienvenido a la calculadora , por favor registrate para poder continuar*");
   System.out.println( "********************************************************************************");
   System.out.println( "***************************");
   System.out.println( "*crea un nombre de usuario*");
   System.out.println( "***************************");
   nombre1 = in.nextLine();
   System.out.println( "**********************");
   System.out.println( "* crea una contraseña *");
   System.out.println( "**********************");
   clave1 = in.nextLine();
  
   System.out.println( "*************************************************************");
   System.out.println( "+perfecto , ahora tienes que verificar los datos ingresados *");
   System.out.println( "*************************************************************");
   System.out.println( "****************************************************");
   System.out.println( "*porfavor , ingrese nuevamente su nombre de usuario*");
   System.out.println( "****************************************************");
   nombre2 = in.nextLine();
   System.out.println( "**********************************************");
   System.out.println( "*porfavor , ingrese nuevamente su contraseña*" );
   System.out.println( "**********************************************"); 
   clave2 = in.nextLine();
 
   if(nombre1.equals(nombre2) && clave1.equals(clave2)){
    System.out.println( "********************************************");
    System.out.println("*contraseña y usuarios verificados con exito*");
    System.out.println( "********************************************");

    System.out.println( "****************************");
    System.out.println("*bienvenido a la calculadora*");
    System.out.println( "****************************");
   
   int num_uno = 0;
   int num_dos = 0;
   int resultado = 0;
   int operacion = 0;

   System.out.println( "**********************************");
   System.out.println("*ingrese el primer valor por favor*");
   System.out.println( "**********************************");
   num_uno = in.nextInt();
   System.out.println( "***********************************");
   System.out.println("*ingrese el segundo valor por favor*");
   System.out.println( "***********************************");
   num_dos = in.nextInt();
   System.out.println( "*********************************************************************************************************");
   System.out.println("*ingrese uno si desea suma , dos si desea resta , tres si desea multiplicacion o cuatro si desea division*");
   System.out.println( "*********************************************************************************************************"); 
   operacion = in.nextInt();

   switch(operacion){
  
    case 1: resultado = num_uno + num_dos;
            System.out.println("el resultado de tu suma es: " + resultado);
            break;

     case 2: resultado = num_uno - num_dos;
      System.out.println("el resultado de tu resta es: " + resultado);
          break;
    
     case 3: resultado = num_uno * num_dos;
      System.out.println("el resultado de tu multiplicacion es: " + resultado);
          break;

     case 4: resultado = num_uno / num_dos;
      System.out.println("el resultado de tu division es: " + resultado);
          break;
 
     
     default: System.out.println("*Error , la opcion elegida no existe*");
     
   } 
    
  }else{
 
    System.out.println( "********************************");
    System.out.println(" contraseña o usuario icorrectos ");
    System.out.println( "********************************"); 
     
  }
 }
}