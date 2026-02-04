package stack;

import java.util.Scanner;

public class Balanced_Delimiters {


    public static boolean isMatched(String e) {
        char[] c = e.toCharArray();
        Stack<Character> stack = new LinkedStack<>();
        for (int i = 0; i < e.length(); i++) {

            if (c[i] == '(' || c[i] == '{' || c[i] == '[') {
                stack.push(c[i]);
            } else if (c[i] == ')' || c[i] == '}' || c[i] == ']') {
                if (stack.isEmpty()) {
                    return false;
                } else if (c[i] == ')' && stack.top() != '('
                        || c[i] == '}' && stack.top() != '{'
                        || c[i] == ']' && stack.top() != '[') {
                    {

                        return false;
                    }


                }
                stack.pop();

            }

        }
        return stack.isEmpty();

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String e = sc.next();
            System.out.println(isMatched(e));
        }

    }
}
