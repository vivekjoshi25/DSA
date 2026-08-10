class Solution {
    public void solve(int [] arr,int target, List<List<Integer>> ans, List<Integer> curr,int index){
        if(target==0){
            ans.add(new ArrayList<>(curr));
            return;        
            }
            if(index==arr.length || target<0){
                return;
            }
            if(arr[index]<=target){
                curr.add(arr[index]);
                solve(arr,target-arr[index],ans,curr,index);
                curr.remove(curr.size()-1);
            }
            solve(arr,target,ans,curr,index+1);
    }
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        solve(candidates, target,ans,curr,0);
        return ans;
    }
}