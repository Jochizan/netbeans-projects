import java.util.Scanner;

public class prueba3 {

  public static void main(String[] args) {

    int num = 0;
    double b = 0, d = 0, n, c;
    String txt;
    char crt;
    boolean bool = true;
    Scanner scn = new Scanner(System.in);
    while (num < 1) {
      System.out.println("Numero");
      num = scn.nextInt();
    } 
    while (b < 2 || b > 9) {
      System.out.println("Base");
      b = scn.nextInt();
    } 
    
    c = Math.floor(Math.log10(num) + 1);

    for (int i = 0; i < c; i++) {
      txt = Integer.toString(num);
      crt = (txt).charAt(i);
      n = Character.getNumericValue(crt);
      if (n >= b) {
        bool = false;
      }
    }
    if (bool == true) {
      for (int i = 1; i <= c; i++) {
      n = num % 10;
      d = n * Math.pow(b, i-1) + d;
      num = num / 10;
    }
    System.out.println(":::: " + d);
    } else {
      System.out.println("Valor no admitido");
    }    
  }
}