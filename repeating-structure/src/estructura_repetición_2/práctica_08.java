package estructura_repetición_2;

import java.util.Scanner;

public class práctica_08{
    
    public static void main(String[] args) {
        
        String rango_inf, rango_sup, num_e, num_n;
        int num_cap=0, rango_in=0, rango_su=0, cant_num1;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el rango inferior\n"
                + "Nota: de preferencia números mayores a 10");
        try{
        rango_inf = entrada.nextLine();
        
        System.out.println("Ingrese el rango superiot");
        rango_sup = entrada.nextLine();
       
        rango_in = Integer.parseInt(rango_inf)+1;
        rango_su = Integer.parseInt(rango_sup);
        
        }catch(java.lang.NumberFormatException e){
            
            System.out.println("Error ingrese un número no una cadena texto");
            
        }catch(Exception e){
            
            System.out.println("Ocurrió un error");
            
        }
        if(rango_in > 10){
            
           for(rango_in = rango_in; rango_in < rango_su; rango_in++){
               //System.out.println(cant_num1);
               num_e = "";
               num_n = "";
               num_e = Integer.toString(rango_in);
               cant_num1 = num_e.length();
               
           for (cant_num1 = cant_num1; cant_num1 > 0; cant_num1--) {
                  //System.out.println(i);
                  num_n += num_e.substring(cant_num1-1, cant_num1);
                  //System.out.println(num_n + ",  " + num_e);
                  
                  if(Integer.parseInt(num_n) == Integer.parseInt(num_e)){
                      
                      num_cap++;
                      
                  }                  
              }
          }
       }else{
            
            System.out.println("Error el programa no trabajo con esos números");
            
        }    
        
        System.out.println("Hay una cantidad de capicuas de: " + num_cap);
        
   }
}