package operaciones;

import java.util.Scanner;

/**
 *
 * @author Rem3
 */
public class clasePadre {
    protected int valorUno, valorDos, resultado;
    Scanner entrada = new Scanner(System.in);
    
    //este metodo pide los valores al usuario:
    public void pedirDatos(){
        System.out.println("Dame el primer valor");
        valorUno = entrada.nextInt();
        
        System.out.println("Dame el segundo valor");
        valorDos = entrada.nextInt();
        
    }
        
    //este metodo muestra el resultado:
    public void MostrarResultado(){
        System.out.println(resultado);
    }
}
