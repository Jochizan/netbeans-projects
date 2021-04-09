package estructura_repetición;

import java.util.Scanner;

public class preg_6{

    public static void main(String[] args) {
    
       Scanner teclado=new Scanner(System.in);
       int a,b,s=1,n;
       
       System.out.println("Inserte el numero hasta que factorial desea observar");
       n=teclado.nextInt();
       
       for(b=1; b<=n; b=b+1){
         
             
           s=s*b;
       System.out.println("Factorial de "+b+" es : "+s);   }
    }
}
