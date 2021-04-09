package clases_AlgotrimiaP;
import java.util.Scanner;
public class Nombre {

    public static void main(String[] args) {
    
        String nombre= "";
        Scanner valor = new Scanner(System.in);
        
        System.out.println("Ingrese su nombre");
        nombre = valor.nextLine();
        
        System.out.println("Bienvenido " + nombre);
    }
    
}