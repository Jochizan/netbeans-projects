package problemas_de_geo;

import java.util.Scanner;

public class Preguntas_02 {
    
    public static void main(String[] args) {
        
        double m1, m2, n1, n2, p1, p2, c1, c2, h1, h2, a1, a2, b1, b2, mMH, mNP, mNH, mMP, mMN, mAC;
        double aNP, bNP, cNP, aMP, bMP, cMP, aAC, bAC, cAC, aBC, bBC, cBC, h, k, R;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Ingrese el punto M del triángulo");
        m1 = entrada.nextInt();
        m2 = entrada.nextInt();
        
        System.out.println("Ingrese el punto N del triángulo");
        n1 = entrada.nextInt();
        n2 = entrada.nextInt();
        
        System.out.println("Ingrese el punto ortocentro del triángulo");
        h1 = entrada.nextInt();
        h2 = entrada.nextInt();

        mMH = (h2-m2)/(h1-m1);
        mNP = -Math.pow(mMH, -1);
        mNH = (h2-n2)/(h1-n1);
        mMP = -Math.pow(mNH, -1);
        mMN = (n2-m2)/(n1-m1);
        mAC = -Math.pow(mMN, -1);
     //   System.out.println(mMN);
        
        aNP = mNP;
        bNP = -1;
        cNP = mNP*(-n1)-(-n2);
        
        aMP = mMP;
        bMP = -1;
        cMP = mMP*(-m1)-(-m2);
        
        System.out.println(mMH +", " + mNP
                +"\nLa ecuación de la recta NP es:"
                        + "\n"+(mNP) +"x  - y = " + -cNP
                +"\n La ecuación de la recta MP es:"
                        + "\n" +(mMP)+"x  - y = " + -cMP);
        
        p2 = ((aNP*-cMP)-(aMP*-cNP))/((aNP*bMP)-(aMP*bNP));
        p1 = (-cNP-(bNP*p2))/aNP;
        
        System.out.println("El punto P es:"
                + "\n(" + p1 +", " + p2 +")");
        
        a1 = (m1+n1)/2;
        a2 = (m2+n2)/2;
        
        b1 = (n1+p1)/2;
        b2 = (n2+p2)/2;
        
        System.out.println("Los puntos A y B son respectivamente:"
                + "\n(" + a1 + ", "+ a2 + "), (" + b1 + ", " + b2 + ")");
        
        aAC = 1;
        bAC = -Math.pow(mAC, -1);
        cAC = -(Math.pow(mAC, -1)*(-a2))+(-a1);
        
        aBC = 1;
        bBC = -Math.pow(mMH, -1);
        cBC = -(Math.pow(mMH, -1)*(-b2))+(-b1);
        //System.out.println( bAC + ", "+cAC + ", " +bBC +", "+ cBC);
        h = ((aAC*cBC)-(aBC*cAC))/((aAC*bBC)-(aBC*bAC));
        k = (cAC-(bAC*h))/aAC;
        R = Math.sqrt(Math.pow((m1-h), 2)+Math.pow((m2-k), 2));
        
        System.out.println("El punto  centro es:\n"
                + "("+ Math.floor(h) +", " + Math.floor(k) +")"
                + "\n y el radio de la circunferencia es: " + Math.ceil(R) 
                + "\nEntonces la ecuación de su circunferencia es:"
                + "\n( x + "+ -Math.floor(h) +")^2 + ( y + " + -Math.floor(k) + ")^2 = " + Math.ceil(Math.pow(R, 2)));
    }
}