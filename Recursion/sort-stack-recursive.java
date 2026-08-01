class Solution {
    public void insert(Stack <Integer> st, int x){
        if(st.isEmpty() || st.peek()<=x ){
            st.push(x);
            return;
        }
        int top= st.pop();
        insert(st,x);
        st.push(top);
        
    }
    public void sortStack(Stack<Integer> st) {
        // code here
        if(st.size()<=1){
            return;
        }
        int top= st.pop();
        sortStack(st);
        insert(st, top);
    }
}