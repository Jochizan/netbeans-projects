package main;

import operaciones.claseHija_resta;
import operaciones.claseHija_suma;

public class ClasePrincipal {

    public static void main(String[] args) {

        claseHija_suma mensajerosuma = new claseHija_suma();
        mensajerosuma.pedirDatos();
        mensajerosuma.Suma();
        System.out.println("El resultado de la suma es: ");
        mensajerosuma.MostrarResultado();

        claseHija_resta mensajeroresta = new claseHija_resta();
        mensajeroresta.pedirDatos();
        mensajeroresta.Resta();
        System.out.println("El resultado de la resta es: ");
        mensajeroresta.MostrarResultado();
    }
}
