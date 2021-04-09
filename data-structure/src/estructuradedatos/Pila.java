package estructuradedatos;

import javax.swing.JOptionPane;

/**
 * 
 * @author Joan y Rem3
 */
public class Pila {
    
    private Nodo UltimoValorIngresado;
    int tamaño = 0;
    String Lista = "";

    public Pila() {
        UltimoValorIngresado = null;
        tamaño = 0;
    }
    
    //Método para saber cuando la pila esta vacia
    public boolean PilaVacia() {
        return UltimoValorIngresado == null;
    }
    
    //Método para insetar un nodo en la pila
    public void InsertarNodo(int nodo) {
        Nodo nuevo_nodo = new Nodo(nodo);
        nuevo_nodo.siguiente = UltimoValorIngresado;
        UltimoValorIngresado = nuevo_nodo;
        tamaño++;
    }
    
    //Método para eliminar un nodo de la pila
    public int EliminarNodo() {
        int auxiliar = UltimoValorIngresado.información;
        UltimoValorIngresado = UltimoValorIngresado.siguiente;
        tamaño--;
        return auxiliar;
    }
    
    //Método para conocer cual es el último valor ingresado
    public int MostrarUltimoValorIngresado() {
        return UltimoValorIngresado.información;
    }
    
    //Método para conocer el tamaño de la Pila
    public int TamañoPila() {
        return tamaño;
    }
    
    //Método para vaciar Pila
    public void VaciarPila() {
        while (!PilaVacia()) {
            EliminarNodo();
            
        }
    }
    
    //Método para mostrar el contenido de la pila
    public void MostrarValores() {
        Nodo recorrido = UltimoValorIngresado;
        
        while (recorrido != null) {
            Lista += recorrido.información + "\n";
            recorrido = recorrido.siguiente;
        }
        JOptionPane.showMessageDialog(null, Lista);
        Lista = "";
    }
}
