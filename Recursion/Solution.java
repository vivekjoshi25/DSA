public class Solution {

        public void solve(List<List<String>> ans, List<String> curr,String s, int index){
            if(index==s.length()){
                ans.add(new ArrayList<>(curr));
                return;
            }
            for(int end=index; end<s.length(); end++){
                if(ispallindrome(s,index,end)){
                    curr.add(s.substring(index,end+1));
                    solve(ans,curr,s,end+1);
                    curr.remove(curr.size()-1);
                }
            }
        }

    public boolean ispallindrome(String s, int left, int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public List<List<String>> partition(String s) {
        List<List<String>> ans= new ArrayList<>();
        List<String> curr = new ArrayList<>();
        solve(ans,curr,s,0);
        return ans;
    }
} {
    
}
