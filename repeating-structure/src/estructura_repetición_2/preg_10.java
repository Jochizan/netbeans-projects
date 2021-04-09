import java.util.Scanner;

class FOR_2_ejer8numerocapicua {
    
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int numinvertido=0,resto=0,c=0,aux=0;
        
        System.out.println("Ingrese el primer numero del rango");
        int num1=sc.nextInt();  
        
        System.out.println("Ingrese el segundo numero del rango");
        int num2=sc.nextInt();
        
        for(int i=num1+1;i<num2;i++){
            i=i;
            numinvertido = 0;
            for (int j = i; j > 0; j/=10) {
                
                resto=j%10;
                numinvertido=numinvertido*10+resto;
                System.out.println("El número invertido es: " + numinvertido);
                
            }if(numinvertido==i)
                c=c+1;
            
        }
        System.out.println("La cantidad de numero capicua es:"+c);
    }
}