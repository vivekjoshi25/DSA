class Solution {
    int findmax(int[][] mat, int m, int n, int col){
        int max=0;
        int maxind=0;
        for(int i=0; i<m; i++){
            if(mat[i][col]>max){
                max=mat[i][col];
                maxind=i;
            }
        }
        return maxind;
    }
    public int[] findPeakGrid(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        int low=0;
        int high=n-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int maxrow=findmax(mat,m,n,mid);
            int left= mid-1>=0? mat[maxrow][mid-1] : -1;
             int right= mid+1<n? mat[maxrow][mid+1] :-1;
             if(mat[maxrow][mid]>left && mat[maxrow][mid]>right){
                return new int[]{maxrow,mid};
             }
             else if(mat[maxrow][mid]<left){
                high=mid-1;
             }
             else{
                low=mid+1;
             }
        }
        return new int[]{-1,-1};
    }
}