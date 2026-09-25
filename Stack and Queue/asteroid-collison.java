class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> st=new Stack<>();
        for(int astroid: asteroids){
            boolean destroyed=false;
            while(!st.isEmpty() && st.peek()>0 && astroid<0){
                if(st.peek()< -astroid){
                    st.pop();
                }
                else if(st.peek()== -astroid){
                    st.pop();
                    destroyed=true;
                    break;
                }
                else{
                    destroyed=true;
                    break;
                }
            }
            if(!destroyed){
                st.push(astroid);
            }
        }
        int[] ans=new int[st.size()];
        for(int i=0; i<ans.length; i++){
            ans[i]=st.get(i);
        }
        return ans;
    }
}