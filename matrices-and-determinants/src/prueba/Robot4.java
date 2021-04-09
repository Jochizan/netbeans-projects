import java.util.Scanner;

public class Robot4{
    
    public static void main(String[]args){
        
        Scanner teclado=new Scanner(System.in);
        int x,y;
       
        System.out.println("Cuantas filas desea");
        x=teclado.nextInt();
        
        System.out.println("Cuantas columnas  desea");
        y=teclado.nextInt();
        
        if(x>=0 & y>=0){
            
        if(x==y){
            
        int[][] matriz= new int [x][y];
        int s=0,S=0,n=0;
        
        for(int i=0;i<x;i++){
            
            for(int j=0;j<y;j++){
                
                System.out.println("inserte la posición["+(i+1)+"] ["+(j+1)+"]");  
                matriz[i][j]=teclado.nextInt();  
                
            }
        }
         System.out.println("Esta es tu matriz"); 
         
        for(int i=0;i<x;i++){
            
            for(int j=0;j<y;j++){
                
                System.out.print("["+matriz [i] [j]+"]");
            }
            System.out.println();
        }
       
       
        //Nula
        for(int i=0;i<x;i++){
            
            for(int j=0;j<y;j++){
                
                n=n+matriz[i][j];  
            }
        }
        //Triangular superior
        for(int i=0;i<x;i++){
            
            for(int j=0;j<y;j++){
                
                if(i>j){
                 s=s+matriz[i][j];
                 
                }
            }
        }
        //Trinagular Inferior
        for(int i=0;i<x;i++){
            
            for(int j=0;j<y;j++){
                
                if(j>i){
                 S=S+matriz[i][j];  
                }
            }
        }
       
        //Matriz Identidad
        int c=0;
        for(int i=0;i<x;i++){
            
            for(int j=0;j<y;j++){
                
                if(i==j){
                if(matriz[i][j]==1){
                     c=c+1; 
                }
                }
            }
        }
        //diagonal
        int d=0;
        for(int i=0;i<x;i++){
            
            for(int j=0;j<y;j++){
                
                if(i!=j){
                    
                    if(matriz[i][j]==0)
                    {d=d+1;}
                    
                }
            }
        }
        //escalar
        int e=0;
        for(int i=0;i<x;i++){
            
            for(int j=0;j<y;j++){
                
                if(i==j){
                if(matriz[i][j]==matriz[0][0]){
                     e=e+1; }}}}
    
        //Identidad
        if(c==x){
            System.out.println("Es una matriz  INDENTIDAD");  
        }else if(c!=x){
            System.out.println("No es una matriz IDENTIDAD");
        }
        //Nula
        if(n==0){
            
            System.out.println("Es una matriz NULA");
            
        }else if(n!=0){
            
                System.out.println("No es una matriz NULA");
         //Triangulas superior      
        if(s==0){
            
                System.out.println("Es TRIANGULAR superior"); 
        }else if(s!=0){
            
                System.out.println("No es TRIANGULAR superior");
                
        }
        //Triangular Inferior
        if(S==0){
               System.out.println("Es TRIANGULAR inferior");
        }else if(S!=0){
               System.out.println("No es TRIANGULAR inferior");
        }
        }
        //DIAGONAL
        if (d==(x*y)-y){
            
            System.out.println("ES DIAGONAL");  
        }
        else if(d!=(x*y)-y){
            System.out.println("NO ES DIAGONAL");
        }
        //escalar
        if (e==x){
            System.out.println("ES ESCALAR");  
        }
        else if(e!=x){
            System.out.println("NO ES ESCALAR");
        }
       
        //Simetrica
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
            if((matriz[i][j])==(matriz[j][i])){
            }else{
            System.out.println("Es ASIMETRICA");
            System.exit(0);}}
        }System.out.println("Es SIMETRICA");
       
       
        }else{
            
        String a;  
        System.out.println("Es una matriz rectangular:" +
                       "\nNo puede ser una matriz identidad " +   
                       "\nNo puede ser una matriz triangular " +
                       "\nPodemos calcular su transpuesta(SI/NO)");
        a=teclado.next();
        
        if(a.equals("Si")){
            
            int[][] matriz= new int [x][y];
        
            for(int i=0;i<x;i++){
                
                for(int j=0;j<y;j++){
                    
                    System.out.println("inserte la posición["+i+"] ["+j+"]");  
                    matriz[i][j]=teclado.nextInt();  
                }
            }
            System.out.println("Esta es tu matriz");
            
            for(int i=0;i<x;i++){
                
                for(int j=0;j<y;j++){
                    
                    System.out.print("["+matriz [i] [j]+"]");
                }
                    System.out.println();
            }
            System.out.println("Su transpuesta es");
            for(int j=0;j<y;j++){
                
                for(int i=0;i<x;i++){
                
                    System.out.print("["+matriz [i] [j]+"]");
                }
                
                System.out.println();
                
            }   
        }
            else if(a.equals("No")){
            System.out.println("Bye");  
            } 
        }
       
        }else{
            
            System.out.println("No hay columna ni fila negativa");
        }
    }
}