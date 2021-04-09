package ambitos;

/**
 *
 * @author Rem3
 */
public class V_Local {
    
     int Variable_Global;// Variable global - No se inicializa
    
    void miMetodo(int parametro) {
        int variableLocal = 52; //Variable local se debe inicializar
        
        System.out.println("El valor de la variableLocal es: " + variableLocal);
        System.out.println("El valor de parámetro es: " + parametro);
    }
    
    public void Prueba_1() {
        //System.out.println("El valor de la variableLocal es: " + variableLocal);
    }
    
    void miMetodo() {
        System.out.println("Valor de variableGlobal: " + Variable_Global);
    }
    
    public void Prueba_2() {
        System.out.println("Valor de variableGlobal: " + Variable_Global);        
    }
}