package leetcode;

import java.util.Stack;

public class ValidParentheses {
    public static boolean isValid(String s) {
        Stack <Character> store = new Stack<>();
        char c, temp;
        for (int i=0; i<s.length(); i++) {
            c = s.charAt(i);
            System.out.println(c);
            if (c == '(' || c == '{' || c == '[') {
                store.push(c);
            } else {
                if (store.isEmpty()) {
                    return false;
                }
                temp = store.pop();
                if (c == ')' && temp != '(') {
                    return false;
                } else if (c == '}' && temp != '{') {
                    return false;
                } else if (c == ']' && temp != '[') {
                    return false;
                }
            }
        }
        return store.isEmpty();
    }

    public static void main(String[] args) {
        //System.out.println(isValid("){"));
        Stack <Integer> s1 = new Stack<>();
        System.out.println(s1.peek());
    }
}
