package HilosConParametros;

/**
 *
 * @author Rem3
 */
public class Proceso extends Thread{
    
    int num_int;
    
    public Proceso(String NameHilo) {
        super(NameHilo);
        
    }
    
    @Override
    public void run() {
        for (int i = 0; i <= num_int; i++) {
            System.out.println(i+ this.getName());
        }
        System.out.println("...");
    }
    
    public void valorCondición(int valor) {
        
        num_int = valor;
        
        
    }
}
