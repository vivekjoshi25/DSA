class Solution {
    public void solve(int start, int k, int target, List<List<Integer>> ans, List<Integer> curr){
        if(curr.size()==k){
            if(target==0){
                ans.add(new ArrayList<>(curr));
                return;
            }
            }
            for(int i= start; i<=9; i++){
                if(i>target){
                    break;
                }
                curr.add(i);
                solve(i+1,k,target-i,ans,curr);
                curr.remove(curr.size()-1);
            }
        }
    public List<List<Integer>> combinationSum3(int k, int n) {
         List<List<Integer>> ans=new ArrayList<>();
         List<Integer> curr= new ArrayList<>();
         solve(1,k,n,ans,curr);
         return ans;
    }
}