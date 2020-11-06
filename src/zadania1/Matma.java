
package zadania1;


public class Matma {

    static double Pi = 3.14;
    static double E = 2.71;
  public static double potega(double x){
      double y=  Math.pow(x, 3);
      return y;
  }

  public static double dodaj(double x, double y){
      double z =x +y;
      return z;

  }
    public static double oddaj(double x, double y){
        double z =x -y;
        return z;

    }
    public static double rozna(double x, double y){
        double z =x *y;
        return z;

    }
    public  static boolean troj(double a, double b, double z){
      boolean ehh=false;
      if((z*z==(a*a)+(b*b))||(a*a==(z*z)+(b*b))||(b*b==(a*a)+(z*z))){
          ehh=true;
        }
    return ehh;
  }



}





