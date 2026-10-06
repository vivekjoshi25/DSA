class Solution {
    public int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        int n=nums.length;
        int cs=0;
        for(int i=0; i<n; i++){
            cs+=nums[i];
            if(cs<0){
                cs=0;
            }
             maxsum=Math.max(cs,maxsum);
            }
        
        return maxsum;
    }
}