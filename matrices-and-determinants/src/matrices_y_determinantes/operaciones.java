import java.util.Scanner;
    class Piero{
    public static void main(String[] args) {
        try{
        int num_n, S = 0, opción=1;
        int MatrizA[][];
        int MatrizB[][];
        int MatrizC[][];
        Scanner entrada = new Scanner(System.in);
        System.out.println("\033[35mOpciones:\tOperación"
                     + "\n\033[35m1.\t¿Quiere calcular una matriz por un escalar?"
                     + "\n\033[35m2.\t¿Quiere operar con 2  matrices?"
                     + "\n\033[35m3.\t¿Quiere obtener la traza?"
                     + "\n\033[35m4.\t¿Quiere obtener la determinante?");
        num_n = entrada.nextInt();
        if(num_n == 2){
        System.out.println("\n\033[32mAhora eliga que proceso quiere hacer:"
                    + "\n\t\033[32mOpción\tOperación"
                    + "\n\t\033[32m1.\tSuma"
                    + "\n\t\033[32m2.\tResta"
                    + "\n\t\033[32m3.\tMultiplicación");
            opción = entrada.nextInt();
        if(opción==1||opción==2||opción==3){            
            System.out.print("\033[31mIngrese la cantidad de filas de su primera matriz: ");
            int i1 = entrada.nextInt();
            System.out.print("\033[31mIngrese la cantidad de columnas de la primera matriz: ");
            int j1 = entrada.nextInt();
            System.out.print("\033[31mIngrese la cantidad de filas de su segunda matriz: ");
            int i2 = entrada.nextInt();
            System.out.print("\033[31mIngrese la cantidad de columnas de la segunda matriz: ");
            int j2 = entrada.nextInt();
            if(((opción == 2 || opción == 1) && i1 == i2 && j1 == j2)|| (opción == 3 && j1 == i2)){
            MatrizA = new int[i1][j1];
            for(int x = 0; x < MatrizA.length; x++){
                for(int y = 0; y < MatrizA[x].length; y++){
                    System.out.print("\033[35mIngrese el valor de la posición[" +(x+1)+"][" + (y+1) + "]: ");
                    MatrizA[x][y] = entrada.nextInt();}}
            MatrizB = new int[i2][j2];
            for(int x = 0; x < MatrizB.length; x++){
                for(int y = 0; y < MatrizB[x].length; y++){
                    System.out.print("\033[35mIngrese el valor de la posición[" +(x+1)+"][" + (y+1) + "]: ");
                    MatrizB[x][y] = entrada.nextInt();}}
                System.out.println("");
            for(int x = 0; x < i1; x++){
                for(int y = 0; y < j1; y++){
                    System.out.print("[" + MatrizA[x][y] + "]"); }
                System.out.println("");}
                System.out.println("");
            for(int x = 0; x < i2; x++){
                for(int y = 0; y < j2; y++){
                    System.out.print("[" + MatrizB[x][y] + "]");}
                System.out.println("");}
            if(opción == 1){
                System.out.println("\033[34mEl resultado de su suma es: ");
                for(int x = 0; x < i1; x++){
                    for(int y = 0; y < j1; y++){
                        S = MatrizA[x][y] + MatrizB[x][y];
                        System.out.print("[" + S + "]");  }
                    System.out.println("");}  
            }else if(opción == 2){
                System.out.println("\033[34mEl resultado de su resta es: ");
                for(int x = 0; x < i1; x++){
                    for(int y = 0; y < j1; y++){
                        S = MatrizA[x][y] - MatrizB[x][y];
                        System.out.print("[" + S + "]");}
                    System.out.println("");} 
            }
            else if(opción == 3){              
                System.out.println("\033[34mEl resultado de su multiplicación es:");
                for(int x = 0; x < i1; x++){
                    for(int y = 0; y < j2; y++){
                        for(int z = 0; z < j1; z++){ 
                            S = S + MatrizA[x][z] * MatrizB[z][y]; }
                        System.out.print("[" + S + "]");
                        S = 0;}
                    System.out.println(""); }
            }
            }else{
                System.out.println("\033[31mError con las condiciones para hallar la suma, resta o multiplicación de matrices");    
            }
            
        }else
                System.out.println("\033[31mInserte solo las opciones dadas");
        }else if(num_n == 1){
            
            System.out.println("\033[31mIngrese la cantidad de filas de su matriz: ");
            int i1 = entrada.nextInt();
            System.out.println("\033[31mIngrese la cantidad de columnas de su matriz: ");
            int j1 = entrada.nextInt();
            if(i1 > 0 && j1 > 0){
            
            System.out.println("\033[31mIngrese el escalar que va multiplicar a su matriz: ");
            int escalar = entrada.nextInt();
            
            MatrizC = new int[i1][j1];
            
            for(int x = 0; x < MatrizC.length; x++){
                for(int y = 0; y < MatrizC[x].length; y++){
                    
                    System.out.print("\033[32mIngrese el valor de la posición[" +(x+1)+"][" + (y+1) + "]: ");
                    MatrizC[x][y] = entrada.nextInt();
                    
                }
            }
            System.out.println("\033[34mEl resultado es: ");
            
            for(int x = 0; x < i1; x++){
                for(int y = 0; y < j1; y++){
                    
                    S = MatrizC[x][y] * escalar;
                    System.out.print("[" + S + "]");
                    S=0;
                }
                System.out.println("");
            }
            }else{
                
                System.out.println("\033[31mError la cantidad de fila y columnas de su matriz deben ser positivas");
                
            } 
        }else if(num_n==3){
            System.out.println("\033[31mDame el numero de filas de la matriz:");
            int  nfil=entrada.nextInt();
            System.out.println("\033[31mDame el numero de columnas de la matriz:");
            int s=0, ncol=entrada.nextInt();
            int matriz[][]=new int[nfil][ncol];
            if(nfil==ncol){
            for(int i=0;i<nfil;i++){
            for(int j=0;j<ncol;j++){
                System.out.println("\033[35mInserte la posicion i"+(i+1)+" j"+(j+1));
                matriz[i][j]=entrada.nextInt();}
                }
            for(int i=0;i<nfil;i++){
                int j=i;
                s=s+matriz[i][j];
                }
            System.out.println("\033[34mLa traza de la funcion es: "+s);
        }
            else
            System.out.println("\033[31mSolo se saca la traza de matrices cuadradas");  
        } else if(num_n==4){
            System.out.println("\033[31mIngresa el numero de columnas:");
            int x, a, b, c, d, ncol=entrada.nextInt();
            System.out.println("\033[31mIngresa el numero de filas:");
            int nfil=entrada.nextInt();
            if(nfil>0&ncol>0){
                int matriz[][]=new int [nfil][ncol];
                if(nfil==ncol){
                    if(nfil==1){
                    for(int i=0;i<nfil;i++){
                    for(int j=0;j<ncol;j++){
                    System.out.println("\033[35mInserte la posicion ["+(i+1)+"]["+(j+1)+"]");
                    matriz[i][j]=entrada.nextInt();}}
                    System.out.println("\033[34mEl determinante de la matriz es:"+matriz[0][0]);}
                    if(nfil==2){
                    for(int i=0;i<nfil;i++){
                    for(int j=0;j<ncol;j++){
                    System.out.println("\033[35mInserte la posicion i"+(i+1)+" j"+(j+1));
                     matriz[i][j]=entrada.nextInt();}}
                    x=(matriz[0][0]*matriz[1][1])-(matriz[0][1]*matriz[1][0]);
                    System.out.println("\033[34mEl determinante de la matriz es: "+x);
                    }
                    if(nfil==3){
                    for(int i=0;i<nfil;i++){
                    for(int j=0;j<ncol;j++){
                    System.out.println("\033[31mInserte la posicion i"+(i+1)+" j"+(j+1));
                    matriz[i][j]=entrada.nextInt();}}
                    x=((matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[1][0]*matriz[2][1]*matriz[0][2])+(matriz[2][0]*matriz[0][1]*matriz[1][2]))-((matriz[0][2]*matriz[1][1]*matriz[2][0])+(matriz[1][2]*matriz[2][1]*matriz[0][0])+(matriz[2][2]*matriz[0][1]*matriz[1][0]));
                    System.out.println("\033[31mEl determinante de la matriz es: "+x);}
                    if(nfil==4){
                    for(int i=0;i<nfil;i++){
                    for(int j=0;j<ncol;j++){
                    System.out.println("\033[35mInserte la posicion i"+(i+1)+" j"+(j+1));
                    matriz[i][j]=entrada.nextInt();}}
                        if(matriz[0][0]>=0){
                        a=matriz[0][3]*(((matriz[1][0]*matriz[2][1]*matriz[3][2])+(matriz[2][0]*matriz[3][1]*matriz[1][2])+(matriz[3][0]*matriz[1][1]*matriz[2][2]))-((matriz[1][2]*matriz[2][1]*matriz[3][0])+(matriz[2][2]*matriz[3][1]*matriz[1][0])+(matriz[3][2]*matriz[1][1]*matriz[2][0])));
                        b=matriz[1][3]*(((matriz[0][0]*matriz[2][1]*matriz[3][2])+(matriz[2][0]*matriz[3][1]*matriz[0][2])+(matriz[3][0]*matriz[0][1]*matriz[2][2]))-((matriz[0][2]*matriz[2][1]*matriz[3][0])+(matriz[2][2]*matriz[3][1]*matriz[0][0])+(matriz[3][2]*matriz[0][1]*matriz[2][0])));
                        c=matriz[2][3]*(((matriz[0][0]*matriz[1][1]*matriz[3][2])+(matriz[1][0]*matriz[3][1]*matriz[0][2])+(matriz[3][0]*matriz[0][1]*matriz[1][2]))-((matriz[0][2]*matriz[1][1]*matriz[3][0])+(matriz[1][2]*matriz[3][1]*matriz[0][0])+(matriz[3][2]*matriz[0][1]*matriz[1][0])));
                        d=matriz[3][3]*(((matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[1][0]*matriz[2][1]*matriz[0][2])+(matriz[2][0]*matriz[0][1]*matriz[1][2]))-((matriz[0][2]*matriz[1][1]*matriz[2][0])+(matriz[1][2]*matriz[2][1]*matriz[0][0])+(matriz[2][2]*matriz[0][1]*matriz[1][0])));
                        x=-a+b-c+d;
                        System.out.println("\033[34mLa determinante de la matriz es: "+x);}
                        if(matriz[0][0]<0){
                        a=matriz[0][3]*(((matriz[1][0]*matriz[2][1]*matriz[3][2])+(matriz[2][0]*matriz[3][1]*matriz[1][2])+(matriz[3][0]*matriz[1][1]*matriz[2][2]))-((matriz[1][2]*matriz[2][1]*matriz[3][0])+(matriz[2][2]*matriz[3][1]*matriz[1][0])+(matriz[3][2]*matriz[1][1]*matriz[2][0])));
                        b=matriz[1][3]*(((matriz[0][0]*matriz[2][1]*matriz[3][2])+(matriz[2][0]*matriz[3][1]*matriz[0][2])+(matriz[3][0]*matriz[0][1]*matriz[2][2]))-((matriz[0][2]*matriz[2][1]*matriz[3][0])+(matriz[2][2]*matriz[3][1]*matriz[0][0])+(matriz[3][2]*matriz[0][1]*matriz[2][0])));
                        c=matriz[2][3]*(((matriz[0][0]*matriz[1][1]*matriz[3][2])+(matriz[1][0]*matriz[3][1]*matriz[0][2])+(matriz[3][0]*matriz[0][1]*matriz[1][2]))-((matriz[0][2]*matriz[1][1]*matriz[3][0])+(matriz[1][2]*matriz[3][1]*matriz[0][0])+(matriz[3][2]*matriz[0][1]*matriz[1][0])));
                        d=matriz[3][3]*(((matriz[0][0]*matriz[1][1]*matriz[2][2])+(matriz[1][0]*matriz[2][1]*matriz[0][2])+(matriz[2][0]*matriz[0][1]*matriz[1][2]))-((matriz[0][2]*matriz[1][1]*matriz[2][0])+(matriz[1][2]*matriz[2][1]*matriz[0][0])+(matriz[2][2]*matriz[0][1]*matriz[1][0])));
                        x=a-b+c-d;
                        System.out.println("\033[34mLa determinante de la matriz es: "+x);}
                        }
                if(nfil>4){
                    System.out.println("\033[32mDisculpe, estamos trabajando en eso");}
            
            }else
                    System.out.println("\033[31mNo se puede hallar determinante de matrices que no sean cuadradas");
            } else
                System.out.println("\033[31mNo se aceptan numeros negativos ni cero");
        }else
            System.out.println("\033[31mSolo ingrese una de las opciones"); 
        }catch(Exception e){
            System.out.println("\033[31mIngrese solo las opciones mostradas");
        }
    }
}