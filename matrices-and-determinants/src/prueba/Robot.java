package prueba;

import java.util.*;
import java.util.Scanner;

public class Robot{
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        int x,y;
        System.out.println("Cuantas filas desea");
        x=teclado.nextInt();
        System.out.println("Cuantas columnas  desea");
        y=teclado.nextInt();
        if(x==y){
        int[][] matriz= new int [x][y];
        int c=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
             System.out.println("Inserte la posición["+i+"] ["+j+"]");  
             matriz[i][j]=teclado.nextInt();  
            }}
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(i==j){
                if(matriz[i][j]==matriz[0][0]){
                     c=c+1; }}
            System.out.print("["+matriz [i] [j]+"]");}
            System.out.println();}

 

            System.out.println(c);
        if (c==x){
        System.out.println("ES ESCALAR");  }
        else if(c!=x){
        System.out.println("NO ES ESCALAR");}
        } 
}
}