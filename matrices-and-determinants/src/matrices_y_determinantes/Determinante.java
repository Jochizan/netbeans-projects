package matrices_y_determinantes;

import java.util.Scanner;

public class Determinante{
    
	public static void main(String []args){
            
         Scanner entrada = new Scanner(System.in);
	int m[][];
	int mTraspuesta[][];
	int determinante;
         int N;
         
	System.out.println("Introduzca el numero de filas o columnas de la matriz");
         N = entrada.nextInt();
	m=new int[N][N];
	escribirMatriz(m);

	System.out.println("Seleccione una opción\n---------------"
                + "\n\t1.- Mostrar la matriz"
                + "\n\t2.- Comprobar si la matriz es simétrica"
                + "\n\t3.- Mostrar la matriz traspuesta"
                + "\n\t4.- Calcular el determinante"
                + "\n\t0.- Salir");
        
                  int opcion = entrada.nextInt();
		do{
			switch(opcion){
				case 1:
					System.out.println("La matriz introducida es:");
					mostrarMatriz(m);
					break;
				case 2:
					mTraspuesta=trasponerMatriz(m);
					if(simetriaMatrices(m,mTraspuesta)==true){
						System.out.println("La matriz es simétrica");
					}
					else{
						System.out.println("La matriz NO es simétrica");
					}
					break;
				case 3:
					mTraspuesta=trasponerMatriz(m);
					System.out.println("Su traspuesta es:");
					mostrarMatriz(mTraspuesta);
					break;
				case 4:
					determinante=determinanteMatriz(m, N);
					System.out.println("El determinante es: "+determinante);
			}
			System.out.println("Seleccione una de las opciones anteriores para seguir operando con esta matriz");
                           opcion = entrada.nextInt();
		}while(opcion!=0);
	}
	public static int[][] escribirMatriz(int x[][]){
                  Scanner teclado = new Scanner(System.in);
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[0].length;j++){
				System.out.print("Introduzca el número de la posición["+(i+1)+"]["+(j+1)+"]: ");
                                    x[i][j]= teclado.nextInt();
			}
		}
		return x;
	}
	public static void mostrarMatriz(int x[][]){
		for(int i=0;i<x.length;i++){
			for(int j=0;j<x[0].length;j++){
				System.out.print("[" + x[i][j]+"]\t");
			}
			System.out.print("\n");
		}
	}
	public static int[][] trasponerMatriz(int x[][]){
		int y[][]= new int[x.length][x.length];
		for(int i=0;i<y.length;i++){
			for(int j=0;j<y.length;j++){
				y[i][j]=x[j][i];
			}
		}
		return y;
	}
	public static boolean simetriaMatrices(int x[][],int y[][]){
			for(int i=0;i<x.length;i++){
				for(int j=0;j<x.length;j++){
					if(x[i][j]!=y[i][j]){
						return false;
					}
				}
			}
			return true;
	}
	public static int determinanteMatriz(int x[][], int N){
		int det=0;
		switch(N){
			case 2:
				det=((x[0][0]*x[1][1])-(x[1][0]*x[0][1]));
				break;
			case 3:	//Método de Sarrus
				det=((x[0][0])*(x[1][1])*(x[2][2])+(x[1][0])*(x[2][1])*(x[0][2])+(x[2][0])*(x[0][1])*(x[1][2]))-((x[2][0])*(x[1][1])*(x[0][2])+(x[1][0])*(x[0][1])*(x[2][2])+(x[0][0])*(x[2][1])*(x[1][2]));
				break;
			default:	//Desarrollo a partir de los elementos de una fila/columna			
				for(int z=0;z<x.length;z++){
					det+=(x[z][0]*adj(x,z,0));
				}
		}
		return det;
	}
	public static int adj(int x[][], int i, int j){
		int adjunto;
		int y[][]=new int[x.length-1][x.length-1];
		int m,n;
		for(int k=0;k<y.length;k++){	
			if(k<i){							
				m=k;
			}
			else{
				m=k+1;
			}
			for(int l=0;l<y.length;l++){
				if(l<j){
					n=l;
				}
				else{
					n=l+1;
				}
				y[k][l]=x[m][n];
			}
		}
		adjunto=(int)Math.pow(-1,i+j)*determinanteMatriz(y, y.length);		
		return adjunto;																	
	}
}