package paquete_prueba;

import java.util.Scanner;

public class Votaciones_try{
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int su1 = 0, su2 = 0, su3 = 0, su4 = 0, MAYOR;
        double st;
        int ca1 = 0, cant = 0;
        final int a = 100;
        String r, candidato;             
            
        System.out.println("------------------------" +
                       "\n\033[36mCANDIDATOS A LA ALCALDIA DE HUANCAYO:" +
                       "\n==============================================" +
                       "\n\033[34m      CANDIDATOS. " + "       " + "\033[34m SIMBOLOS" +
                       "\n\033[34m   1. RATAPAYCO......" + "  |  " + "\033[34m  LAPIZ.." +
                       "\n\033[34m   2. COMEPOLLOS....." + "  |  " + "\033[34m  PLATA.." +
                       "\n\033[34m   3. ROBACABLES....." + "  |  " + "\033[34m  RATA..." +
                       "\n\033[34m   4. CHAMORRO......." + "  |  " + "\033[34m  MATESITO.." +
                       "\n------------------------" +
                       "\n==============================================" +
                       "\n¡VOTACIONES ABIERTAS");
        //ciclo do-while
        do {
            cant++;
            System.out.println("\033[34mVOTO N°" + cant + ":" +
                           "\n\033[34mINGRESE OPCION A VOTAR: ");
        
                    try {
                ca1 = sc.nextInt();

            } catch (Exception e) {
                System.out.print("\033[31mingrese numeros---------no letras "
                        + "\nSe procede al cierre del programa");
                System.exit(0);
            }
            while (ca1 < 1 || ca1 > 4) 
            {
                System.out.println("\033[31m(x)Error NO SE ENCONTRO CANDIDATO" +
                               "\nReinigrese" +
                               "\n\033[34mVOTO N°" + cant + ":" +
                               "\n\033[34mINGRESE OPCION A VOTAR: ");

                try {
                    ca1 = sc.nextInt();

                } catch (Exception e) {
                    System.out.print("\033[31mingrese numeros---------no letras"
                            + "\nSe procede al cierre del programa ");
                    System.exit(0);
                }
            }
            if (ca1 == 1) {
                su1++;
            }
            if (ca1 == 2) {
                su2++;
            }
            if (ca1 == 3) {
                su3++;
            }
            if (ca1 == 4) {
                su4++;
            }
            System.out.println("\n==============================================" +
                           "\n\033[34mNUEVA VOTACION¿DESEA VOTAR?(SI/NO): ");
            r = sc.next();
            if (r.equalsIgnoreCase("SI")) {
                r = "SI";
            } else {
                while (!r.equalsIgnoreCase("NO") & !r.equalsIgnoreCase("SI")) {
                    System.out.println("\033[31m(x)mERROR..reingrese" +
                                   "\033[34mNUEVA VOTACION¿DESEA VOTAR?(SI/NO): ");
                    r = sc.next();
                }
            }
        } while (r.equalsIgnoreCase("SI"));
        
        System.out.print("\n\033[31mCOMUNICADO..¡RECUERDA QUE SI NO VOTA SERA MULTADO CON 50 SOLES--GRACIAS ");
        st = su1 + su2 + su3 + su4;
        System.out.printf("\n%-30s %-30s %-30s", "CANDIDATOS", "\t\t\t            NUMEROS A FAVOR", "\t\t                   PORCENTAJE TOTAL" +
                      "\n\033[34m1. RATAPAYCO.." + "\t\t\t\t" + su1 + "\t\t\t" + (su1 * 100) / st + "%" +
                      "\n\033[34m2. COMEPOLLOS." + "\t\t\t\t" + su2 + "\t\t\t" + (su2 * 100) / st + "%" +
                      "\n\033[34m3. ROBACABLES." + "\t\t\t\t" + su3 + "\t\t\t" + (su3 * 100) / st + "%" +
                      "\n\033[34m4. CHAMORRO..." + "\t\t\t\t" + su4 + "\t\t\t" + (su4 * 100) / st + "%");

        MAYOR = su1;
        candidato = "RATAPAYCO";
        
        if (su2 > su1) {
            MAYOR = su2;
            
            candidato = "COMEPOLLO";
        }
        if (su3 > su2) {
            MAYOR = su3;
            
            candidato = "ROBACABLES";
        }
        if (su4 > su3) {
            MAYOR = su4;
        
            candidato = "CHAMORRO";
        }
        if (su1 > su4){
            MAYOR = su1;
          
            candidato = "RATAPAYCO";
            
        }
        if((MAYOR == su1 && MAYOR == su2)){
            
            System.out.println("\n\n\033[34mHUBO UN EMPATE HABRÁ SEGUNDA VUELTA");
            
        }else if((MAYOR == su1 && MAYOR == su3) ){
            
            System.out.println("\n\n\033[34mHUBO UN EMPATE HABRÁ SEGUNDA VUELTA");
            
        }else if((MAYOR == su1 && MAYOR == su4) ){
            
            System.out.println("\n\n\033[34mHUBO UN EMPATE HABRÁ SEGUNDA VUELTA");
            
        }else if((MAYOR == su2 && MAYOR == su3) ){
            
            System.out.println("\n\n\033[34mHUBO UN EMPATE HABRÁ SEGUNDA VUELTA");
            
        }else if((MAYOR == su2 && MAYOR == su4) ){
            
            System.out.println("\n\n\033[34mHUBO UN EMPATE HABRÁ SEGUNDA VUELTA");
            
        }else if((MAYOR == su3 && MAYOR == su4) ){
            
            System.out.println("\n\n\033[34mHUBO UN EMPATE HABRÁ SEGUNDA VUELTA");
            
        }else{
        
         System.out.println("\n\n\033[34mY EL GANADOR ES................... " + candidato + " con " + MAYOR + " votos");
         
        }
        
    }
        
}