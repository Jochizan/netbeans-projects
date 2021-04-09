package estructuradedatos;

import javax.swing.JOptionPane;

/**
 *
 * @author Joan y Rem3
 */
public class ClasePrincipal {

    public static void main(String[] args) {

        int opcion = 0, nodo = 0;
        Pila pila = new Pila();

        do {
            try {

                opcion = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "Menú de Opciones\n\n"
                        + "1. Insertar un nodo\n"
                        + "2. Eliminar un nodo\n"
                        + "3. ¿La Pila esta vacia?\n"
                        + "4. ¿Cual es el último valor ingresado en la Pila?\n"
                        + "5. ¿Cuantos nodos tiene la pila?\n"
                        + "6. Vaciar Pila\n"
                        + "7. Mostrar contenido de la Pila\n"
                        + "8. Salir.\n\n"));

                switch (opcion) {
                    case 1:
                        nodo = Integer.parseInt(JOptionPane.showInputDialog(null,
                                "Porfavor ingresa el valor a guardar en el nodo"));
                        pila.InsertarNodo(nodo);
                        break;

                    case 2:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "Se ha eliminado un nodo con el valor: "
                                    + pila.EliminarNodo());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia.");
                        }
                        break;

                    case 3:
                        if (pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila NO vacia");
                        }
                        break;

                    case 4:
                        if (!pila.PilaVacia()) {
                            JOptionPane.showMessageDialog(null, "El último valor ingresado en la pila es: "
                                    + pila.MostrarUltimoValorIngresado());
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;

                    case 5:
                        JOptionPane.showMessageDialog(null, "La pila contiene " + pila.TamañoPila() + " nodos.");
                        break;

                    case 6:
                        if (!pila.PilaVacia()) {
                            pila.VaciarPila();
                            JOptionPane.showMessageDialog(null, "Se ha vaciado la pila correctamente");
                        } else {
                            JOptionPane.showMessageDialog(null, "La pila esta vacia");
                        }
                        break;

                    case 7:
                        pila.MostrarValores();
                        break;

                    case 8:
                        opcion = 8;
                        break;

                    default:
                        JOptionPane.showMessageDialog(null, "Opción incorrecta, vuelve intentar nuevamente.");
                        break;
                }

            } catch (NumberFormatException e) {

            }
        } while (opcion != 8);
    }
}
