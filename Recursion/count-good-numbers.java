class Solution {
     long mod= 1000000007;
    public long pow(long x, long n){
        if(n==0){
            return 1;
        }
        long half= pow(x,n/2);
        long ans= (half *half)%mod;
        if(n%2==1){
            ans= (x * ans)%mod;
        }
        return ans;
    }
    public int countGoodNumbers(long n) {
       
        long even = (n+1)/2;
        long odd= n/2;
        long evenways=pow(5,even);
        long oddways=pow(4,odd);
        return (int)((evenways *oddways)%mod);
    }
}