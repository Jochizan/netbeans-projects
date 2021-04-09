package estructura_repetición;

public class fibo{
public static void main(String args[]){
  int i = 0,
      b = 1,
      a = 0,
      c = 0;
  do{
    System.out.print(a + ",");
    c = a + b;
    a = b;
    b = c; 
   i++;
  }while(i < 8);  

 }
}