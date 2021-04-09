import java.util.Scanner;

public class Pregunta_8{
    public static void main(String args[]){
        //variables:
        String matricula = "";
        double cali_1, cali_2, cali_3, cali_4, cali_5, P;
        Scanner sc = new Scanner(System.in);
        Scanner entrada = new Scanner(System.in);
        //entrada:
        System.out.println("Ingrese su primera calificación ");
        cali_1 = sc.nextDouble();
        
        System.out.println("Ingrese su segunda calificación ");
        cali_2 = sc.nextDouble();
        
        System.out.println("Ingrese su tercera calificación ");
        cali_3 = sc.nextDouble();
        
        System.out.println("Ingrese su cuarta calificación ");
        cali_4 = sc.nextDouble();
        
        System.out.println("Ingrese su quinta calificación ");
        cali_5 = sc.nextDouble();
        
        System.out.println("Ingrese la matrícula del alumno ");
        matricula = entrada.nextLine();

        
        if(20 >= cali_1 && cali_1 >= 0 && 20 >= cali_2 && cali_2 >= 0 && 20 >= cali_3 && 
                cali_3 >= 0 && 20 >= cali_4 && cali_4 >= 0 && 20 >= cali_5 && cali_5 >= 0 ){
            //proceso
            P = (cali_1 + cali_2 + cali_3 + cali_4 + cali_5)/5;
            //salida1:
            System.out.println("El promedio de sus calificaciones es " + P + " y su matrícula " + matricula );
            
        }if(cali_1 < 0 || cali_1 > 20 || cali_2 < 0 || cali_2 > 20 || cali_3 < 0 ||
                cali_3 > 20 || cali_4 < 0 || cali_4 > 20 || cali_5 < 0 || cali_5 > 20 ){
            //salida2:
            System.out.println("Uno o los valores ingresados son inválidos.");
            
        }
    }
}