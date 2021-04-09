package poo_java;

import java.util.Scanner;

/**
 *
 * @author Rem3
 */

public abstract class Clase_PadrePo {
    protected int valor1, valor2, resultado;
    Scanner entrada = new Scanner(System.in);
    
    public void PedirDatos() {
        System.out.println("Dame el primer valor");
        valor1 = entrada.nextInt();
        System.out.println("Dame el segundo valor");
        valor2 = entrada.nextInt();
    }
    
    public abstract void Operaciones();
        
    public void MostrarResultados(){
        System.out.println(resultado);
    } 
}
