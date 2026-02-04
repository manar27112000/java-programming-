package PreplemSolving;

import java.util.Scanner;

public class BaseConverssion {



    public static int  decimalToBinary(int n){
        if(n == 0){
            return 0;
        }
    if(n>0){
            return (n%2) + 10 * decimalToBinary(n/2);
        }

return 0;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t>0){

            int n = sc.nextInt();

            System.out.println(decimalToBinary(n));
            t--;
        }


    }
}
