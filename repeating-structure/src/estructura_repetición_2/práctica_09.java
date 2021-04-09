package estructura_repetición_2;

import java.util.Scanner;

public class práctica_09{

    public static void main(String[] args) {
    
    int númerofibo = 0, b = 1, c, n, sumafibo = 0;
    Scanner valor = new Scanner(System.in);
    
    System.out.println("Ingrese los N-1 términos de fibonacci que se van a sumar");
    n = valor.nextInt();
    //for para hallar el número de la secuencia y la suma de los números de fibonacci:
    for(int i = 0; i < n-1; i++){
     //condicional con coma: 
     if(i < n-2){
         
      System.out.print(númerofibo + ",");  
        c = númerofibo + b;                 
        númerofibo = b;                    
        b = c;                    
        sumafibo= númerofibo + sumafibo;
   //condicional sin coma:     
   }else {
         
     System.out.println(númerofibo); 
   }
  }
        System.out.println("La suma de dichos terminos es: " + sumafibo);
 }
}