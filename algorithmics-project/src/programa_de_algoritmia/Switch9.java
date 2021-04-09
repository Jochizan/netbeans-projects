import java.util.Scanner;

public class Switch9{
  public static void main(String[] args) {
      
      int a,b,c;
      Scanner valor = new Scanner(System.in);
   
      System.out.println("Ingrese el número 1, 2 y 3");
      a = valor.nextInt();
      b = valor.nextInt();
      c = valor.nextInt();
      
      if(a < b && b < c){
      
          System.out.println("Esta ordenado");
          
      }else if(a == b && b < c ){
      
          System.out.println("Esta ordenado");
          
      }else if(a == b && b == c){
          
          System.out.println("Los números son iguales");
          
      }else{
      
          System.out.println("Que no esta ordenado");
          
      }
   }
}