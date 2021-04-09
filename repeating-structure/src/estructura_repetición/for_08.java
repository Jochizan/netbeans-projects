package estructura_repetición;

import java.util.Scanner;
//INICIO
public class for_08{

    public static void main(String[] args) {
        //variables:
        int N;
        double S = 1, num_f = 1,factoriales = 1;
        Scanner entrada = new Scanner(System.in);
        //entrada:
        System.out.println("Ingrese la N cantidad de terminos");
        N = entrada.nextInt();
        //procesos:
        if(N > 0){
        //for:    
        for(int i = 1; i <= N; i++){
            //condiciones:
            if(i%2 == 0){
            //proceso si la condición que i entre 2 da de residuo 0:    
                S = S  - (num_f/factoriales);
            //condición necesaria para que el primer valor sea 1:
            }else if(i == 1){
            
                S =  S;
            //condición cuando ninguna de las dos condiciones anteriores cumple:    
            }else{
            //procesos acumlativo de S en donde si vamos poniendo un número mayor a 2 se utilizara todas las condiciones:
                S = S + (num_f/factoriales);
            }
            //aumentos finales para seguir con el correcto funcionamiento del algoritmo:
            factoriales = (i + 1) * factoriales;
            //aumentamos el num_f + 1 porque en el segundo ciclo sera 2/2factorial y asi se va repitiendo en cada ciclo el anterior fue para el factorial. 
            num_f = num_f + 1;
                        
        }
           //impresión si N es mayor a 0
            System.out.println("S es igual a " + S);
        
        }else{
        
            System.out.println("Error solo puede ingresar una cantidad positiva y mayores a 0");
        //FIN    
        }  
    }
}






















