package matrices_y_determinantes;

import java.util.Scanner;
import static matrices_y_determinantes.Determinante2.determinante;

public class Determinante_de_entrada{
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese las filas de su matriz");
        int i = entrada.nextInt();
        
        System.out.println("Ingrese las columnas de su matriz");
        int j = entrada.nextInt();
        
        double matriz[][] = new double[i][j];
        
        for(int x = 0; x < matriz.length; x++){
            for(int y = 0; y<matriz[x].length; y++){
                
                System.out.print("Ingrese el valor de la posición[" +(x+1)+ "][" + (y+1)+ "]");
                matriz[x][y] = entrada.nextDouble();
                
            }
        }
        double det;
    if(matriz.length==2){
        
        det=(matriz[0][0]*matriz[1][1])-(matriz[1][0]*matriz[0][1]);
        
    }
    double suma=0;
    for(int n=0; i<matriz.length; i++){
        
    double[][] nm=new double[matriz.length-1][matriz.length-1];
    
        for(int m=0; j<matriz.length; j++){
            
            if(j!=i){
                
                for(int k=1; k<matriz.length; k++){
                int indice=-1;
                if(j<i)
                indice=j;
                else if(j>i)
                indice=j-1;
                nm[indice][k-1]=matriz[j][k];
                
                }
            }
        }
        if(i%2==0){
        suma+=matriz[i][0] * determinante(nm);
        }
        else{
        suma-=matriz[i][0] * determinante(nm);
        }
    }
        System.out.println("La determinante es: " + suma);
    }
}