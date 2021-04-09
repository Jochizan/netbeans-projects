package estructura_repetición;

import java.util.Scanner;

public class Fibonacci0{
  public static void main(String args[]){
    
    int x , a = 0, b = 1, c, n;
    Scanner valor = new Scanner(System.in);
    
    System.out.println("¿Cuántos números de la secuencia fibonacci quiere generar?");
    n = valor.nextInt();
    
    for( x = 0; x < n; x++){
        
     if(x < n-1){
         
      System.out.print(a + ",");  
        c = a + b;                 
        a = b;                    
        b = c;                    
        
   }else {
         
     System.out.print(a); 
     
     }
    }
    System.out.println("");
    x=0;
    a=0;
    b=1;
    c=0;
    n=0;
    System.out.println("¿Cuántos números de la secuencia fibonacci quiere generar?");
    n = valor.nextInt(); 
    
    while(x < n){
     
        if(x < n-1){
    System.out.print(a + ","); 
        c = a + b;                 
        a = b;                    
        b = c;                    
        
        
        }else{
        System.out.print(a);
        }
        x++;
    }
  }  
}
