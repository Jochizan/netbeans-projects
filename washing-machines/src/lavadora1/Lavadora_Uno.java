package lavadora1;

import libreria.LLFunciones;
import java.util.Scanner;

public class Lavadora_Uno {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("¿La ropa es blanca o de color?\n"
                + "Presiona 1 - ropa blanca / 2 - ropa de color");
          int TipoDeRopa = entrada.nextInt();
        
        System.out.println("¿Cuantos kilos de ropa?");
        int kilos = entrada.nextInt();
        
        LLFunciones mensajero = new LLFunciones(kilos, TipoDeRopa);
        mensajero.setTipoDeRopa(2);
        System.out.println("El tipo de ropa es: " + mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();
    }
}
