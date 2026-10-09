class Solution {
    int max=0;
    public int maxAreaOfIsland(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        boolean[][] v=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !v[i][j]){
                    max=Math.max(dfs(grid,i,j,v),max);
                }

            }
        }

        return max;
    }

    public int dfs(int[][] grid,int i,int j,boolean[][] v){

        if(i<0||i>=grid.length||j<0||j>=grid[0].length){
            return 0;
        }
        if(grid[i][j]!=1){
            return 0;
        }
        if(v[i][j]){
            return 0;
        }

        v[i][j]=true;

        

      return 1+ dfs(grid,i+1,j,v) + dfs(grid,i-1,j,v) + dfs(grid,i,j+1,v) + dfs(grid,i,j-1,v);

    }
}
