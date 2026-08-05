class Solution {
    public void solve(int open, int close, List<String> ans, StringBuilder sb, int n){
        if(sb.length()==n*2){
            ans.add(sb.toString());
            return;
        }
        if(open<n){
            sb.append('(');
            solve(open+1, close, ans, sb,n);
            sb.deleteCharAt(sb.length()-1);

        }
        if(close<open){
            sb.append(')');
            solve(open,close+1,ans,sb,n);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    public List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();
        solve(0,0,ans ,new StringBuilder(), n);
        return ans;
    }
}