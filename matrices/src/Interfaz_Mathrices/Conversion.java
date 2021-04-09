package Interfaz_Mathrices;

import Interfaz_Mathrices.Interfaz_Mathrices;

/**
 * 
 * @author Joan y Rem3
 */
public class Conversion {
    
    Interfaz_Mathrices mensajero = new Interfaz_Mathrices();
    
    public static int[][] Conversiones(Object arr[][]){
        
        int ar[][] = new int[arr.length][arr[0].length];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                ar[i][j] = Integer.parseInt(arr[i][j].toString());
            }
        }
        return ar;
    }
}
