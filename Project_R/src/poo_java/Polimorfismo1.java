package poo_java;

/**
 *
 * @author Rem3
 */
public class Polimorfismo1 {
    
    public static void main(String[] args) {
        
        Clase_PadrePo ent = new Suma_ClaseHijaPo();
        ent.PedirDatos();
        ent.Operaciones();
        ent.MostrarResultados();
        
        Clase_PadrePo ento = new Resta_ClaseHijaPo();
        ento.PedirDatos();
        ento.Operaciones();
        ento.MostrarResultados();
        
    }
}
