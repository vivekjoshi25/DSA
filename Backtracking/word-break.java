class Solution {
    public boolean solve(String s, Set<String> set, int start){
        if(start==s.length()){
            return true;

        }
        for(int end=start+1; end<=s.length(); end++){
                String word= s.substring(start,end);
                if(set.contains(word)){
                    if(solve(s,set,end)){
                        return true;
                    }
                }
        }
        return false;
    }
    public boolean wordBreak(String s, List<String> wordDict) {
        Set<String> set=new HashSet<>(wordDict);
        return solve(s,set,0);
    }
}