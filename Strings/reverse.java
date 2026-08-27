class Solution {
    public String reverseWords(String s) {
        StringBuilder result=new StringBuilder();
        int i= s.length()-1;
        while(i>=0){
        while(i>=0 && s.charAt(i)==' '){
            i--;
        }
        int j=i;
        while(j>=0 && s.charAt(j)!= ' '){
        j--;
       
    }
     if(i>=0){
            result.append(s.substring(j+1, i+1));
            result.append(" ");
        }
        i=j-1;
        }
    return result.toString().trim();
    }
}