package programa_de_algoritmia;
//INCIO
import java.util.Scanner;

public class Switch4{
    
  public static void main(String ars[]){
      //variables:
      String letra; 
      int num;
      Scanner valor = new Scanner(System.in);
      //entrada:
        System.out.println("\nIngrese la letra");
        letra = valor.nextLine();
        //Aquí también podriamos usar otros metodós para acortar lineas de codigó.
        if(letra.equalsIgnoreCase("A") || letra.equalsIgnoreCase("E") || letra.equalsIgnoreCase("I")
                ||letra.equalsIgnoreCase("O")||letra.equalsIgnoreCase("U")){
            
            num=0;
            switch(num){
                  
                 case 0:
                       System.out.println("SI, es una vocal");
                           
            }
            
        } else {
        
            System.out.println("NO, es una consonante");
         //FIN   
        }    
    }
}