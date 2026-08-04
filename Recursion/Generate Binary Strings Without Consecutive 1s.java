class Solution {
    public void solve(int index, StringBuilder sb, int n, int prev){
        if(index==n){
            System.out.println(sb.toString());
            return;
        }
        sb.append('0');
        solve(index+1,sb,n,0);
        sb.deleteCharAt(sb.length()-1);
        
        if(prev==0){
            sb.append('1');
            solve(index+1,sb,n,1);
            sb.deleteCharAt(sb.length()-1);
        }
    }
    int countStrings(int n) {
        // code here
        StringBuilder sb =new StringBuilder();
        solve(0,sb,n,0);
    }
}