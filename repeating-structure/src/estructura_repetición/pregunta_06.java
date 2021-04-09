import java.util.Scanner;

class For6{
    
    public static void main(String[] args) {
        
       Scanner teclado=new Scanner(System.in);
       int a,b,s=1,n;
       
       System.out.println("Inserte el numero hasta que factorial desea observar");
       n=teclado.nextInt();
       
       for(b=1;b<=n;b=b+1){
           s = 1;
         for(a=1;a<=b;a=a+1){
             
           s=s*a;
           
          
        } System.out.println("Factorial de "+b+" es : "+s);   }
    }
}