import java.math.BigInteger;
import java.util.Scanner;

public class bigInteger {


    public static boolean isPrime(BigInteger number) {
        if (number.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
        return true;
    }

    public static void basicOperations(BigInteger a,
                                       BigInteger b,BigInteger neg) {


        BigInteger sum = a.add(b);
        BigInteger diff = a.subtract(b);
        BigInteger prod = a.multiply(b);
        BigInteger quot = a.divide(b);
        BigInteger mod = a.mod(b);

        System.out.println("a + b = " + sum);
        System.out.println("a - b = " + diff);
        System.out.println("a * b = " + prod);
        System.out.println("a / b = " + quot);
        System.out.println("a % b = " + mod);
        System.out.println("pow(3): " + a.pow(3)); // a³
        System.out.println("compareTo(b): " + a.compareTo(b));
        // > 0 → a أكبر من b
        // < 0 → a أصغر من b
        // = 0 → متساويين
        System.out.println("abs: " + neg.abs()); // |-50| = 50

        System.out.println("negate: " + a.negate()); // -a

        System.out.println("signum: " + neg.signum());
        // -1 لو سالب، 0 لو صفر، 1 لو موجب

        //  أكبر قاسم مشترك (GCD)
        System.out.println("gcd: " + a.gcd(b));

        System.out.println("square = a.multiply(a): " + a.multiply(a));

        //  باقي القسمة مع قيمة موجبة
        System.out.println("modPositive: " + neg.mod(BigInteger.valueOf(7)));




    }

    public static void main(String[] args) {
    //    Scanner sc = new Scanner(System.in);
        BigInteger number = new BigInteger("13");;
        BigInteger a = new BigInteger("12345678901234567890");
        BigInteger b = new BigInteger("9876543210");
        BigInteger neg = new BigInteger("-50");

        // sc.close();
        isPrime(number);
        basicOperations(a,b,neg);


    }
}
