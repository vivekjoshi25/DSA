class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int maxc=Integer.MIN_VALUE;
        for(int i=0; i<nums.length; i++){
            int count =0;
            while(i<nums.length && nums[i]==1){
                count++;
                i++;
            }
            maxc=Math.max(maxc,count);
        }
        return maxc;
    }
}