package while_01;

import java.util.Scanner;

public class while01 {
 public static void main(String[] args) {
 int num,cuadrado;
 // num guardará el número que leamos
 // y cuadrado guardará el cuadrado de num
  Scanner Entrada = new Scanner(System.in);
  System.out.print("Introduzca número: ");
  num= Entrada.nextInt();
  while(num>=0){ // repetimos el proceso mientras el número leído no sea negativo
  cuadrado=num*num;
  System.out.println(num+ "² es igual a "+ cuadrado);
  System.out.print("Introduzca otro número: ");
  num=Entrada.nextInt(); // volvemos a leer num
  }
 }
}