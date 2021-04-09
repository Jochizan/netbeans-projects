package HiloProceso;

/**
 * 
 * @author rem3
 */
public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        Hilo_Proceso hilo1 = new Hilo_Proceso();
        Hilo_Proceso hilo2 = new Hilo_Proceso();
        
        hilo1.start();
        
        try {
            
            hilo1.sleep(1000);
            
        } catch (InterruptedException e) {
            
            System.out.println("Error en el hilo1 " + e);
            
        }
        
        hilo2.start();
        hilo2.stop();
        
        try {
            
            hilo2.sleep(1000);
            
        } catch (InterruptedException e) {
            
            System.out.println("Error en el hilo1 " + e);
            
        }
    }
}
