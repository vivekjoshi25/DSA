class Solution {
    public void solve(List<String> ans, String s,  StringBuilder sb , int index){
        if(index==s.length()){
            ans.add(sb.toString());
            return;
        }
        sb.append(s.charAt(index));
        solve(ans,s,sb,index+1);
        sb.deleteCharAt(sb.length()-1);
        
        solve(ans,s,sb,index+1);
    }
    public ArrayList<String> powerSet(String s) {
        // code here
        ArrayList<String> ans=new ArrayList<>();
        solve(ans,s, new StringBuilder(),0);
        return ans;
    }
}
