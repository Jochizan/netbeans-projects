package estructura_repetición;

import java.util.Scanner;

public class preg_5{
    public static void main(String[] args){
        
       Scanner teclado=new Scanner(System.in);
       int a,b,p=0,n=0,c=0,c2=0,c3=0;
       double P,N;
       
       System.out.println("Te mostrare los promedios");
       for(a=1;a<=10;a=a+1){
           
           System.out.println("Inserte el número");
           b=teclado.nextInt();
           
           if(b>0){
               
               p=p+b;
               c=c+1;
               
           }else  if (b<0){
               
               n=n+b;
               c2=c2+1; 
               
           } else if (b==0){
               
             c3=c3+1;}}
       
       if(c==0){
           
           System.out.println("No hay positivos  "); 
           
       }else{ 
           //proceso
           P=p/(c*1.0);
           
          System.out.println("Promedio de positivos es:  "+P);}
       
       if(c2==0){
           
         System.out.println("No hay negativos  ");
         
       }else{
           
       N=n/(c2*1.0);
       
       System.out.println("Promedio de negativos es:  "+N);}
       
      System.out.println("cantidad de ceros ingresado:  "+c3);    
      
  }
}    


