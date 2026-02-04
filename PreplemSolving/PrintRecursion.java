package PreplemSolving;

import java.util.Scanner;

public class PrintRecursion {

    public static void print(int n) {
        if (n > 0) {
            print(n - 1);
            System.out.println("I love Recursion");
        }
    }

    public static void print1_n(int n) {
        if (n > 0) {

            print1_n(n - 1);
            System.out.println(n);

        }
    }

    public static void print_n_1(int n) {
        if (n > 0) {
            System.out.println(n);
            print_n_1(n - 1);

        }
    }

    public static void printDigits(int n) {
        if (n < 10) {
            System.out.print(n + " ");
            return;
        }

        printDigits(n / 10);

        System.out.print((n % 10) + " ");

    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
//        print(n);
//        System.out.println("**************************");
//        print1_n(n);
//        System.out.println("**************************");
//        print_n_1(n);
//        System.out.println("**************************");


        while (t > 0) {
            int n = in.nextInt();
            printDigits(n);
            System.out.println();
            t--;

        }
        in.close();
    }
}
