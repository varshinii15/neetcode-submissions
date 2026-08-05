class Solution {
    public List<List<Integer>> pacificAtlantic(int[][] heights) {
        int m=heights.length;
        int n=heights[0].length;
        boolean[][] pacific=new boolean[m][n];
        boolean[][] atlantic=new boolean[m][n];

        for(int i=0;i<m;i++){
            dfs(pacific,i,0,heights,m,n,heights[i][0]);
            dfs(atlantic,i,n-1,heights,m,n,heights[i][n-1]);
        }


        for(int j=0;j<n;j++){
            dfs(pacific,0,j,heights,m,n,heights[0][j]);
            dfs(atlantic,m-1,j,heights,m,n,heights[m-1][j]);
        }

        List<List<Integer>> l=new ArrayList<>();

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(pacific[i][j] && atlantic[i][j]){
                    List<Integer> a=new ArrayList<>();
                    a.add(i);
                    a.add(j);
                    l.add(a);
                }
            }
        }

        return l;
    }

    public void dfs(boolean[][] arr,int i,int j,int[][] heights,int m,int n,int prev){

        if(i<0||i>=m||j<0||j>=n){
            return;
        }

        if(arr[i][j]){
            return;
        }

        if(heights[i][j]<prev){
            return;
        }

        arr[i][j]=true;

        dfs(arr,i+1,j,heights,m,n,heights[i][j]);
        dfs(arr,i-1,j,heights,m,n,heights[i][j]);
        dfs(arr,i,j+1,heights,m,n,heights[i][j]);
        dfs(arr,i,j-1,heights,m,n,heights[i][j]);
    }
}
