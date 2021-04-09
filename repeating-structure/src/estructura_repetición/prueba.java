package estructura_repetición;

import java.util.Scanner;

public class prueba{
   
    public static void main(String[] args){
        
       Scanner teclado=new Scanner(System.in);
       int cantidad,base,num_e,j;
       double num_cam,N=0;
       String num_n;
      
       System.out.println("Inserte el numero ");
       num_n=teclado.nextLine();
       
       cantidad = num_n.length();//(int)(Math.log10(s)+1);
       
       System.out.println("Inserte la base, recuerda debe ser menor a 10 ");
       base=teclado.nextInt();
       
       if(10>base && base>1){
           
           int a=0;
           
            ciclofor1: 
            for(int d=1; d<=num_n.length(); d++){
               
             num_e = Integer.parseInt(num_n.substring(a,a+1));
             //System.out.println(num_e);
                if(base > num_e){
                     
                  a++;   
                  cantidad--;
                  //System.out.println(cantidad);
                  num_cam=num_e*Math.pow(base,cantidad);
                  //System.out.print(num_in);
                  N=num_cam+N;
                  //System.out.print(N);                   
                }else{
                     
                 System.out.println("Uno de los digitos es mayor a la base");
                 System.exit(0);
                 
                }     
            }
            
          System.out.println("El número insertado en base 10 es: "+N);
       
       }else
           
          System.out.println("No inserte una base menor que 0 o mayor a 9");
       
    }
}