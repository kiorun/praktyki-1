
package zadania1;


public class Matma {

    static double Pi = 3.14;
    static double E = 2.71;
    static double C = 2.71;
    static void inc(double Pi,double E) {
        Pi=   Math.pow(Pi, 3);
      E= Math.pow(E, 3);
        System.out.println(Pi);
        System.out.println(E);
        return;
    }

    static void nahh(double Pi,double E) {
        double suma = Pi + E;
        double roz = Pi - E;
        double ilo = Pi* E;
        System.out.println(" suma równa się :");
        System.out.println(suma);
        System.out.println(" różnicę równa się :");
        System.out.println(roz);
        System.out.println(" iloczyn równa się :");
        System.out.println(ilo);
    }
    static void troj(double Pi,double E,double C){
    if (Pi+E>=C)System.out.println("true");
    else if(E+C>Pi)System.out.println("true");
    else if(C+Pi>E)System.out.println("true");
    else  System.out.println("false");
        }



    }





