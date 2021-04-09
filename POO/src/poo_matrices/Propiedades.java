package poo_matrices;

public class Propiedades {

    private static double valor = 0;

    // Nulla
    public static String Nula(double arr[][]) {
        valor = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    valor++;
                }
            }
        }
        if (valor == arr.length * arr.length) {
            return "\033[34m--ES UNA MATRIZ NULA\n";
        } else {
            return "\033[34m--NO EN UNA MATRIZ NULA\n";
        }
    }

    // Triangular superior
    public static String TriangularSup(double arr[][]) {
        valor = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i > j) {
                    if (arr[i][j] == 0) {
                        valor++;
                    }
                }
            }
        }
        if (valor == (((arr.length - 1) * arr.length)) / 2) {
            return "\033[34m---ES TRIANGULAR SUPERIOR\n";
        } else {
            return "\033[34m---NO ES TRIANGULAR SUPERIOR\n";
        }
    }

    // Trinagular Inferior
    public static String TriangularInf(double arr[][]) {
        valor = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (j > i) {
                    if (arr[i][j] == 0) {
                        valor++;
                    }
                }
            }
        }
        if (valor == (((arr.length - 1) * arr.length)) / 2) {
            return "\033[34m--ES TRIANGULAR INFERIOR\n";
        } else {
            return "\033[34m--NO ES TRIANGULAR INFERIOR\n";
        }
    }

    // Matriz Identidad
    public static String Identidad(double arr[][]) {
        int comp = 0;
        valor = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    if (arr[i][j] == 1) {
                        comp++;
                    }
                } else if (arr[i][j] == 0) {
                    valor++;
                }
            }
        }
        if (comp == arr.length && valor == (arr.length * (arr.length - 1))) {
            return "\033[34m---ES UNA MATRIZ IDENTIDAD\n";
        } else {
            return "\033[34m---NO ES UNA MATRIZ IDENTIDAD\n";
        }
    }

    // diagonal
    public static String Diagonal(double arr[][]) {
        valor = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i != j) {
                    if (arr[i][j] == 0) {
                        valor++;
                    }
                }
            }
        }
        if (valor == (arr.length * arr.length) - arr.length) {
            return "\033[34m---ES DIAGONAL\n";
        } else if (valor != (arr.length * arr.length) - arr.length) {
            return "\033[34m---NO ES DIAGONAL\n";
        } else {
            return "\033[34m---NO SE QUE ES xDe";
        }
    }

    // escalar
    public static String Escalar(double arr[][]) {
        valor = 0;
        double l = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (i == j) {
                    if (arr[i][j] == arr[0][0]) {
                        valor++;
                    }
                } else if (arr[i][j] == 0) {
                    l++;
                }
            }
        }
        if (valor == arr.length && l == arr.length * (arr.length - 1)) {
            return "\033[34m--ES ESCALAR\n";
        } else {
            return "\033[34m--NO ES ESCALAR\n";
        }
    }

    // simetrica
    public static String Simetrico(double arr[][]) {
        valor = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if ((arr[i][j]) == (arr[j][i])) {
                    valor++;
                }
            }
        }
        if (valor == arr.length * arr.length) {
            return "\033[34m--- ES SIMETRICA\n";
        } else {
            return "\033[34m--- NO ES SIMETRICA\n";
        }
    }
}
