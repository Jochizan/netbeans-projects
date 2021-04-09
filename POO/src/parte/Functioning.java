package parte;

public class Functioning extends MainClass { // Esta clase hereda el scanner de MainClass

    private int opciones;
    private int bandera = 0;
    OperationsEx parte = new OperationsEx();

    public void Execution() {
        do {
            try {
                System.out.print("\n_______________________"
                        + "\nOpciones: "
                        + "\n1).\tPropiedades de la matriz."
                        + "\n2).\tOperaciones con matrices."
                        + "\n3).\tSalir."
                        + "\nSu opción: ");
                opciones = entry.nextInt();
            } catch (java.util.InputMismatchException e) { // Manejo de excepciones
                System.out.println("Error solo ingrese números...");
                System.exit(0);
            } catch (Exception e) {
                System.out.println("Error general.");
            }
            if (opciones == 1) { // Con esta opción mostraremos las propiedades de su matriz.
                Array array1 = new Array("Matriz 1");
                array1.enterRowColumns();
                array1.getDetails();
                array1.setDataArray();
                array1.getArray();
                if (array1.type == "CUADRADA") {
                    System.out.println("\n" + Nula(array1.array)
                            + "\n" + TriangularInf(array1.array)
                            + "\n" + TriangularSup(array1.array)
                            + "\n" + Diagonal(array1.array)
                            + "\n" + Escalar(array1.array)
                            + "\n" + Identidad(array1.array)
                            + "\n" + Simetrico(array1.array));
                } else if (array1.type == "RECTANGULAR") {
                    System.out.println("Su matriz es rectangular, entonces mostraremos su transpuesta");
                    Transpuesta(array1.array);
                }
            } else if (opciones == 2) { // Esta parte se hara en la parte de FuncOperaciones.java
                parte.SecondPartExecution();
            } else if (opciones == 3) { // Aquí es cuando acaba los procedimientos de ejecución
                System.out.println("Gracias esperamos haberle ayudado.");
                bandera = 1;
            } else {
                System.out.println(".\nEsa opción no esta contemplada vuelva a intentarlo.\n.");
            }
        } while (bandera == 0);
    }
}
