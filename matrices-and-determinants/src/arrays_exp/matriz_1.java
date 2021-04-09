package arrays_exp;
    
import java.util.Scanner;

public class matriz_1 {  

  public static void main(String[] args) {
      
        Scanner read=new Scanner(System.in);
        String intento;
        System.out.println("\033[31m            PROPIEDADES DE MATRICES");
        System.out.println("\033[35m***<>***");
        do{
        System.out.println("\033[34mIngrese el número de filas de la matriz: ");
        int nfilas=read.nextInt();
        System.out.println("\033[34mIngrese el número de columnas de la matriz:");
        int ncolumnas=read.nextInt();
        if(nfilas>0&&ncolumnas>0) {
        double matriz[][] =new double [nfilas][ncolumnas];
        //ALMACENAR VALORES EN LA MATRIZ
        for(int i=0; i<nfilas; i++) {
            for(int j=0; j<ncolumnas; j++) {
                System.out.println("\033[36mIngrese el valor de la fila ["+(i+1)+"] columna ["+(j+1)+"] :");
                matriz[i][j]=read.nextDouble();
            }
        }
        System.out.println("La MATRIZ de "+nfilas+" x "+ncolumnas+" es : ");
           
        //IMPRIMIR MATRIZ
        for(int i=0; i<nfilas; i++) {
            for(int j=0; j<ncolumnas; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println(" ");
        }
        //MATRIZ DE 1x1
        if(nfilas==1 && ncolumnas==1){
           if( matriz[0][0]==1){
               System.out.println("ES UNA MATRIZ: IDENTIDAD,ESCALAR Y CUADRADA");
           }else{
               if( matriz[0][0]==0){
               System.out.println("ES UNA MATRIZ: NULA Y CUADRADA");
                 }else{
                      if( matriz[0][0]!=0&&matriz[0][0]!=1){
                      System.out.println("ES UNA MATRIZ: ESCALAR Y CUADRADA");
                    }}
                 }
        }else{
        if(nfilas==ncolumnas) {
            System.out.println("\033[32m¡¡¡¡¡¡LA MATRIZ ES CUADRADA!!!!!");
             //MATRIZ IDENTIDAD
            double matrizI[][] = new double[nfilas][ncolumnas];
            int cidentidad=0;
             for (int i = 0; i < nfilas; i++) {
                for (int j = 0; j < ncolumnas; j++) {
                    if (i==j){
                        matrizI[i][j]=1;
                    }else{
                     matrizI[i][j]=0;}
            }}
             //DETERMINAR SI LA MATRIZ ES IDENTIDAD
             int cidentidad2=0;
             for (int i = 0; i < nfilas; i++) {
                for (int j = 0; j < ncolumnas; j++) {
                        if (i==j){
                            if(matriz[i][j] == 1){
                               cidentidad++;
                            }
                        }
                         if (i!=j){
                            if(matriz[i][j] == 0){
                               cidentidad2++;
                            }
                        }
                }}
             if (cidentidad2==nfilas*(ncolumnas-1)&&cidentidad==nfilas){
                 System.out.println("->\033[31mES UNA MATRIZ IDENTIDAD");
             }else{System.out.println("->\033[31mNO ES UNA MATRIZ IDENTIDAD");}  
        //triangular superior
           int csuperior=0;
           for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                if (i > j) {
                    if (matriz[i][j] == 0) {
                        csuperior++;
                       }
                   }
                }}
            if (csuperior == (nfilas * (ncolumnas - 1)) / 2) {
                System.out.println("->\033[31mES UNA MATRIZ TRIANGULAR SUPERIOR");
            } else {
            System.out.println("->\033[31mNO ES UNA MATRIZTIANGULAR SUPERIOR");
            }
           //triangular inferior
           int cinferior=0;
           for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                if (i < j) {
                    if (matriz[i][j] == 0) {
                        cinferior++;
                       }
                   }
                }}
            if (cinferior == (nfilas * (ncolumnas - 1)) / 2) {
               System.out.println("->\033[31mES UNA MATRIZ TRIANGULAR INFERIOR");
            }else {
              System.out.println("->\033[31mNO ES UNA MATRIZ TRIANGULAR INFERIOR");
               }
        //matriz escalar
             int cescalar=0,cescalar2=0;
                for (int i = 0; i < nfilas; i++) {
                    for (int j = 0; j < ncolumnas; j++) {
                       if(i==j){
                           if(matriz[0][0]!=0&&matriz[i][j]==matriz[0][0]){
                               cescalar++;
                                }
                        }
                       if(i!=j){
                            if(matriz[i][j]==0){
                               cescalar2++;
                                }
                        }
                 }}
         if (cescalar==nfilas && cescalar2==nfilas*(ncolumnas-1)) {
            System.out.println("->\033[31mES UNA MATRIZ ESCALAR");
        } else {
            System.out.println("->\033[31mNO ES UNA MATRIZ ESCALAR");
        }
        //matriz simétrica
             int csimetrico=0;
                 for (int i = 0; i < nfilas; i++) {
                     for (int j = 0; j < ncolumnas; j++) {
                          if (matriz[i][j] == matriz[j][i]) {
                               csimetrico++;
                             }
                 }}
        if (csimetrico == nfilas * ncolumnas) {
            System.out.println("->\033[31mES UNA MATRIZ SIMÉTRICA");
        } else {
            System.out.println("->\033[31mNO ES UNA MATRIZ SIMÉTRICA");
        }
//matriz antisimetrica
int cantisimetrico=0,cantisimetrico2=0;
for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                if (i == j) {
                    if (matriz[i][j] == 0) {
                        cantisimetrico2 += 1;
                    }
                }
                if(i!=j){
                if (matriz[i][j] + matriz[j][i] == 0) {
                    cantisimetrico += 1;
                }}
            }
        }
        System.out.print("");
        if (cantisimetrico == nfilas * (ncolumnas - 1) & cantisimetrico2 == nfilas) {
            System.out.println("->\033[31mES UNA MATRIZ ANTISIMÉTRICA");
        } else {
            System.out.println("->\033[31mNO ES UNA MATRIZ ANTISIMÉTRICA");
        }
//matriz nula
int cnulo=0;
for (int i = 0; i < nfilas; i++) {
            for (int j = 0; j < ncolumnas; j++) {
                if (i == j) {
                    if (matriz[i][j] == 0) {
                        cnulo += 1;
                    }
                }
                if (i != j) {
                    if (matriz[i][j] == 0) {
                        cnulo += 1;
                    }
                }
            }}
        if (cnulo == nfilas * ncolumnas) {
            System.out.println("->\033[31mES UNA MATRIZ NULA");
        } else {
            System.out.println("->\033[31mNO ES UNA MATRIZ NULA");
        }
        //cuadrado de una matriz
        double matrizR[][] = new double[nfilas][ncolumnas];
             for (int i = 0; i < nfilas; i++) {
                for (int j = 0; j < ncolumnas; j++) {
                    for (int k = 0; k < ncolumnas; k++) {
                        matrizR[i][j] += matriz[k][j] * matriz[i][k];
                        matrizR[i][j]=(Math.round( matrizR[i][j]* 100) / 100d);// redondear el producto a dos decimales
                    }
            }}
      
        //PROPIEDAD DE IDEMPOTENCIA
            int contador = 0;
            for (int i = 0; i < nfilas; i++) {
                for (int j = 0; j < ncolumnas; j++) {
                    if (matrizR[i][j] == matriz[i][j]) {
                        contador += 1;
                    }
                }}
            if (contador == nfilas * ncolumnas) {
                System.out.println("->\033[31mES UNA MATRIZ IDEMPOTENTE");
            } else {
                System.out.println("->\033[31mNO ES UNA MATRIZ IDEMPOTENTE");
            }
        //PROPIEDAD NILPOTENTE
            int contador2 = 0;
            for (int i = 0; i < nfilas; i++) {
                for (int j = 0; j < ncolumnas; j++) {
                    if (matrizR[i][j] == 0) {
                        contador2 += 1;
                    }
                }}
            if (contador2 == nfilas * ncolumnas) {
                System.out.println("->\033[31mES UNA MATRIZ NILPOTENTE DE GRADO 2 ");
            } else {
                System.out.println("->\033[31mNO ES UNA MATRIZ NILPOTENTE DE GRADO 2");
            }
        //Matriz diagonal
            int contadordeceros=0,cdiagonal=0;
            for (int i = 0; i < nfilas; i++) {
                for (int j = 0; j <ncolumnas; j++) {
                    if (i==j&&matriz[i][j]==0){
                        cdiagonal++;
                   }
                   if (i!=j&&matriz[i][j]==0){
                   contadordeceros++;
                   }
                }}
            if (contadordeceros==nfilas*(ncolumnas-1)&&cdiagonal<nfilas){
              System.out.println("->\033[31mES UNA MATRIZ DIAGONAL");
            }else{
              System.out.println("->\033[31mNO ES UNA MATRIZ DIAGONAL");
            }
        //PROPIEDAD INVOLUTIVA
             int involutiva=0;
              for (int i = 0; i < nfilas; i++) {
                for (int j = 0; j < ncolumnas; j++) {
                    if (matrizR[i][j]==matrizI[i][j]){
                    involutiva++;
                    }
            } }
              if (involutiva==nfilas*ncolumnas){
                  System.out.println("->\033[31mES UNA MATRIZ INVOLUTIVA");
              }else{System.out.println("->\033[31mNO ES UNA MATRIZ INVOLUTIVA");
              }
              //Matriz transpuesta
            System.out.println("\033[34m<<<<<<<<<<  MATRIZ TRANSPUESTA >>>>>>>>>>");
            for (int i = 0; i < nfilas; i++) {
                for (int j = 0; j < ncolumnas; j++) {
                    System.out.print(matriz[j][i] + "\t");
                }
                System.out.println("");
            }
                System.out.println("\033[34m'''''''''Potencia de la matriz'''''''''");

          //IMPRIMIR MATRIZ AL CUADRADO
                for (int i = 0; i < nfilas; i++) {
                for (int j = 0; j < ncolumnas; j++) {
                    System.out.print(matrizR[i][j] + "\t");
                }
                System.out.println("");
            }
        }else { 
            System.out.println("\033[32m¡¡¡¡¡¡¡LA MATRIZ ES RECTANGULAR!!!!!!!!");
        //matriz fila
        //matriz columna
        if(nfilas==1) {
                System.out.println("\033[31m->Es una MATRIZ FILA");
            } else {
                if(ncolumnas==1) {
                    System.out.println("\033[31m->Es una MATRIZ COLUMNA");
                }
            }
        //NULA REACTANGULAR
               int cnulor=0;
               for (int i = 0; i < nfilas; i++) {
                    for (int j = 0; j < ncolumnas; j++) {
                       if (i == j) {
                          if (matriz[i][j] == 0) {
                            cnulor += 1;
                             }
                       }
                       if (i != j) {
                           if (matriz[i][j] == 0) {
                               cnulor += 1;
                               }
                             }
            }}
        if (cnulor == nfilas * ncolumnas) {
            System.out.println("->\033[31mES UNA MATRIZ NULA");
        } else {
            System.out.println("->\033[31mNO ES UNA MATRIZ NULA");
        }
           //Matriz transpuesta rectangular
           System.out.println("\033[34m<<<<<<<<<<  MATRIZ TRANSPUESTA RECTANGULAR>>>>>>>>>>");
           
                for (int i = 0; i < ncolumnas; i++) {
                for (int j = 0; j < nfilas; j++) {
                    System.out.print(matriz[j][i] + "\t");
                }
                System.out.println("");
                }
        }}
        }else{
            System.out.println("\033[31m¡ERROR! INGRESE VALORES POSITVOS MAYORES A CERO");}
        
        System.out.println("¿Desea Ingresar una nueva matriz? (ESCIBA SI caso contrario ingrese cualquier letra)");
            intento=read.next();
            intento=intento.toUpperCase();//convertir cadena de texto a mayúscula
        }while(intento.equals("SI"));  
        System.out.println("\033[34m¡¡¡¡¡¡¡¡♣ Gracias ♣!!!!!!!");

    }
}

