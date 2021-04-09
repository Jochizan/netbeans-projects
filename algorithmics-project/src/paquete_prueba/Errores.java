package paquete_prueba;

/**
 *
 * @author Rem3
 */
public class Errores {
    
    public static void main(String[] args) {
        
        int numero;
        String cadena = "uno";
        try{
        numero = Integer.parseInt(cadena);
        }
        catch(NumberFormatException e){
            System.out.println("No es un número, es una cadena de texto");
        }
    }
}
