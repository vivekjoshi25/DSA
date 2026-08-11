class Solution {
    public void solve(int[] arr, int target, List<List<Integer>> ans, List<Integer> curr, int index){
         if(target==0){
            ans.add(new ArrayList<>(curr));
            return;        
            }
            if(index==arr.length || target<0){
                return;
            }

            for(int i=index; i<arr.length; i++){
                    if (i > index && arr[i] == arr[i - 1]) {
                continue;
            }

            // since array is sorted
            if (arr[i] > target) {
                break;
            }

        curr.add(arr[i]);
        solve(arr,target-arr[i], ans,curr,i+1);
        curr.remove(curr.size()-1);
        
            }
           
    }
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        solve(candidates, target,ans,curr,0);
        return ans;
    }
}