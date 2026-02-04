package recursion;

public class Pawer {
 public static double power(double x, int n) {
     if (n == 0) {
         return 1;
     }else
     return x * power(x, n - 1);
 }


    public static double power2(double x, int n) {
        if (n == 0) {
            return 1;}
        else{
            double halfPower = power2(x, n / 2);
            double result = halfPower * halfPower;
            if (n % 2 == 1) {
                result *= x;
            }
            return result;
        }
    }

    public static void main(String[] args) {

     //O(n)
        System.out.println(power(3, 3));
     //O(log(n))
        System.out.println(power2(3, 3));
    }

}