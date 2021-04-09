package poo_matrices;

import java.util.*;

public class Funcionamiento extends Propiedades { // El extends sirve para hacer la herencia.

    private static int bandera = 0;
    private int opciones;
    private static final Scanner in = new Scanner(System.in);
    Operaciones ope = new Operaciones();
    Propiedades pro = new Propiedades();
    FuncOperacion segunda = new FuncOperacion();

    public void Ejecucion() {
        System.out.println("========================================" + "\nBIENVENIDO A NUESTRO PROGRAMA DE MATRICES"
                + "\n=========================================");
        do {
            try {
                System.out.print("\n________________________________________" + "\nOpciones"
                        + "\n1).\tPropiedades de la matriz." + "\n2).\tOperaciones con matrices." + "\n3).\tSalir."
                        + "\nSu opción: ");
                opciones = in.nextInt();
            } catch (Exception e) {
                System.out.println("Error solo ingrese números...");
                System.exit(0);
            }
            if (opciones == 1) { // Con esta opción mostraremos las propiedades de su matriz.
                Matrices matriz1 = new Matrices("Matriz 1");
                matriz1.DarFilCol();
                matriz1.ingresarValores();
                System.out.println(matriz1.mostrarDimen());
                matriz1.imprimirMatriz();
                if (matriz1.tipo == "CUADRADA") {
                    System.out.println(Nula(matriz1.arr) + "\n" + TriangularInf(matriz1.arr) + "\n"
                            + TriangularSup(matriz1.arr) + "\n" + Diagonal(matriz1.arr) + "\n" + Escalar(matriz1.arr)
                            + "\n" + Identidad(matriz1.arr) + "\n" + Simetrico(matriz1.arr));
                } else if (matriz1.tipo == "RECTANGULAR") {
                    System.out.println("Su matriz es rectangular entonces mostraremos su transpuesta");
                    ope.Transpuesta(matriz1.arr);
                }
            } else if (opciones == 2) { // Esta parte se hara en la parte de FuncOperaciones.java
                segunda.EjecucionOp2();
            } else if (opciones == 3) { // Aquí es cuando acaba los procedimientos de ejecución
                System.out.println("Gracias esperamos haberle ayudado.");
                bandera = 0;
            } else {
                System.out.println(".\nEsa opción no esta contemplada vuelva a intentarlo.\n.");
            }
        } while (bandera == 1);
    }
}
