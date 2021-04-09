package clases;

/**
 *
 * @author Rem3
 */
public class OperacionesBancarias extends ClasePadre_1{
    
    public static void main(String[] args) {
        
        ClasePadre_Abs mensajero = new ClaseHijaConsulta();
        mensajero.setSaldo(500);
        mensajero.Operaciones();
        
    }
}
