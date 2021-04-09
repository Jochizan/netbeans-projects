package clases;

/**
 *
 * @author Rem3
 */
public class ClaseHijaConsulta extends ClasePadre_Abs{
    
    @Override
    public void Transacciones(){
        System.out.println("--------------------------"
                + "\nTu saldo actual es: " + getSaldo()
                + "\n-----------------------------");
    }
}
