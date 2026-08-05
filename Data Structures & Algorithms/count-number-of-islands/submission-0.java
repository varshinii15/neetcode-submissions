class Solution {
    int c=0;
    public int numIslands(char[][] grid) {
        int m=grid.length;
        int n=grid[0].length;

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]=='1'){
                    c++;
                    dfs(grid,i,j);
                }
            }
        }

        return c;
    }

    public void dfs(char[][] grid,int i,int j){

        if(i<0||i>=grid.length||j<0||j>=grid[0].length){
            return;
        }

        if(grid[i][j]!='1'){
            return;
        }

        grid[i][j]='0';

        dfs(grid,i+1,j);
        dfs(grid,i-1,j);
        dfs(grid,i,j+1);
        dfs(grid,i,j-1);
    }
}
