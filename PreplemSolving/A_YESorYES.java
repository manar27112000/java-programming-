package PreplemSolving;

import java.util.Scanner;

public class A_YESorYES {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        while (n > 0) {

            String s = in.next();
            s=s.toUpperCase();

            if (s.equals("YES")) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
            n--;


        }
    }
}
