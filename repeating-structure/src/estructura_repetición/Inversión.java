package estructura_repetición;

import java.util.Scanner;

public class Inversión {

       public static void main(String[] args) {
        
         String cad_o = "",cad_n = "";
         int num_c;
         Scanner sc = new Scanner(System.in);
        
         System.out.print("\t¿Ingrese el texto que desea invertir?\n\t");
         cad_o = sc.nextLine();
         
         num_c = cad_o.length();
         
         while(num_c != 0){
         
             cad_n += cad_o.substring(num_c-1,num_c);
             num_c--;
                      
         }
         
             System.out.println("\n\tLa palabra invertida es:\n\t"+cad_n+"\n");
             
    }
    
}

//while(cant != 0){
                  //num_N = Integer.toString(num_inv);
                  //num_INV += num_N.substring(cant-1, cant);
                  //cant--;
                  //System.out.println(num_INV);
                //System.out.println(cant);
                //}

























