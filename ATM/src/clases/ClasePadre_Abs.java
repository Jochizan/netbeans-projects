package clases;

import java.util.Scanner;

/**
 *
 * @author Rem3
 */
public abstract class ClasePadre_Abs {

    protected double transacciones, retiro, deposito;
    private static double saldo = 500;
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
                            + "\nOpción no contemplada, vuelva a intentar porfavor."
                            + "\n-------------------------------------------------------------.");
                }
            } while (bandera == 0);
            
            if (seleccion == 1) {
                
                ClasePadre_Abs mens = new ClaseHijaConsulta();
                mens.Transacciones();
                
            } else if(seleccion == 2){
                
                ClasePadre_Abs mens = new ClaseHijaRetiro();
                mens.Transacciones();
                
            } else if(seleccion == 3){
                
                ClasePadre_Abs mens = new ClaseHijaDeposito();
                mens.Transacciones();
                
            } else if(seleccion == 4){
                System.out.println("--------------------------"
                        + "\n¡Gracias!, vuelva pronto."
                        + "\n----------------------------");
                bandera = 2;
            }
        } while (bandera != 2);
    }
    
    // Método para solicitar cantidad de retiro
    public void Retiro() {
        retiro = entrada.nextDouble();
    }
    
    // Método para solicitar cantidad de deposito
    public void Deposito() {
        deposito = entrada.nextDouble();
    }
    
    // Método abstracto 
    public abstract void Transacciones();
    
    // Métodos setter y getter
    public double getSaldo() {
        return saldo;
    }
    
    public void setSaldo(double saldo) {
        this.saldo = saldo; 
        
    }
}
 