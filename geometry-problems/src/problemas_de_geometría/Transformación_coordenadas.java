package problemas_de_geometría;

import java.util.Scanner;

public class Transformación_coordenadas{
    
  public static void main(String args[]){
  
      double x_prima, y_prima;
      double angulo_R;
      
      Scanner valor = new Scanner(System.in);
      
      double puntoA[] = new double [2];
          puntoA[0] = 0;
          puntoA[1] = 0;
          
          for (int x=0; x < puntoA.length; x++) {
           
         System.out.println("Introduzca el valor del punto A de la posición [" + x + "]");
         puntoA[x] = valor.nextDouble();
      
     }
          
      double puntoB[] = new double [2];
          puntoB[0] = 0;
          puntoB[1] = 0;
          
          for (int x=0; x < puntoB.length; x++) {
           
         System.out.println("Introduzca el valor del punto B de la posición [" + x + "]");
         puntoB[x] = valor.nextDouble();
      
     }
          
      System.out.println("Ingrese el valor del ángulo que se movió");
      angulo_R = valor.nextDouble();
      
      angulo_R = angulo_R*Math.PI/180;
      
      double Matriz_V_U[][] = new double [2][2];
             Matriz_V_U[0][0] = Math.cos(angulo_R);
             Matriz_V_U[0][1] = Math.cos((Math.PI/2)-angulo_R);
             Matriz_V_U[1][0] = -Math.cos((Math.PI/2)-angulo_R);
             Matriz_V_U[1][1] = Math.cos(angulo_R);
      
             x_prima = Matriz_V_U[0][0]*(puntoA[0] - puntoB[0]) + Matriz_V_U[0][1]*(puntoA[1] - puntoB[1]);
             y_prima = Matriz_V_U[1][0]*(puntoA[0] - puntoB[0]) + Matriz_V_U[1][1]*(puntoA[1] - puntoB[1]);
             
             System.out.println("Las nuevas coordenadas del puntoA es: [" + x_prima + "]" + "[" + y_prima + "]");
  }
}