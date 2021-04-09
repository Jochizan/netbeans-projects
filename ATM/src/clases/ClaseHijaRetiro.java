package clases;

/**
 *
 * @author Rem3
 */
public class ClaseHijaRetiro extends ClasePadre_Abs{
    
    @Override
    public void Transacciones(){
        System.out.print("¿Cuánto deseas  retirar?: ");
        Retiro();
        if(retiro <= getSaldo()){
            transacciones = getSaldo();
            setSaldo(transacciones - retiro);
            System.out.println("-----------------------"
                            + "\n¡Retiraste!: " + retiro
                            + "\nTu saldo actual es: " + getSaldo()
                            + "\n----------------------");
        } else {
            System.out.println("-----------------------"
                    + "'\nSaldo insuficiente"
                    + "---------------------------");
        }
    }
}
