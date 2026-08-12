class Solution {
    public void solve(int[] arr, List<List<Integer>> ans, List<Integer> curr, int index){
            ans.add(new ArrayList<>(curr));
            for(int i=index; i<arr.length; i++){
            if(i>index && arr[i]==arr[i-1]){
                continue;
            }
            curr.add(arr[i]);
            solve(arr,ans,curr,i+1);
            curr.remove(curr.size()-1);

        }
    }
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans= new ArrayList<>();
        List<Integer> curr= new ArrayList<>();
        solve(nums, ans,curr, 0);
        return ans;
    }
}