package mystack;

public class Stack_Polish {
    public static int perc(char ch) {
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

    public static String toPostfix(String exp) {
        String result = new String("");
        Stack_linkedList<Character> stack = new Stack_linkedList<>();

        for (int i = 0; i < exp.length(); ++i) {
            char x = exp.charAt(i);
            if (x == ' ') {
                continue;
            }
            if (x == '(') {
                stack.push(x);
            } else if (Character.isLetterOrDigit(x)) {
                result += x;
            } else if (x == ')') {
                while (stack.peek() != '(') {
                    result += stack.pop();
                }
                stack.pop();
            } else {
                while (!stack.isEmpty() && perc(x) <= perc(stack.peek())) {
                    result += stack.pop();
                }
                stack.push(x);
            }
        }
        while (!stack.isEmpty()) {
            result += stack.pop();
        }
        return result;
    }

    public static int postfix(String exp) {
        Stack_linkedList<Integer> st = new Stack_linkedList<>();
        for (int i = 0; i < exp.length(); ++i) {
            char x = exp.charAt(i);
            if (Character.isDigit(x)) {
                st.push(x -'0');
            } else {
                int v1 = st.pop();
                int v2 = st.pop();
                switch (x) {
                    case '+':
                        st.push(v2 + v1);
                        break;
                    case '-':
                        st.push(v2 - v1);
                        break;
                    case '*':
                        st.push(v2 * v1);
                        break;
                    case '/':
                        st.push(v2 / v1);
                        break;
                    case '^':
                        st.push((int) Math.pow(v2, v1));
                        break;
                }
            }
        }
        return st.pop();
    }

    public static void main(String[] args) {
        String exp = "1+2*(3^4-5)/8*(3+7)";
        System.out.println("input: " + exp);
        String xx = toPostfix(exp);
        System.out.println("Postfix: " + xx);
        System.out.println("Result: " + postfix(xx));
    }
}
