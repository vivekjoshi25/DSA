class Solution {
    static String preToInfix(String s) {
        // code here
        Stack<String> st=new Stack<>();
        
        for(int i=s.length()-1; i>=0; i--){
            char ch= s.charAt(i);
            
            if(Character.isLetterOrDigit(ch)){
                st.push(String.valueOf(ch));
            }
            else{
                String left= st.pop();
                String right= st.pop();
                String temp= '('+ left + ch+ right+')';
                st.push(temp);
            }
        }
        return st.pop();
    }
}
