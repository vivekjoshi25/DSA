class Solution {
    public void solveSudoku(char[][] board) {
        solve(board);
    }
    public boolean solve(char[][] board){
        for(int row=0; row<9; row++){
            for(int col=0; col<9; col++){
                if(board[row][col]=='.'){
                    for(char num='1'; num<='9'; num++){
                            if(isSafe(board,row,col,num)){
                                board[row][col]=num;
                            
                            if(solve(board)==true){
                                return true;
                            }
                            board[row][col]='.';
                    }
                }
                return false;
            }
            }
        }
        return true;
    }
    public boolean isSafe(char[][] board,int row,int col,char num){
        for(int j=0; j<9; j++){
            if(board[row][j]==num){
                return false;
            }
        }
        for(int j=0; j<9; j++){
            if(board[j][col]==num){
                return false;
            }
        }
        int startrow=(row/3)*3;
        int startcol=(col/3)*3;
        for(int i=startrow; i<startrow+3; i++){
            for(int j=startcol; j<startcol+3; j++){
                if(board[i][j]==num){
                    return false;
                }
            }
        }
        return true;
    }
}