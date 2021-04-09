package parte;

public class OperationsEx extends MainClass {

    private double escalar;
    private int options;
    private int bandera1 = 0;
    private int bandera2 = 0;
    private int bandera3 = 0;

    public void SecondPartExecution() {
        do {
            System.out.print("\nDiganos que operaciones quiere realizar"
                    + "\nOpciones: "
                    + "\n1).\tCon una matriz"
                    + "\n2).\tCon dos matrices"
                    + "\n3).\tSalir"
                    + "\nSu opción: ");
            options = entry.nextInt();
            if (options == 1) { // Con esta opción el programa realizara las operaciones con una matriz.
                Array array1 = new Array("Matriz 1");
                array1.enterRowColumns();
                array1.setDataArray();
                array1.getDetails();
                array1.getArray();
                do {
                    System.out.print("\nQue operación quiere realizar con la matriz"
                            + "\n1).\tDeterminante"
                            + "\n2).\tTraza"
                            + "\n3).\tTranspuesta"
                            + "\n4).\txEscalar"
                            + "\n5).\tSalir"
                            + "\nSu opción: ");
                    try {
                        options = entry.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error solo ingrese un digito");
                        System.exit(0);
                    }
                    switch (options) {
                        case 1:
                            System.out.println("La determinante de su matriz es: " + determinanteMatriz(array1.array, array1.returnRows()));
                            break;
                        case 2:
                            Traza(array1.array);
                            break;
                        case 3:
                            Transpuesta(array1.array);
                            break;
                        case 4:
                            System.out.print("Ingrese el escalar a multiplicar: ");
                            this.escalar = entry.nextDouble();
                            Escalar(array1.array, escalar);
                        case 5:
                            bandera2 = 1;
                            break;
                        default:
                            System.out.println("Esa opción no esta contemplada...");
                            break;
                    }
                } while (bandera2 == 0);
            } else if (options == 2) { // Con esta opción haremos las operaciones entre dos matrices.
                Array array1 = new Array("Matriz 1");
                Array array2 = new Array("Matriz 2");
                do {
                    System.out.print("\nDiganos que operaciones quiere realizar entre estas matrices"
                            + "\n1).\tSuma"
                            + "\n2).\tResta"
                            + "\n3).\tMultiplicación"
                            + "\n4).\tSalir"
                            + "\nSu opción: ");
                    try {
                        options = entry.nextInt();
                    } catch (Exception e) {
                        System.out.println("Error solo ingrese un digito");
                        System.exit(0);
                    }
                    switch (options) {
                        case 1:
                            array1.enterRowColumns();
                            array2.enterRowColumns();
                            array1.getDetails();
                            array2.getDetails();
                            if (array1.returnColumns() == array2.returnColumns() & array1.returnColumns() == array2.returnColumns()) {
                                array1.setDataArray();
                                array2.setDataArray();
                                array1.getArray();
                                array2.getArray();
                                SumaMat(array1.array, array2.array);
                            } else {
                                System.out.println("No se puden sumar porque tienen cantidad de columnas y filas distintas.");
                                bandera3 = 0;
                            }
                            break;
                        case 2:
                            array1.enterRowColumns();
                            array2.enterRowColumns();
                            array1.getDetails();
                            array2.getDetails();
                            if (array1.returnColumns() == array2.returnColumns() & array1.returnColumns() == array2.returnColumns()) {
                                array1.setDataArray();
                                array2.setDataArray();
                                array1.getArray();
                                array2.getArray();
                                SumaMat(array1.array, array2.array);
                                RestaMat(array1.array, array2.array);
                            } else {
                                System.out.println("No se puden sumar porque tienen cantidad de columnas y filas distintas.");
                                bandera3 = 0;
                            }
                            break;
                        case 3:
                            array1.enterRowColumns();
                            array2.enterRowColumns();
                            array1.getDetails();
                            array2.getDetails();
                            if (array1.returnRows() == array2.returnColumns()) {
                                array1.setDataArray();
                                array2.setDataArray();
                                array1.getArray();
                                array2.getArray();
                                MultMat(array1.array, array2.array);
                            } else {
                                System.out.println("La cantidad de filas de la 1ra no es igual a la cantidad de columnas de la 2da.");
                                bandera3 = 0;
                            }
                            break;
                        case 4:
                            bandera3 = 1;
                            break;
                        default:
                            System.out.println("Esa opción no esta contemplada...");
                            break;
                    }
                } while (bandera3 == 0);
            } else if (options == 3) { // Con esta opción haremos que salga de esta pantalla de optionses.
                System.out.println("Hasta luego");
                bandera1 = 1;
            } else {
                System.out.println("Esa opción no esta contempla vuelva a intentarlo.");// opción no contemplada.
            }
        } while (bandera1 == 0);
    }
}
