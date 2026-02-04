package recursion;

import java.util.Scanner;

class PowerOfFour {
    public static boolean isPowerOfFour(int n) {

        if (n == 1) return true;
        if (n <= 0 || n % 4 != 0) return false;

        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        System.out.println(isPowerOfFour(n));
    }
}
