package clases;

import java.util.Scanner;

/**
 *
 * @author Rem3
 */
public class ClasePadre_1 {

    protected double transacciones, retiro, deposito;
    private double saldo = 500;
    Scanner entrada = new Scanner(System.in);

    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;

        do {
            do {
                System.out.println("Por favor seleccione una opción: "
                        + "\n\t1.\tConsulta de saldo."
                        + "\n\t2.\tRetiro de efectivo."
                        + "\n\t3.\tDeposito de efectivo."
                        + "\n\t4.\tSalir.");
                seleccion = entrada.nextInt();

                if (seleccion >= 1 && seleccion <= 4) {
                    bandera = 1;
                } else {
                    System.out.println("-----------------------------------------------------------"
                            + "\nOpción no contemplada, vuelva a intentar porfavor"
                            + "\n-------------------------------------------------------------.");
                }
            } while (bandera == 0);
            
            if (seleccion == 1) {
                
                System.out.println("Su saldo es: " + saldo);
                
            } else if(seleccion == 2){
                
                System.out.println("¿De cuanto será su retiro?");
                retiro = entrada.nextDouble();
                
                saldo = saldo - retiro;
                retiro = 0;
                
            } else if(seleccion == 3){
                
                System.out.println("¿De cuánto será su deposito?");
                deposito = entrada.nextDouble();
                
                saldo = saldo + deposito;
                deposito = 0;
                
            } else if(seleccion == 4){
                System.out.println("--------------------------"
                        + "\n¡Gracias!, vuelva pronto"
                        + "\n----------------------------");
                bandera = 2;
            }
        } while (bandera != 2);
    }
}
