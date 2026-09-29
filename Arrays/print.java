class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int m=matrix.length;
        int n=matrix[0].length;
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=m-1;
        List<Integer> List=new ArrayList<>();
        while( top<=bottom && left<=right ){
        for(int i=left; i<=right; i++){
            List.add(matrix[top][i]);
            
        }
        top++;
        for(int i=top; i<=bottom; i++){
            List.add(matrix[i][right]);
           
        }
         right--;
        if(top<=bottom){
            for(int i=right; i>=left; i--){
                List.add(matrix[bottom][i]);
                
            }
            bottom--;
        }
        
        if(left<=right){
            for(int i=bottom; i>=top; i--){
                List.add(matrix[i][left]);
                
            }
            left++;
            }
        }
        return List;
    }
}