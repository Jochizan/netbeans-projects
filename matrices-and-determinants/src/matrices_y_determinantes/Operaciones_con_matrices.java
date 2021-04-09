package matrices_y_determinantes;

import java.util.Scanner;

public class Operaciones_con_matrices{

    public static void main(String[] args) {
        
        int num_n = 0, S = 0, opción = 0, i1=0,j1=0,i2=0,j2=0;
        int MatrizA[][];
        int MatrizB[][];
        int MatrizC[][];
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Opciones:\tOperación"
                     + "\n1.\t¿Quiere calcular una matriz por un escalar?"
                     + "\n2.\t¿Quiere operar con 2  matrices?");
        try{
            num_n = entrada.nextInt();
        }catch(java.util.InputMismatchException r){
            System.out.println("Error solo ingrese números");
            System.exit(0);
        }
        if(num_n == 2){
        System.out.println("\nAhora eliga que proceso quiere hacer:"
                    + "\n\tOpción\tOperación"
                    + "\n\t1.\tSuma"
                    + "\n\t2.\tResta"
                    + "\n\t3.\tMultiplicación");
        try{
            opción = entrada.nextInt();
        }catch(java.util.InputMismatchException s){
            System.out.println("Error solo ingrese números");
            System.exit(0);
        }
        }  
        if((opción == 1 || opción == 2 || opción == 3) && num_n == 2){
            
            System.out.print("Ingrese la cantidad de filas de su primera matriz: ");
            try {
                i1 = entrada.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error solo ingrese números");
                System.exit(0);
            }
            
            System.out.print("Ingrese la cantidad de columnas de la primera matriz: ");
            try {
                j1 = entrada.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error solo ingrese números");
                System.exit(0);
            }
            
            System.out.print("Ingrese la cantidad de filas de su segunda matriz: ");
            try {
                i2 = entrada.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error solo ingrese números");
                System.exit(0);
            }
            System.out.print("Ingrese la cantidad de columnas de la segunda matriz: ");
            try {
                j2 = entrada.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error solo ingrese números");
                System.exit(0);
            }
            
            if(((opción == 2 || opción == 1) && i1 == i2 && j1 == j2)|| (opción == 3 && j1 == i2) && i1>0 && i2>0 && j1 >0 && j2>0){
            
            MatrizA = new int[i1][j1];
            //los for para ingresar los valores en posicón [x][y] pra nuestra primera matriz
            for(int x = 0; x < MatrizA.length; x++){
                
                for(int y = 0; y < MatrizA[x].length; y++){
                    try{
                    System.out.print("Ingrese el valor de la posición[" +(x+1)+"][" + (y+1) + "]: ");
                    MatrizA[x][y] = entrada.nextInt();
                    }catch(java.util.InputMismatchException u){
                        System.out.println("Error solo ingrese números");
                        System.exit(0);
                    }
                }
            }
            MatrizB = new int[i2][j2];
            //los for para ingresar los valores en posicón [x][y] pra nuestra segunda matriz
            for(int x = 0; x < MatrizB.length; x++){
                
                for(int y = 0; y < MatrizB[x].length; y++){
                    try{
                    System.out.print("Ingrese el valor de la posición[" +(x+1)+"][" + (y+1) + "]: ");
                    MatrizB[x][y] = entrada.nextInt();
                    }catch(java.util.InputMismatchException t){
                        System.out.println("Error ingrese solo números");
                        System.exit(0);
                    }
                }
            }
            
                System.out.println("");
                //este for para imprimir nuestra primera matriz
            for(int x = 0; x < i1; x++){
                for(int y = 0; y < j1; y++){
                    
                    System.out.print("[" + MatrizA[x][y] + "]");
                    
                }
                System.out.println("");
            }
                System.out.println("");
                //este for para imprimir nuestra segunda matriz
            for(int x = 0; x < i2; x++){
                for(int y = 0; y < j2; y++){
                    
                    System.out.print("[" + MatrizB[x][y] + "]");
                    
                }
                System.out.println("");
            }
            
            
            
            if(opción == 1){
                
                System.out.println("El resultado de su suma es: ");
                //Con estos for sumamos los elementos de posiciones iguales en ambas matrices 
                for(int x = 0; x < i1; x++){
                    for(int y = 0; y < j1; y++){
                        
                        S = MatrizA[x][y] + MatrizB[x][y];
                        System.out.print("[" + S + "]");
                        
                    }
                    System.out.println("");
                }
                
            }else if(opción == 2){

                System.out.println("El resultado de su resta es: ");
                //Con estos for restamos los elementos de posiciones iguales en ambas matrices 
                for(int x = 0; x < i1; x++){
                    for(int y = 0; y < j1; y++){
                        
                        S = MatrizA[x][y] - MatrizB[x][y];
                        System.out.print("[" + S + "]");
                    }
                    System.out.println("");
                }
                
            }
            else if(opción == 3){
                
                System.out.println("El resultado de su multiplicación es:");
                //Con estos for multiplicamos término de posicón (x, z) y (z, y) 
                for(int x = 0; x < i1; x++){
                    
                    for(int y = 0; y < j2; y++){
                        
                        for(int z = 0; z < j1; z++){
                            
                            S = S + MatrizA[x][z] * MatrizB[z][y];
                            
                        }
                        System.out.print("[" + S + "]");
                        S = 0;
                    }
                    System.out.println("");
                }
            }
            }else{
                
                System.out.println("Error con la cantidad de filas y columnas de las matrices para operar.");
                
            }
            
        }else if(num_n == 1){
            
            System.out.println("Ingrese la cantidad de filas de su matriz: ");
            try {
                i1 = entrada.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error solo ingrese números");
                System.exit(0);
            }
            System.out.println("Ingrese la cantidad de columnas de su matriz: ");
            try {
                j1 = entrada.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error solo ingrese números");
                System.exit(0);
            }
            
            
            System.out.println("Ingrese el escalar que va multiplicar a su matriz: ");
            int escalar = entrada.nextInt();
            
            MatrizC = new int[i1][j1];
            //otro for para el ingreso de las valores de esta matriz[x][y]
            for(int x = 0; x < MatrizC.length; x++){
                for(int y = 0; y < MatrizC[x].length; y++){
                    try{
                    System.out.print("Ingrese el valor de la posición[" +(x+1)+"][" + (y+1) + "]: ");
                    MatrizC[x][y] = entrada.nextInt();
                    }catch(java.util.InputMismatchException e){
                        System.out.println("Error solo ingrese números");
                        System.exit(0);
                    }
                }
            }
            System.out.println("El resultado es: ");
            //con este for multiplicamos cada valor de la posición [x][y] por el escalar.
            for(int x = 0; x < i1; x++){
                for(int y = 0; y < j1; y++){
                    
                    S = MatrizC[x][y] * escalar;
                    System.out.print("[" + S + "]");
                    S=0;
                }
                System.out.println("");
            }
 
        }else{
            
            System.out.println("Solo ingrese una de las opciones");
            
        }
    }
}