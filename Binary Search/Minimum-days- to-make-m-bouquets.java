class Solution {
    public boolean check(int[] blooms,int day,int m, int k){
        int count=0;
        int bouquet=0;
        for(int bloom:blooms){
            if(bloom<=day){
                count++;
                if(count==k){
                    bouquet++;
                    count=0;
                }
            }
        else{
            count=0;
        }
            
        }
        return bouquet>=m;
    }
    public int minDays(int[] bloomDay, int m, int k) {
        long total=m*k;
        if(total>bloomDay.length){
            return -1;
        }
        int low=Integer.MAX_VALUE;
        int high=Integer.MIN_VALUE;
        for(int bloom :bloomDay){
            low=Math.min(low,bloom);
            high=Math.max(high,bloom);
            
        }
        int result=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(check(bloomDay,mid,m,k)){
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