class Solution {
    String[] map = {"", "","abc", "def","ghi","jkl","mno","pqrs","tuv","wxyz"};

        public void solve(List<String> ans, String digits,String curr,int index){
            if(index==digits.length()){
                ans.add(curr);
                return;
            }
            int digit= digits.charAt(index)-'0';
            String letters= map[digit];
            for(int i=0; i<letters.length(); i++){
                curr+= (letters.charAt(i));
                solve(ans,digits,curr,index+1);
                curr=curr.substring(0,curr.length()-1);
            }
        }

    public List<String> letterCombinations(String digits) {
        List<String> ans= new ArrayList<>();
        if(digits.length()==0){
            return ans;
        }
        solve(ans,digits,"",0);
        return ans;
    }
}