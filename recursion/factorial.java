package recursion;

import java.util.Scanner;

public class factorial {

    public static int fact(int n) throws IllegalArgumentException {
        if (n == 0) {
            return 1;
        } else if (n < 0) {
            throw new IllegalArgumentException("Negative number not allowed");


        } else {
            return n * fact(n - 1);
        }
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        try {
            System.out.println(fact(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
