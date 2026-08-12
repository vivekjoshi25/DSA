class Solution {
    public void solve(int [] arr, ArrayList<ArrayList<Integer>> ans, ArrayList<Integer> curr,
    int index){
        if(index==arr.length){
            ans.add(new ArrayList<>(curr));
            return;
        }
        curr.add(arr[index]);
        solve(arr, ans, curr,index+1);
        curr.remove(curr.size()-1);
        solve(arr, ans,curr,index+1);
    }
    public ArrayList<ArrayList<Integer>> subsets(int arr[]) {
        // code here
        ArrayList<ArrayList<Integer>> ans= new ArrayList<>();
        ArrayList<Integer> curr=new ArrayList<>();
        solve(arr, ans, curr, 0);
        return ans;
        
    }
}