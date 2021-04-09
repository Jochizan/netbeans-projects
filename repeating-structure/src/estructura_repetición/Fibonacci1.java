package estructura_repetición;

public class Fibonacci1{
  public static void main(String args[]){

   int i = 0, a = 0, b = 1, c = 0; 
   
   System.out.println("Serie con for: ");
   for(i = 0; i < 10; i++){
   if(i < 9){
    System.out.print(a + ",");
    c = a + b;
    a = b;
    b = c;
   } else{
     System.out.print(a);
   }
  }
  System.out.println("");
  i = 0;
  b = 1;
  a = 0;
  c = 0;
   
 System.out.println("serie con while: ");
 while(i < 10){
  if(i < 9){
    System.out.print(a + ",");
    c = a + b;
    a = b;
    b = c; 
    
   } else {
    System.out.print(a);
    
   }
   i++;
  }
   System.out.println("");
   i = 0;
   b = 1;
   a = 0;
   c = 0;
  System.out.println("Serie con do-while:");
  do{
   if(i < 10){
    System.out.print(a + ",");
    c = a + b;
    a = b;
    b = c; 
   } else {
    System.out.println(a);
   }
   i++;
  }while(i < 11);  

 }
}
