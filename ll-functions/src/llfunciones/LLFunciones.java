/*
 *Clase para las funciones logicas de una lavadora 
 */
package llfunciones;

/**
 *
 * @author Rem3
 */
public class LLFunciones {
    
    private int kilos = 0, llenadoCompleto = 0, TipoDeRopa = 0, LavadoCompleto = 0, SecadoCompleto = 0;

     public LLFunciones(int kilos, int TipoDeRopa){
         this.kilos = kilos;
         this.TipoDeRopa = TipoDeRopa;
     }
     private void Llenado(){
           if(kilos <= 12){
                 llenadoCompleto = 1;
                 System.out.println("Llenando...");
                 System.out.println("Llenado completo.");
           } else{
           
               System.out.println("La carga de ropa es muy alta, reducela");
               
           }
     }
     private void Lavado(){//Este método sirve para lavar
         Llenado();
         if(llenadoCompleto == 1){
             if(TipoDeRopa == 1){
                 System.out.println("Ropa blanca / Lavado suave");
                 System.out.println("Lavando...");
                 LavadoCompleto = 1;
             } else if(TipoDeRopa == 2){
                 System.out.println("Ropa de color / Lavado intenso");
                 System.out.println("Lavando...");
                 LavadoCompleto = 1;
             } else {
                 System.out.println("El tipo de ropa no esta disponible");
                 System.out.println("Se lavara como ropa de color / Lavado intenso");
                 LavadoCompleto = 1;
             }
         }
     }
     private void Secado(){
         Lavado();
         if(LavadoCompleto == 1){
             System.out.println("Secando");
             SecadoCompleto = 1;
         }
     }
     public void CicloFinalizado(){
         Secado();
         if(SecadoCompleto == 1){
             System.out.println("Tu ropa esta lista");
         }
     }
     
     //Setter y Getter
     
     public int getTipoDeRopa(){
         return TipoDeRopa;
     }
     
     public void setTipoDeRopa(int TipoDeRopa){
         this.TipoDeRopa = TipoDeRopa;
     
     }
}
