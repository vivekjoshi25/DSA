class Solution {
    public long totalhours(int[] piles, int speed){
        long totalhour=0;
        for(int banana:piles){
             totalhour+=(banana+speed-1)/speed;
            
        }
         return totalhour;
    }

      public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=0;
        
        for(int pile:piles)
        {
            high=Math.max(high,pile);
        }
        int ans=high;
     while(low<=high){
        int mid=low+(high-low)/2;
        long total=totalhours(piles,mid);
        if(total<=h){
            ans=mid;
            high=mid-1;
        }
        else{
            low=mid+1;
        }
     }
     return ans;
    }
}