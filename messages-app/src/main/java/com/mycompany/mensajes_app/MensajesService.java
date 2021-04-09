package com.mycompany.mensajes_app;

import java.util.Scanner;

/**
 *
 * @author Natsume
 */
public class MensajesService {
    
    public static void crearMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Tu nombre");
        String nombre = sc.nextLine();
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        MensajesDAO.crearMensaje(registro);
    }
    
    public static void listarMensaje() {
        MensajesDAO.leerMensajesDB();
    }
    
    public static void borrarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajesDAO.borrarMensaje(id_mensaje);
    }
    
    public static void editarMensaje() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Indica el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();
        Mensajes actualizacion = new Mensajes();
        actualizacion.setId_mensaje(id_mensaje);
        actualizacion.setMensaje(mensaje);
        MensajesDAO.actualizarMensajeDB(actualizacion) ;
    }
}
