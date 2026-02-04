package recursion;

import java.util.Scanner;

class Solution {
    public static int fib(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else if (n < 0) {
            throw new IllegalArgumentException("Negative number not allowed");
        } else {
            return fib(n - 1) + fib(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        try {
            System.out.println(fib(n));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}