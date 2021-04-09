package poo_matrices;

import java.util.Scanner;

public class FuncOperacion extends Operaciones {

    private static Scanner ent = new Scanner(System.in);

    public void EjecucionOp2() {
        int band = 0;
        int opcion = 0;
        do {
            System.out.println("Diganos que operaciones quiere realizar" + "\nOpciones: " + "\n1).\tCon una matriz"
                    + "\n2).\tCon dos matrices" + "\n3).\tSalir");
            opcion = ent.nextInt();
            if (opcion == 1) { // Con esta opción el programa realizara las operaciones con una matriz.
                int banda = 2;
                Matrices matriz1 = new Matrices("Matriz 1");
                matriz1.DarFilCol();
                matriz1.ingresarValores();
                System.out.println(matriz1.mostrarDimen());
                matriz1.imprimirMatriz();
                do {
                    System.out.print("\nQue operación quiere realizar con la matriz" + "\n1).\tDeterminante"
                            + "\n2).\tTraza" + "\n3).\tTranspuesta" + "\n4).\txEscalar" + "\n5).\tSalir"
                            + "\nSu opción: ");
                    try{
                    opcion = ent.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error solo ingrese un digito");
                        System.exit(0);
                    }
                    switch (opcion) {
                        case 1:
                            Determinante(matriz1.arr, matriz1.arr.length - 1);
                            break;
                        case 2:
                            Traza(matriz1.arr);
                            break;
                        case 3:
                            Transpuesta(matriz1.arr);
                            break;
                        case 4:
                            System.out.print("Ingrese el escalar a multiplicar: ");
                            double escalar = ent.nextInt();
                            Escalar(matriz1.arr, escalar);
                        case 5:
                            banda = 1;
                            break;
                        default:
                            System.out.println("Esa opción no esta contemplada...");
                            break;
                    }
                } while (banda == 2);
            } else if (opcion == 2) { // Con esta opción haremos las operaciones entre dos matrices.
                Matrices matriz1 = new Matrices("Matriz 1");
                Matrices matriz2 = new Matrices("Matriz 2");
                int terminar = 0;
                do {
                    System.out.print("\nDiganos que operaciones quiere realizar entre estas matrices" + "\n1).\tSuma"
                            + "\n2).\tResta" + "\n3).\tMultiplicación" + "\n4).\tSalir"
                            + "\nSu opción: ");
                    try{
                    opcion = ent.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error solo ingrese un digito");
                        System.exit(0);
                    }
                    switch (opcion) {
                        case 1:
                            matriz1.DarFilCol();
                            matriz2.DarFilCol();
                            System.out.println(matriz1.mostrarDimen());
                            System.out.println(matriz2.mostrarDimen());
                            if (matriz1.mostrarCol() == matriz2.mostrarCol() & matriz1.mostrarFila() == matriz2.mostrarFila()) {
                                matriz1.ingresarValores();
                                matriz2.ingresarValores();
                                matriz1.imprimirMatriz();
                                matriz2.imprimirMatriz();
                                SumaMat(matriz1.arr, matriz2.arr);
                            } else {
                                System.out.println(
                                        "No se puden sumar porque tienen cantidad de columnas y filas distintas.");
                                terminar = 1;
                            }
                            break;
                        case 2:
                            matriz1.DarFilCol();
                            matriz2.DarFilCol();
                            System.out.println(matriz1.mostrarDimen());
                            System.out.println(matriz2.mostrarDimen());
                            if (matriz1.mostrarCol() == matriz2.mostrarCol() & matriz1.mostrarFila() == matriz2.mostrarFila()) {
                                matriz1.ingresarValores();
                                matriz2.ingresarValores();
                                matriz1.imprimirMatriz();
                                matriz2.imprimirMatriz();
                                RestaMat(matriz1.arr, matriz2.arr);
                            } else {
                                System.out.println(
                                        "No se puden sumar porque tienen cantidad de columnas y filas distintas.");
                                terminar = 1;
                            }
                            break;
                        case 3:
                            matriz1.DarFilCol();
                            matriz2.DarFilCol();
                            System.out.println(matriz1.mostrarDimen());
                            System.out.println(matriz2.mostrarDimen());
                            if (matriz1.mostrarFila() == matriz2.mostrarCol()) {
                                matriz1.ingresarValores();
                                matriz2.ingresarValores();
                                matriz1.imprimirMatriz();
                                matriz2.imprimirMatriz();
                                MultMat(matriz1.arr, matriz2.arr);
                            } else {
                                System.out.println(
                                        "La cantidad de filas de la 1ra no es igual a la cantidad de columnas de la 2da.");
                                terminar = 1;
                            }
                            break;
                        case 4:
                            terminar = 1;
                            break;
                        default:
                            System.out.println("Esa opción no esta contemplada...");
                            break;
                    }
                } while (terminar == 0);
            } else if (opcion == 3) { // Con esta opción haremos que salga de esta pantalla de opciones.
                System.out.println("Gracias...");
                band = 1;
            } else {
                System.out.println("Esa opción no esta contempla vuelva a intentarlo.");
            }
        } while (band == 0);
    }
}
