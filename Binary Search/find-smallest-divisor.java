class Solution {
    public boolean divides(int[] nums, int thres,int div){
        int sum=0;
       
        for(int divident:nums){
             int res=1;
            res= (divident+div-1)/div;
            sum+=res;
        }
     return sum<=thres;
    }
    public int smallestDivisor(int[] nums, int threshold) {
        int low=1;
        int high=Integer.MIN_VALUE;
        for(int maxi:nums){
            high=Math.max(maxi,high);
        }
        int result=0;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(divides(nums,threshold,mid)){
                result=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return result;
    }
}