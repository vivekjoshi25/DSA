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

    static String infixToPrefix(String s) {

        // 1. Reverse the expression
        s = new StringBuilder(s).reverse().toString();

        // 2. Swap brackets
        StringBuilder temp = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (ch == '(')
                temp.append(')');

            else if (ch == ')')
                temp.append('(');

            else
                temp.append(ch);
        }

        Stack<Character> st = new Stack<>();
        StringBuilder ans = new StringBuilder();

        // 3. Convert to postfix
        for (char ch : temp.toString().toCharArray()) {

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

                if (!st.isEmpty()) {
                    st.pop();
                }
            }

            // Operator
            else {

                while (!st.isEmpty() &&
                       st.peek() != '(' &&
                       (precedence(st.peek()) > precedence(ch) ||
                        (precedence(st.peek()) == precedence(ch)
                         && ch == '^'))) {

                    ans.append(st.pop());
                }

                st.push(ch);
            }
        }

        // Remaining operators
        while (!st.isEmpty()) {
            ans.append(st.pop());
        }

        // 4. Reverse postfix = prefix
        return ans.reverse().toString();
    }
}