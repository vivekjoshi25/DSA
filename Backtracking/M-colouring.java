class Solution {
    boolean graphColoring(int v, int[][] edges, int m) {
        
        // code here
        int[][] graph = new int[v][v];

        // Convert edge list to adjacency matrix
        for (int[] edge : edges) {

            int u = edge[0];
            int w = edge[1];

            graph[u][w] = 1;
            graph[w][u] = 1;
        }

        int[] color = new int[v];
        
        return solve(graph, color, m, 0);
    }
    
    public boolean solve( int[][] graph,int[] color,int m,int node){
        if(node== graph.length){
            return true;
        }
        for(int c=1; c<=m; c++){
            if(isSafe(graph,color,c,node)){
                color[node]=c;
                
                if(solve(graph,color,m,node+1)){
                    return true;
                }
                color[node]=0;
            }
        }
        return false;
    }
    public boolean isSafe(int [][] graph,int [] color,int c, int node){
        for(int neighbour=0; neighbour<graph.length; neighbour++){
            if(graph[node][neighbour]==1 && color[neighbour]==c ){
                return false;
            }
        }
        return true;
    }
}