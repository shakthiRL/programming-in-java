import java.util.Stack;

public class c18 {
        String input = "((())";

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch == '(') {
                stack.push(ch);
                System.out.println("Pushed: " + ch);
            } else if (ch == ')') {
                if (!stack.isEmpty() && stack.peek() == '(') {
                    stack.pop();
                    System.out.println("Popped: " + ch);
                } else {
                    System.out.println("Unmatched closing bracket at index " + i);
                    break;
                }}
            }
}


