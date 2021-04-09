package prueba;

public class operaciones {
    
    public static int[][] sumarDosMatrices(int[][] a, int[][] b) {
 
        // En este metodo se supone que las 2 matrices tienen el mismo tamaño
        int matrizResultante[][];
        int i, j, filasA, columnasA;
        filasA = a.length;
        columnasA = a[0].length;
 
        matrizResultante = new int[filasA][columnasA];
 
        for (i = 0; i < filasA; i++) {
            
            for (j = 0; j < columnasA; j++) {
                
                matrizResultante[i][j] = a[i][j] + b[i][j];
                
            }
        }
        return matrizResultante;
    }
 
    public static int[][] restarDosMatrices(int[][] a, int[][] b) {
 
        // En este metodo se supone que las 2 matrices tienen el mismo tamaño
        int matrizResultante[][];
        int i, j, filasA, columnasA;
 
        filasA = a.length;
        columnasA = a[0].length;
 
        matrizResultante = new int[filasA][columnasA];
 
        for (i = 0; i < filasA; i++) {
            
            for (j = 0; j < columnasA; j++) {
                
                matrizResultante[i][j] = a[i][j] - b[i][j];
            }
        }
        return matrizResultante;
    }
 
    public static int[][] multiplicarDosMatrices(int[][] a, int[][] b) {
        
        int sum, c [][] = new int [a.length][b[0].length];
 
        for (int i = 0; i < a.length; i++) {
            
            for (int j = 0; j < b[0].length; j++) {
                
                sum=0;
                for(int k=0;k < a[0].length;k++){
                    
                    sum += a[i][k]*b[k][j];
                    
                }
                c[i][j]=sum;
            }
        }
        return c;
 
    }
 

    public static int[][] matrizPorEscalar(int[][] a, int b) {
 
        int[][] matrizResultado = new int[a.length][a[0].length];
        
        for (int i = 0; i != a.length; i++) {
            
            for (int j = 0; j != a[i].length; j++) {
                
                matrizResultado[i][j] = a[i][j] * b; //simplemente se multiplica cada valor de la matriz por el valor escalar.
                
            }
        }
        return matrizResultado;
    }
    //public static void main(String[] args) {
        //Matrices ent = new Matrices();
        //ent.sumarDosMatrices(a, b);
        //ent.restarDosMatrices(a, b);
        //ent.multiplicarDosMatrices(a, b);
        //ent.matrizPorEscalar(a, 0)
    //}
}

