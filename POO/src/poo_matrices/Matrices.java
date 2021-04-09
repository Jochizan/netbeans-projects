package poo_matrices;

import java.util.*;

public class Matrices {

    /*
     * Aquí pondremos las caracteristicas y cualidades de nuestra matriz y algunos
     * metodos setters y getters.
     */
    private int x;
    private int y;
    private final String nombre;
    public double arr[][];
    private final Scanner teclado = new Scanner(System.in);
    public String tipo;

    public Matrices(String nom) { // Constructor 
        nombre = nom;
        this.x = 2;
        this.y = 2;
        tipo = reconocerTipo(x, y);
        arr = new double[x][y];
    }

    public void DarFilCol() {
        try {
            System.out.print("Ingrese la cantidad de filas de la " + nombre + ": ");
            this.x = teclado.nextInt();
            System.out.print("Ingrese la cantidad de columnas de la " + nombre + ": ");
            this.y = teclado.nextInt();
        } catch (Exception e) {
            System.out.println("Error solo ingrese números enteros positivos");
        }
        this.arr = new double[this.x][this.y];
    }

    public void ingresarValores() { // Setter
        try {
            System.out.println("\n==========================================================="
                    + "\nIngrese los valores de la " + nombre + " a continuación: "
                    + "\n==========================================================");
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[0].length; j++) {
                    System.out.print("Ingrese el valor de la " + nombre + " de la posición[" + i + "][" + j + "]:");
                    arr[i][j] = teclado.nextDouble();
                }
            }
        } catch (Exception e) {
            System.out.println("Error solo ingrese números");
            System.exit(0);
        }
    }

    public void imprimirMatriz() { // Getter
        System.out.println("\nEsta es la " + nombre + ": ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print("\t[ " + arr[i][j] + " ]");
            }
            System.out.print("\n");
        }
    }

    public String mostrarDimen() { // Getter
        return "Su " + nombre + " es " + tipo + ": " + x + "x" + y;
    }

    private static String reconocerTipo(int x, int y) {
        if (x != y) {
            return "RECTANGULAR";
        } else {
            return "CUADRADA";
        }
    }

    public int mostrarFila() { // Gettter
        return x;
    }

    public int mostrarCol() { // Getter
        return y;
    }
}
