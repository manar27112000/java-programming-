//package PreplemSolving;
//
//import java.util.Scanner;
//import java.util.Stack;
//
//public class LongestValidParentheses {
//
//    public static int longestValidParentheses(String s) {
//
//        Stack<Integer> stack = new Stack<>();
//        stack.push(-1);
//        int output = 0;
//        for (int i = 0; i < s.length(); i++) {
//            char c=s.charAt(i);
//            if(c=='('){
//                stack.push(i);
//            } else if (c==')') {
//                if (stack.isEmpty()) {
//                    output=0;
//                }else if (c == ')' && stack.peek() == '(') {
//                    output+=2;
//                    stack.pop();
//                }
//
//            }
//        }
//
//        return output;
//    }
//
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        String s = in.nextLine();
//        System.out.println(longestValidParentheses(s));
//    }
//}
