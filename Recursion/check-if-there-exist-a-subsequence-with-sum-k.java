class Solution {
    public boolean check(int [] arr, int k, int sum , int index){
        if(index==arr.length){
            if(sum==k){
                return true;
            }
            return false;
        }
        if(check(arr,k,sum+arr[index],index+1)){
        return true;
        }
        if(check(arr,k,sum,index+1)){
            return true;
        }
        return false;
    }
    public boolean checkSubsequenceSum(int[] arr, int k) {
        // code here
        return check(arr,k,0,0);
    }
}