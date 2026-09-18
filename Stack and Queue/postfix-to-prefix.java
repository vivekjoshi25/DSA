static String postfixToPrefix(String exp) {
    Stack<String> st = new Stack<>();

    for (int i = 0; i < exp.length(); i++) {
        char ch = exp.charAt(i);

        // Operand
        if (Character.isLetterOrDigit(ch)) {
            st.push(String.valueOf(ch));
        }

        // Operator
        else {
            String right = st.pop();
            String left = st.pop();

            String temp = ch + left + right;
            st.push(temp);
        }
    }

    return st.pop();
}