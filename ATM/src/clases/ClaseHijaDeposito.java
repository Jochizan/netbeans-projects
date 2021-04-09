package clases;

/**
 *
 * @author Rem3
 */
public class ClaseHijaDeposito extends ClasePadre_Abs{
    
    @Override
    public void Transacciones() {
        System.out.print("¿Cuánto deseas depositar?: ");
        Deposito();
        
        transacciones = getSaldo();
        setSaldo(transacciones + deposito);
        System.out.println("---------------------------"
                        + "\nDepositaste: " + deposito
                        + "\nTu saldo actual es: " + getSaldo()
                        + "\n--------------------------");
    }
}
