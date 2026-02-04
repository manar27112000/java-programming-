package stack;

public class MatchingDelimiters {

    public static boolean isMatched(String expression) {
        final String opening = "({[";
        final String closing = ")}]";

        Stack<Character> stack = new LinkedStack<>();

        for (char c : expression.toCharArray()) {
            // If it's an opening symbol → push it
            if (opening.indexOf(c) != -1) {
                stack.push(c);
            }
            // If it's a closing symbol → check match
            else if (closing.indexOf(c) != -1) {
                if (stack.isEmpty()) return false; // no matching opener

                char top = stack.pop();
                // check if the type matches using index positions
                if (opening.indexOf(top) != closing.indexOf(c)) {
                    return false;
                }
            }
        }

        return stack.isEmpty(); // must be empty for all matches
    }

    public static void main(String[] args) {
        System.out.println(isMatched("()"));                  // true
        System.out.println(isMatched("(){}[[]]"));            // true
        System.out.println(isMatched("({[]})"));              // true
        System.out.println(isMatched("({[])})"));             // false
        System.out.println(isMatched("((())"));               // false
        System.out.println(isMatched(")()("));                // false
    }
}
