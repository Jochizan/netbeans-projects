package poo_en_java;

public class Rectangulo{
    
    private int base, altura, area;
    
    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    
    public void CalculoArea(){
         area = base * altura;
    }
    
    public void Imprimir(){
        CalculoArea();
        System.out.println("El area es: " + area);
    }
}