package instrucciones_de_control;

import java.util.Scanner;

public class Plan_min{

    public static void main(String[] args) {
        
        int min, costo;
        String suplan;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el plan que guste");
        suplan = entrada.nextLine();
       
        System.out.println("Tiene 300 minutos con su plan\n"
                    + "¿Cuantos minutos a parte gustaria consumir?");
            min = entrada.nextInt();
        
        if(suplan.equals("A")){
            
           if(min > 0){ 
            
             costo = (int) (min*0.10);
            int costoneto = (int)(costo-costo*0.0);
            
           }
        }else{
        
            System.out.println("Gracias solo tiene sus minutos");
            
        }
    }
}