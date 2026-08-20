class Solution {
    
    public void solve(List<String> ans,boolean[][] visited,int n,
    int row,int col,int[][] maze,String path){
        if(row==n-1 && col== n-1){
            ans.add(path);
            return;
        }
        visited[row][col]=true;
        
        if(row+1<n && maze[row+1][col]==1 && !visited[row+1][col]){
            solve(ans,visited,n,row+1,col,maze,path+"D");
        }
        if(col-1>=0 && maze[row][col-1]==1 &&!visited[row][col-1]){
            solve(ans,visited,n,row,col-1,maze,path+"L");
        }
        if(col+1<n && maze[row][col+1]==1 && !visited[row][col+1]){
            solve(ans,visited,n,row,col+1,maze, path+"R");
        }
        
        if(row-1>=0 && maze[row-1][col]==1 && !visited[row-1][col]){
            solve(ans,visited,n,row-1,col,maze,path+"U");
        }
        visited[row][col]=false;
    }
    public ArrayList<String> ratInMaze(int[][] maze) {
        // code here
        ArrayList<String> ans =new ArrayList<>();
        int n= maze.length;
        if(maze[0][0]==0 || maze[n-1][n-1]==0){
            return ans;
        }
        boolean[][] visited=new boolean[n][n];
        solve(ans,visited,n,0,0,maze, "");
        return ans;
    }
}