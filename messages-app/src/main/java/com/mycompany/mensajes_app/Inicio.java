package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.util.Scanner;

/**
 *
 * @author Natsume
 */
public class Inicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        do {            
            System.out.println("--------------------------------"
                    + "\n Aplicacion de mensajes"
                    + "\n1. Crear Mensaje"
                    + "\n2. Listar Mensaje"
                    + "\n3. ELiminar Mensaje"
                    + "\n4. Editar Mensaje"
                    + "\n5. Salir");
            opcion = sc.nextInt();
            switch(opcion) {
                case 1:
                    MensajesService.crearMensaje();
                    break;
                case 2:
                    MensajesService.listarMensaje();
                    break;
                case 3:
                    MensajesService.borrarMensaje();
                    break;
                case 4:
                    MensajesService.editarMensaje();
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Esa opción no esta contemplada");
                    break;
            }
        } while (opcion != 5);
    }
}