package sincronización_de_hilos;

/**
 * 
 * @author Rem3
 */
public class Hilo2 extends Thread{
    
    @Override
    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.print("E");
            
            try {
                
                Hilo2.sleep(1000);
                
            } catch (InterruptedException e) {
                
                System.out.println("Error en la clase hilo2 " + e);
                
            }
        }
    }
}
