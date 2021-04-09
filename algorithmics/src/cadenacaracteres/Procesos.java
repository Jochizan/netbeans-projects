package cadenacaracteres;

/**
 * 
 * @author Joan y Rem3
 */
public class Procesos extends Thread {
    
    @Override
    public void run() {
        
        for (int i = 0; i < 5; i++) {
            
            System.out.print(".");
            try{
            Procesos.sleep(500);
            }catch(InterruptedException e){
                System.out.println("Error en el hilo1: " + e);
            }
        }
    }
}
