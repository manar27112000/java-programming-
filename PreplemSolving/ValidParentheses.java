package PreplemSolving;

import java.util.Scanner;
import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack <Character>stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char   c=s.charAt(i);

            if (c== '(' || c == '{' || c == '[') {
                stack.push(  c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                } 
                if (c == ')' && stack.peek() != '(' ||
                        c == '}'&&stack.peek() != '{' ||
                        c == ']' && stack.peek() != '['
                ) {
                    return false;

                }
                stack.pop();

            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.nextLine();
        System.out.println(isValid(s));

    }
}
