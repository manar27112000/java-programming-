package PreplemSolving;

import java.util.Stack;

public class SimplifyPath71 {

    public String simplifyPath(String path) {
        Stack <String>stack = new Stack();
        String[] part = path.split("/");

        for (int i = 0; i < part.length; i++) {
            if (part[i].equals(".") || part[i].equals("")) {
                continue;
        } else if (part[i].equals("..")) {
            if (!stack.isEmpty()) {
                stack.pop();
            }
        }else {stack.push(part[i]);}
    }
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }

        return result.length() == 0 ? "/" : result.toString();
    }

    public static void main(String[] args) {

        SimplifyPath71 obj = new SimplifyPath71();
        String path = "/a/./b/../../c/";
        System.out.println(obj.simplifyPath(path));
    }
    }