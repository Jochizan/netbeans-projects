package parte;

public class Operations extends Range {

    private double S = 0;

    // Transpuesta
    public void Transpuesta(double arr1[][]) {
        // con estos for imprimiremos en pantalla la matriz transpuesta entregada.
        System.out.println("Su transpuesta es: ");
        for (int j = 0; j < arr1[0].length; j++) {
            for (int i = 0; i < arr1.length; i++) {
                System.out.print("[" + arr1[i][j] + "]");
            }
            System.out.print("\n");
        }
    }

    // Por un escalar
    public void Escalar(double arr1[][], double escalar) {
        // con este for multiplicamos cada valor de la posición [x][y] por el escalar.
        S = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                S = arr1[i][j] * escalar;
                System.out.print("[" + S + "]");
                S = 0;
            }
            System.out.println("");
        }
    }

    // Suma de matrices
    public void SumaMat(double arr1[][], double arr2[][]) {
        // Con estos for sumamos los elementos de posiciones iguales en ambas matrices
        System.out.print("El resultado de su suma es: ");
        S = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                S = arr1[i][j] + arr2[i][j];
                System.out.print("[" + S + "]");
            }
            System.out.println("");
        }
    }

    // Resta de matrices
    public void RestaMat(double arr1[][], double arr2[][]) {
        // Con estos for restamos los elementos de posiciones iguales en ambas matrices
        System.out.print("El resultado de su resta es: ");
        S = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                S = arr1[i][j] - arr2[i][j];
                System.out.print("[" + S + "]");
            }
            System.out.println("");
        }
    }

    // Multiplicación de matrices
    public void MultMat(double arr1[][], double arr2[][]) {
        // Con estos for multiplicamos término de posicón (x, z) j (z, y)
        System.out.print("El resultado de su multiplicación es:");
        S = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2[0].length; j++) {
                for (int k = 0; k < arr1[0].length; k++) {
                    S = S + arr1[i][k] * arr2[k][j];
                }
                System.out.print("[" + S + "]");
                S = 0;
            }
            System.out.println("");
        }
    }

    public void Traza(double arr1[][]) {
        // Estos fors son para el cálculo de la traza de una matriz.
        System.out.print("Esta es la traza de su matriz: ");
        S = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[0].length; j++) {
                if (i == j) {
                    S = S + arr1[i][j];
                }
            }
        }
        System.out.print(S);
    }

    public static double determinanteMatriz(double x[][], int N) {
        double det = 0;
        switch (N) {
            case 2:
                det = ((x[0][0] * x[1][1]) - (x[1][0] * x[0][1]));
                break;
            case 3: // Método de Sarrus
                det = ((x[0][0]) * (x[1][1]) * (x[2][2]) + (x[1][0]) * (x[2][1]) * (x[0][2])
                        + (x[2][0]) * (x[0][1]) * (x[1][2]))
                        - ((x[2][0]) * (x[1][1]) * (x[0][2]) + (x[1][0]) * (x[0][1]) * (x[2][2])
                        + (x[0][0]) * (x[2][1]) * (x[1][2]));
                break;
            default: // Desarrollo a partir de los elementos de una fila/columna
                for (int z = 0; z < x.length; z++) {
                    det += (x[z][0] * adj(x, z, 0));
                }
        }
        return det;
    }

    private static double adj(double x[][], int i, int j) {
        double adjunto;
        double y[][] = new double[x.length - 1][x.length - 1];
        int m, n;
        for (int k = 0; k < y.length; k++) {
            if (k < i) {
                m = k;
            } else {
                m = k + 1;
            }
            for (int l = 0; l < y.length; l++) {
                if (l < j) {
                    n = l;
                } else {
                    n = l + 1;
                }
                y[k][l] = x[m][n];
            }
        }
        adjunto = Math.pow(-1, i + j) * determinanteMatriz(y, y.length);
        return adjunto;
    }

    public static String Iguality(double arr[][]) {
        // Aquí veremos si todos los valores de la matriz son iguales.
        double comp = arr[0][0] - 1;
        int cont = 0;
        for (int i = 0; i < arr.length; ++i) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] - 1 == comp) {
                    cont++;
                }
            }
        }
        if (cont == arr.length * arr[0].length) {
            return "La matriz tiene todos los valores iguales";
        } else {
            return "La matriz no tiene todo los valores iguales";
        }
    }

    public static void ordingMatriz(double arr[][]) {

    }
}
