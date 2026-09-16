import java.util.*;

class Solution {

    static int precedence(char ch) {

        if (ch == '^')
            return 3;

        if (ch == '*' || ch == '/' || ch == '%')
            return 2;

        if (ch == '+' || ch == '-')
            return 1;

        return -1;
    }

    public static String infixToPostfix(String s) {

        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        for (char ch : s.toCharArray()) {

            // Operand
            if (Character.isLetterOrDigit(ch)) {
                ans.append(ch);
            }

            // Opening bracket
            else if (ch == '(') {
                st.push(ch);
            }

            // Closing bracket
            else if (ch == ')') {

                while (!st.isEmpty() && st.peek() != '(') {
                    ans.append(st.pop());
                }

                st.pop(); // remove '('
            }

            // Operator
            else {

               while (!st.isEmpty()
                       && st.peek() != '('
                       && (precedence(st.peek()) > precedence(ch)
                       || (precedence(st.peek()) == precedence(ch) && ch != '^'))) {

                   ans.append(st.pop());
               }

                st.push(ch);
            }
        }

        // Remaining operators
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        return ans.toString();
    }
}