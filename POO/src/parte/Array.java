package parte;

public class Array extends MainClass {
    
    /*
     * Aquí están todos los atributos de esta clase para luego crear
     * instancias para nuestro programa.
     */
    private int rows;
    private int columns;
    private final String arrayName;
    public String type;
    public double array[][];

    public Array(String name) { // Método constructor de la clase.
        rows = 2;
        columns = 2;
        arrayName = name;
        type = RecognizeType(rows, columns);
        array = new double[rows][columns];
    }

    public void enterRowColumns() { // Método setter para el ingreso de filas y columnas

        int values = 0;
        String rowsF = "", columnsC = "";
        do {
            System.out.print("Ingrese la cantidad de filas de la " + arrayName + ": ");
            rowsF = entry.nextLine();
            System.out.print("Ingrese la cantidad de columnas de la" + arrayName + ": ");
            columnsC = entry.nextLine();
            if (Verificando(rowsF) == false || Verificando(columnsC) == false) {
                System.out.println("No se puede crear su matriz vuelva intentarlo.");
            } else {
                System.out.println("Se pudo crear su matriz.");
                values = 1;
            }

        } while (values == 0);
        this.rows = Integer.parseInt(rowsF);
        this.columns = Integer.parseInt(columnsC);
        this.array = new double[this.rows][this.columns];
        type = RecognizeType(this.rows, this.columns);
    }

    public void setDataArray() { // Setter para el ingreso de datos de la matriz
        try {
            System.out.println("\n================================================"
                    + "\nIngresa valores de la "
                    + arrayName + " a continuación: "
                    + "\n=================================================");
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    System.out.print("Ingresa el valor de " + arrayName + " de la posición[" + i + "] [" + j + "]: ");
                    array[i][j] = entry.nextDouble();
                }
            }
        } catch (java.util.InputMismatchException e) {
            System.out.println("Error al ingreso de datos intente solo números.");
            System.exit(0);
        } catch (Exception e) {
            System.out.println("Error al ingreso de datos intente solo números.");
            System.exit(0);
        }
    }

    public void getArray() { // Getter para la obtención de la matriz
        System.out.println("\nAquí esta " + arrayName + ":");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                System.out.print("[ " + array[i][j] + " ]");
            }
            System.out.print("\n");
        }
    }

    public void getDetails() {
        System.out.println("Su matriz " + arrayName + " es " + type + " de " + rows + "x" + columns);
    }

    private static String RecognizeType(int rows, int columns) { // Un método para reconocer el tipo de matriz.
        if (rows != columns) {
            return "RECTANGULAR";
        } else {
            return "CUADRADA";
        }
    }

    public int returnRows() { // Getter para recuperar la cantidad de filas
        return rows;
    }

    public int returnColumns() { // Getter para recuperar la cantidad de columnas
        return columns;
    }
}
