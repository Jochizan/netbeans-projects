import java.util.Scanner;
 class CFE7{
   public static void main(String[] args){
     Scanner sc=new Scanner(System.in);
     int i,num,m,basd=0,re, pot, pot1;
      System.out.println("Ingrese el número: ");
       num=sc.nextInt();
      System.out.println("Ingrese la base: ");
       m=sc.nextInt();              
        if (m>0&&m<10){
         for (i=0;num>=10;i+=1){
         re=num%10;
         num=num/10;
           if (re<m){
           pot=(re*((int)Math.pow(m,i)));
           basd=basd+pot;
            }
           else{
            System.out.print("La base solo se definió entre 0 y 10");
           break;
           }
         }
         if (num<10 && num>=0){
           if (num>=m){
             System.out.println("La base es mayor que el las cifras, no puede existir");
             }
           else{
            pot1=(num*((int)Math.pow(m,i)));
            basd=basd+pot1;
        
            System.out.println(basd);
          }
          }
        }   
        else
          System.out.println("Ingrese una base valida entre 10 y 0"); 

   }
 }
