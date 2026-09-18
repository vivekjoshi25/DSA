class Solution {
    static String postToInfix(String s) {
        // code here
        Stack<String>st=new Stack<>();
        
        for(int i=0; i<s.length(); i++){
            char ch= s.charAt(i);
            
            
            if( Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String right= st.pop();
                String left= st.pop();
                String temp= '('+ left + ch + right + ')';
                st.push(temp);
            }
        }
        return st.pop();
    }
}