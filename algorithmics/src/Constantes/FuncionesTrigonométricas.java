package Constantes;

/**
 *
 * @author Joan y Rem3
 */
public class FuncionesTrigonométricas {
     
    public static void main(String[] args) {
        
        double resultado = 0;
        double anguloEnGrados = 45;
        double anguloEnRadianes = Math.toRadians(anguloEnGrados);
        
        //Seno
        resultado = Math.sin(anguloEnRadianes);
        
        System.out.println("Seno de " + anguloEnGrados + " es: " + resultado);
        
        //Coseno
        resultado = Math.cos(anguloEnRadianes);
        
        System.out.println("Coseno de " + anguloEnGrados + " es: " + resultado);
        
        
        //Tangente
        resultado = Math.tan(anguloEnRadianes);
        
        System.out.println("Tangente de " + anguloEnGrados + " es: " + resultado);
        
        double valorIngresado = 0.707;
        //ArcSeno
        anguloEnRadianes = Math.asin(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco seno de: " + valorIngresado + " = " + anguloEnGrados + "°");
        
        //ArcCoseno
        anguloEnRadianes = Math.acos(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco coseno de: " + valorIngresado + " = " + anguloEnGrados + "°");
        
        
        //ArcTan
        anguloEnRadianes = Math.atan(valorIngresado);
        anguloEnGrados = Math.toDegrees(anguloEnRadianes);
        System.out.println("Arco tangente de: " + valorIngresado + " = " + anguloEnGrados + "°");
    
    }
}
