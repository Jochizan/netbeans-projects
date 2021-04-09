import java.util.Scanner;
class prueba2{
public static void main(String[] args) {
      Scanner sc=new Scanner(System.in);
      int d,i=0,nvnum=0;
        System.out.println("Ingrese el numero");
        int num=sc.nextInt();
        if(num>0){
        System.out.println("Ingrese a que base convertir");
        int base=sc.nextInt();
       
        while(num>0){
        d=num%base;
        num=num/base;
        i=i*10+d;
        }
        while(i>0){
        d=i%10;
        i=i/10;
        nvnum=nvnum*10+d;
        }
        System.out.println(nvnum);}
        else
            System.out.println("Debe ingresar un número positivo mayor a cero");
       
    }
   
}