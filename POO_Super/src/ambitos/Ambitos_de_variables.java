package ambitos;

/**
 * 
 * @version 1.0
 * @author Rem3
 */
public class Ambitos_de_variables {
    /**
            * Ejemplo donde aparecen los tres tipos de ámbitos 
            */
    static int variableEstatica;
    public static int variableEstaticaJoan = 23;
    
    int variableGlobal;
    
    void miMetodo(int parametro){
        
        int variableLocal = 0;
        // El parametro también es local dentro del método
    }
}