class Solution {
    public int helper(String s, int index, int sign , int num){
        if(index==s.length() || !Character.isDigit(s.charAt(index))){
            return (int)(num * sign);
        }
        int digit= s.charAt(index)-'0';
        num =num*10 +digit;
        if(sign==1 && num>Integer.MAX_VALUE){
            return Integer.MAX_VALUE;
        }
        if(sign==-1 && -num<Integer.MIN_VALUE){
            return Integer.MIN_VALUE;
        }
        return helper(s,index+1,sign,num);
    }
    public int myAtoi(String s) {
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        int sign=1;
        if(i <n && s.charAt(i)=='-'){
            sign=-1;
            i++;
        }
        else if(i<n && s.charAt(i)=='+'){
            i++;
        }
   if (i == s.length() || !Character.isDigit(s.charAt(i))){
            return 0;
 }
 return helper(s,i,sign,0);

}
}