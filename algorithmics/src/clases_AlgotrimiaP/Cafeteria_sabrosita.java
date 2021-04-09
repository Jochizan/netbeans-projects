package clases_AlgotrimiaP;

import java.util.Scanner;

public class Cafeteria_sabrosita{
public static void main(String Args[]){
    boolean s = true;
    while (s == true) {

      Scanner scn = new Scanner(System.in);
      System.out.println("\nCafeterìa “La Sabrosita”\n" + 
      "\nLista de alimentos con su respectivo codigo\n" +
      "\n" +
      "       1.	Alimentos\n" +
      "\n            Codigo Nombre         Precio\n" +
      "                A1.  Tortas …………….S/20.00\n" +
      "                A2.  Panes …………………S/9.00\n" +
      "                A3.  Pasteles …………S/9.00\n" +
      "                A4.  Bocaditos ………S/20.00\n" +
      "\n" +
      "      2.	Bebidas\n" +
      "\n            Codigo  Nombre         Precio\n" +
      "                B1.  Coca Cola ……………S/5.00\n" +
      "                B2.  Inca Cola ……………S/5.00\n" +
      "                B3.  Agua con gas ……S/4.00\n" +
      "                B4.  Agua sin gas ……S/4.00");
      

      System.out.println("\nConsumo de la sección de alimentos"+ 
      "\nIndicarlo con el codigo. \nEjemplo: Si consumió Panes coloque A2");
      char codalim = scn.next().charAt(1);
      System.out.println("Ingrese la cantidad que consumió");
      int alimcant = scn.nextInt();

      System.out.println("\nConsumo de la sección de bebidas"+ 
      "\nIndicarlo con el codigo. \nEjemplo: Si consumió Agua con gas coloque B3");
      char codbebid = scn.next().charAt(1);
      System.out.println("Ingrese la cantidad que consumió");
      int bebidcant = scn.nextInt();
      
      //-----------Proceso-------------//
      int alimConsu = 0; 
      if (codalim == '1' | codalim == '4')
        alimConsu = alimcant * 20;
      if (codalim == '2' | codalim == '3')
        alimConsu = alimcant * 19;

      
      int bebidConsu = 0;
      if (codbebid == '1' | codbebid == '2')
        bebidConsu = bebidcant * 5;

      if (codbebid == '3' | codbebid == '4')
        bebidConsu = bebidcant * 4;
      
      int totalConsu = alimConsu + bebidConsu;
      //----------Fin Proceso------------//

      //-------------Salida--------------//
      System.out.println("\nConsumo del cliente:\nCantidad de alimentos: $" + alimConsu + 
      "\nCantidad de bebidas: $" + bebidConsu + "\nConsumo total del cliente: $" + totalConsu);
      //------------Fin Salida-----------//

      //------------Consulta-------------//
      boolean quest = true;
      while (quest == true) {
        System.out.println("\n¿Desea probar con otro numero? "
                + "\n SI: 1; NO: 2");
        int z = scn.nextInt();
        if (z == 1)
        quest = false; 
        else if (z == 2) {
        s = false;
        quest = false;
        } else
          System.out.println("Respuesta no admitida");
      }
      //--------Fin Consulta------------//
    }
  }
}
