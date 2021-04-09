import java.util.Scanner;
public class Robot6{
    public static void main(String[]args){
        Scanner teclado=new Scanner(System.in);
        int x = 0,y = 0;
        System.out.println("=======================================================");
            System.out.println("\033[32mHOLA,TE PRESENTAMOS NUESTRO PROGRAMA DE MATRICES"
                    + "\n\033[32mTe ayudara a comprobar propiedades y tipos de matrices");
            System.out.println("=======================================================");
        do{
        try{
        System.out.println("\033[31mCuantas filas desea que tenga tu matriz");
        x=teclado.nextInt();
        System.out.println("\033[31mCuantas columnas desea que tenga tu matriz");
        y=teclado.nextInt();}
        catch(Exception ex){
            System.out.println("\033[35mInserte solo números enteros positivos ");
            System.exit(0);}
        if(x>=0 & y>=0){
        if(x==y){
        int[][] matriz= new int [x][y];
        int s=0,S=0,n=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
             System.out.println("\033[35mInserte la posición["+(i+1)+"] ["+(j+1)+"]");
             
             try{
             matriz[i][j]=teclado.nextInt();   }
             catch(Exception ed){
                 System.out.println("\033[31mLos numeros de la matrices deben ser NUMEROS ENTEROS");
                 System.exit(0);
             }
   
            }}
         System.out.println("\033[34mESTA ES TU MATRIZ"
                 + "\n\033[32mEs una matriz cuadrada");    
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
            System.out.print("["+matriz [i] [j]+"]");} 
            System.out.println();}
        
        
        //Nula
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                 n=n+matriz[i][j];   
                }}
        //Triangular superior
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(i>j){
                 s=s+matriz[i][j];   
                }}}
        //Trinagular Inferior
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(j>i){
                 S=S+matriz[i][j];   
                }}}
        
        //Matriz Identidad
        int c=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(i==j){
                if(matriz[i][j]==1){
                     c=c+1; }}}}
        
        int f=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
              if(i>j && j>i)  {
            f=f+(matriz[i][j]);} } }

 

        //diagonal
        int d=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(i!=j){
                    if(matriz[i][j]==0)
                    {d=d+1;}
                }}}
        //escalar
        int e=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                if(i==j){
                if(matriz[i][j]==matriz[0][0]){
                     e=e+1; }}}}
        //Transpuesta
        System.out.println("\033[32mSu transpuesta es");
        for(int j=0;j<y;j++){
            for(int i=0;i<x;i++){
            System.out.print("["+matriz [i] [j]+"]");} 
            System.out.println();}    
     
            System.out.println("\033[32m=======================================================");
            System.out.println("\033[32mAQUI ESTAN SUS PROPIEDADES:");
            System.out.println("\033[32m=======================================================");
            
        //Identidad
        if (c+f==x){
        System.out.println("\033[34m---ES UNA MATRIZ IDENTIDAD\n");  }
              else {
        System.out.println("\033[34m---NO ES UNA MATRIZ IDENTIDAD\n");}
        //Nula
        if(n==0){
                System.out.println("\033[34m--ES UNA MATRIZ NULA\n");}
             else if(n!=0){
                System.out.println("\033[34m--NO EN UNA MATRIZ NULA\n");
         //Triangulas superior       
        if(s==0){
                System.out.println("\033[34m---ES TRIANGULAR SUPERIOR\n"); }
             else if(s!=0){
                System.out.println("\033[34m---NO ES TRIANGULAR SUPERIOR\n");}
        //Triangular Inferior
        if(S==0){
               System.out.println("\033[34m--ES TRIANGULAR INFERIOR\n");  
              }else if(S!=0){
               System.out.println("\033[34m--NO ES TRIANGULAR INFERIOR\n");}} 
        //DIAGONAL
        if (d==(x*y)-y){
                  System.out.println("\033[34m---ES DIAGONAL\n");  }
        else if(d!=(x*y)-y){
                System.out.println("\033[34m---NO ES DIAGONAL\n");}
        //escalar  
        if (e==x){
            System.out.println("\033[34m--ES ESCALAR\n");  }
        else if(e!=x){
            System.out.println("\033[34m--NO ES ESCALAR\n");}
       
        
       
         //Simetrica
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
            if((matriz[i][j])==(matriz[j][i])){
            }else{
            System.out.println("\033[34m---NO ES SIMETRICA\n");
            System.exit(0);}}
        }System.out.println("\033[34m--SI ES SIMETRICA\n");
        
        
        }else{
        String a;   
        System.out.println("\033[34mEs una matriz rectangular:");
        System.out.println("\033[32mNo puede ser una matriz identidad ");    
        System.out.println("\033[32mNo puede ser una matriz triangular ");
        System.out.println("\n\033[31mQuiere observar su transpuesta?(SI/NO)");
        a=teclado.next();
        switch (a){
            
            case "SI": 
            case "Si":
            case "si":        {
        int[][] matriz= new int [x][y];
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
             System.out.println("\033[35mInserte la posición["+i+"] ["+j+"]");
             
             try{
             matriz[i][j]=teclado.nextInt(); }
             catch(Exception g){
                 System.out.println("\033[31mLos datos de las matrices deben ser NUMEROS ENTEROS");
                 System.exit(0);
                     }}
             
            }
        System.out.println("\033[34mEsta es tu matriz");    
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
            System.out.print("["+matriz [i] [j]+"]");} 
            System.out.println();}
        
        System.out.println("\033[32mSu transpuesta es");
        for(int j=0;j<y;j++){
            for(int i=0;i<x;i++){
            System.out.print("["+matriz [i] [j]+"]");} 
            System.out.println();}    
        break;}
            case "NO":
            case "No":
            case "no":{
            System.out.println("\033[31mBye"); 
            break;}
            default:
                System.out.println("\033[31mNo existe esa respuesta");}
        
        }}
        else{ System.out.println("\033[35mNo hay columna ni fila negativa");}
         }
       while(x<=0 || y <=0 ) ;
     }}