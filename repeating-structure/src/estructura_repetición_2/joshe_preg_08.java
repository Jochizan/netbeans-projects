import java.util.Scanner;

class Numero_Capicua {
   public static void main(String[] args) {
       
       Scanner datos = new Scanner(System.in);
       int ini, fin, inver = 0, aux = 0, cifra, cant = 0;
       
       System.out.println("Digite el inicio del rango: ");
       ini = datos.nextInt();
       
       System.out.println("Digite el final del rango: ");
       fin = datos.nextInt();
       for(int i=ini+1; i<=fin; i++){
           ini=i;
           inver=0;
                for(ini = ini; ini!=0; ini/=10){
                    cifra=ini%10;//obtenemos la ultima cifra del residuo                  
                    inver=inver*10+cifra;//hallamos la primera cifra del numero invertido                    
               if(i==inver){                        
                cant=cant+1;
                }             
                }                                                   
        }      
               System.out.println("Hay "+cant+" números capicuas"); 
        }                 
}