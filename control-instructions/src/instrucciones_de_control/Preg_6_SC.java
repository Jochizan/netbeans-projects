
import java.util.Scanner;

public class Preg_6_SC{
    
    public static void main(String[] args) {
    
            double por_perdida;
            Scanner entrada = new Scanner(System.in);
            
            System.out.println("Ingrese el procentaje de pérdida de peso");
            por_perdida = entrada.nextDouble();
            
            if(por_perdida >= 0 && por_perdida <= 1){
                
                System.out.println("La especie es altamente resistente");
                
            } else if(por_perdida > 1 && por_perdida <=5){
                
                System.out.println("La especie es resistente");
                
            }else if(por_perdida > 5 && por_perdida <=10){
                
                System.out.println("La especie es moderadamente resistente");
            
            } else if(por_perdida > 10 && por_perdida <= 30){
            
                System.out.println("La especie es  muy poco resistente");
                
            } else if(por_perdida > 30 && por_perdida < 100){
            
                System.out.println("La especie no es resistente");
                
            } else
                
                System.out.println("Ingrese un valor posible");
                
    }
}