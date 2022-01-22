package mystack;

import java.util.Stack;

public class Stack_algorithm {

    static int Prec(char ch) {
        switch (ch) {
            case '+':
            case '-':
                return 1;

            case '*':
            case '/':
                return 2;

            case '^':
                return 3;
        }
        return -1;
    }

    static String infixToPostfix(String s) {

        String s1 = new String("");
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); ++i) {
            char c = s.charAt(i);

            if (Character.isLetterOrDigit(c)) {
                s1 += c;

            } else if (c == '(') {
                stack.push(c);

            } else if (c == ')') {
                while (!stack.isEmpty() && stack.peek() != '(') {
                    s1 += stack.pop();
                }
                if (!stack.isEmpty() && stack.peek() != '(') {
                    return "Invalid Expression";
                } else {
                    stack.pop();
                }
            } else {
                while (!stack.isEmpty() && Prec(c) <= Prec(stack.peek())) {
                    if (stack.peek() == '(')
                        return "Invalid Expression";
                    s1 += stack.pop();
                }
                stack.push(c);
            }

        }

        while (!stack.isEmpty()) {
            if (stack.peek() == '(')
                return "Invalid Expression";
            s1 += stack.pop();
        }
        return s1;
    }

    static int evaluatePostfix(String s) {
        Stack<Integer> stack = new Stack<Integer>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                stack.push(c - '0');
            } else {
                int val1 = stack.pop();
                int val2 = stack.pop();

                switch (c) {
                    case '+':
                        stack.push(val2 + val1);
                        break;

                    case '-':
                        stack.push(val2 - val1);
                        break;

                    case '/':
                        stack.push(val2 / val1);
                        break;

                    case '*':
                        stack.push(val2 * val1);
                        break;

                    case '^':
                        stack.push((int) Math.pow(val2, val1));
                        break;
                }
            }
        }
        return stack.pop();
    }

    public static void main(String[] args) {
        String exp = "1+2*(3^4-5)/8*(3+7)";
//        String exp = "11+((10-2)*6)+7";
        System.out.println("TRUNG TO: " + exp);
        System.out.println("HAU TO: " + infixToPostfix(exp));
        System.out.println();
        System.out.println("KET QUA: " + evaluatePostfix(infixToPostfix(exp)));
    }

    public void base_ten_to_banary(int x) {
        StackArray<Integer> stack = new StackArray<>();
        int temp = 0;
        String s = "";
        try {
            while (x != 0) {
                temp = x % 2;
                x /= 2;
                stack.push(temp);
            }
            while (stack.isEmpty() == false) {
                s += stack.pop() + " ";
            }
            System.out.println(s);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
