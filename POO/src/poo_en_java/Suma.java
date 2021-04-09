package poo_en_java;

public class Suma{
  
    private int vUno, vDos, Resultado;
    
    public Suma(int valorUno, int valorDos){
        this.vUno = valorUno;
        this.vDos = valorDos;
        
    }
    public void Operación(){
    
        Resultado = vUno + vDos; 
        
    }
    public void Imprimir(){
    
        Operación();
        System.out.println("El resultado de la suma es: "   + Resultado);
        
    }
}