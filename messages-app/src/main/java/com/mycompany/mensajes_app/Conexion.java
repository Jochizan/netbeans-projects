package com.mycompany.mensajes_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Natsume
 */
public class Conexion {
    public Connection get_connection() {
        Connection conection = null;
        try {
            conection = DriverManager.getConnection("jdbc:mysql://localhost:3306/mensajes_app?serverTimezone=UTC", "root", "");
//            if(conection != null) {
//                System.out.println("Conexion exitosa");
//            }
        }catch (SQLException e) {
            System.out.println(e);
        }
        return conection;
    }
}
