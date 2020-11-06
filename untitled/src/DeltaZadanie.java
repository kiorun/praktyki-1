import java.util.Scanner;

public class DeltaZadanie {
        public static void main(String[] args) {

            double a;
            double b;
            double c;

            Scanner scan =new Scanner(System.in);

                    System.out.println("podaj a=");
                            a=scan.nextDouble();
                    System.out.println("podaj b=");
                            b=scan.nextDouble();
                    System.out.println("podaj c=");
                            c=scan.nextDouble();

            double d=(b*b)-(4*a*c);
                    System.out.println(" d równa się to:");
                        System.out.println(d);

            {
                if(d<0)  System.out.println("nie ma rozwiązania");
                else if (d==0)  System.out.println("ma jedno rozwiązanie");
                else  System.out.println("ma więcej niż jedno rozwiązanie");
            }
        }
}
