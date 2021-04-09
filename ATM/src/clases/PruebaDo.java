package clases;

import java.util.Scanner;

/**
 *
 * @author Rem3
 */
public class PruebaDo {
    
    public static void main(String[] args) {
        
        int seleccion;
        Scanner entrada = new Scanner(System.in);
        
        do {
                System.out.println("Por favor seleccione una opción: "
                        + "\n\t1.\tConsulta de saldo."
                        + "\n\t2.\tRetiro de efectivo."
                        + "\n\t3.\tDeposito de efectivo."
                        + "\n\t4.\tSalir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    
                    if (seleccion == 1) {
                        
                        System.out.println("1");
                        
                    } else if(seleccion == 2){
                        
                        System.out.println("2");
                        
                    } else if(seleccion == 3){
                        
                        System.out.println("3");
                        
                    }
                } else {
                    System.out.println("-----------------------------------------------------------"
                            + "\nOpción no contemplada, vuelva a intentar porfavor."
                            + "\n-------------------------------------------------------------.");
                }
            } while (seleccion != 4);
        System.out.println("¡Gracias!, hasta la proxima.");
    }
}
