class Solution {
    public int[] twoSum(int[] nums, int target) {
       Map <Integer,Integer> mp= new HashMap<>();
       for(int i=0; i<nums.length; i++){
        int num= nums[i];
        int moreneeded= target-num;
        if(mp.containsKey(moreneeded)){
            int ans[]= new int[2];
            ans[0]=mp.get(moreneeded);
            ans[1]= i;
            return ans;
        }
        mp.put(nums[i], i);
        
       }
        return new int []{};
    }
}