class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> ans= new ArrayList<>();
        char[][] board= new char[n][n];
        for(int i=0; i<n; i++){
            Arrays.fill(board[i],'.');
        }
        solve(ans,board,n,0);
        return ans;
    }
     public void solve(List<List<String>> ans , char[][] board, int n, int row){
        if(row==n){
            ans.add(construct(board));
            return;
        }
        for(int col=0; col<n; col++){
            if(issafe(board,row,col,n)){
                board[row][col]='Q';
                solve(ans,board,n,row+1);
                board[row][col]= '.';
            }
        }
     }
     public boolean issafe(char[][] board, int row,int col, int n){
        for(int i=row-1; i>=0; i--){
            if(board[i][col]=='Q'){
                return false;
            }

        }
        for(int i=row-1,j=col-1; i>=0 &&j>=0; i--,j--){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        for(int i=row-1,j=col+1; i>=0 &&j<n; i--,j++){
            if(board[i][j]=='Q'){
                return false;
            }
        }
        return true;
     }
     public List<String> construct(char[][] board){
        List<String> list= new ArrayList<>();
        for(char[] row:board){
            list.add(new String(row));
        }
          return list;
     }

   
}