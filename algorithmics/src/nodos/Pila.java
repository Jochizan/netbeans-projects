package nodos;

/**
 *
 * @author Joan y Rem3
 */
public class Pila {

    private Nodo UltimoValorIngresado;

    public Pila() {
        UltimoValorIngresado = null;
    }

    //Método para insertar dentro de la pila
    public void Insertar(char valor) {
        Nodo nuevo_nodo = new Nodo();
        nuevo_nodo.información = valor;

        if (UltimoValorIngresado == null) {

            nuevo_nodo.Siguiente = null;
            UltimoValorIngresado = nuevo_nodo;

        } else {

            nuevo_nodo.Siguiente = UltimoValorIngresado;
            UltimoValorIngresado = nuevo_nodo;
        }
    }
    
    //Método para extraer de la pila
    public char extraer() {
        if (UltimoValorIngresado!=null) {
            
            char información = UltimoValorIngresado.información;
            UltimoValorIngresado=UltimoValorIngresado.Siguiente;
            return información;
            
        } else {
            
            return Character.MAX_VALUE;
            
        }
    }
    
    //Método para saber si la pila esya vacia
    public boolean PilaVacia() {
        return UltimoValorIngresado == null;
    }
}
