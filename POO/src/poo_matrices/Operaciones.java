package poo_matrices;

public class Operaciones {

    private double S = 0;

    // Transpuesta
    public void Transpuesta(double arr1[][]) {
        // con estos for imprimiremos en pantalla la matriz transpuesta entregada.
        System.out.print("\033[32mSu transpuesta es:\n");
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
        System.out.print("El resultado de su suma es:\n");
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
        System.out.print("El resultado de su resta es:\n");
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
        System.out.print("El resultado de su multiplicación es:\n");
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

    public static double Determinante(double arr1[][], int x) {
        // Aquí trabajaremos la determinante de la matriz cuadrada.
        System.out.print("La determinante de la matriz es: ");
        double D = 0;
        if (x == 1) {
            D = arr1[0][0];
        } else {
            for (int j = 0; j < arr1.length; j++) {
                D = D + arr1[0][j] * cofactor(arr1, 0, j);
            }
        }
        return D;
    }

    private static double cofactor(double arr1[][], int a, int b) {
        // Con esto calculamos el cofacto de la matriz ingresada.
        int x = arr1.length - 1;
        double submatriz[][] = new double[x][x];
        int i1 = 0, j1 = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < submatriz.length; j++) {
                if (i != a && j != b) {
                    submatriz[i1][j1] = arr1[i][j];
                    j1++;
                    if (j1 >= x) {
                        i1++;
                        j1 = 0;
                    }
                }
            }
        }
        return Math.pow(-1.0, b + a) * Determinante(submatriz, submatriz.length);
    }
}

class BreakYContinue {
    public static void main(String[] args) {
        
        for (int i = 1; i < 20; i++) {
            System.out.println(i + ":\tAntes");
            if (i % 3 == 0) {
                break;
                // continue;
            }
            System.out.println(i + ":\tDespués");
        }
        System.out.println("Al final");
    }
}
