package PreplemSolving;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPrimes {
    public static void main(String[] args)  {
        Scanner in = new Scanner(System.in);
        BigInteger number =BigInteger.valueOf(in.nextLong());
        if(number.isProbablePrime(1)){
            System.out.println("prime");

        } else {
            System.out.println("not prime");
        }

    }
}
