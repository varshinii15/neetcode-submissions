class Solution {
    public boolean exist(char[][] board, String word) {

        int m=board.length;
        int n=board[0].length;
        boolean[][] v=new boolean[m][n];

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(dfs(board,m,n,i,j,word,0,v)){
                    return true;
                }
            }
        }

        return false;
    }

    public boolean dfs(char[][] b,int m,int n,int i,int j,String w,int idx,boolean[][] v){


        if(idx==w.length()){
            return true;
        }
        
        if(i<0||i>=m||j<0||j>=n){
            return false;
        }


        if(v[i][j] || w.charAt(idx)!=b[i][j]){
            return false;
        }

        v[i][j]=true;

        boolean ans=dfs(b,m,n,i+1,j,w,idx+1,v)||dfs(b,m,n,i-1,j,w,idx+1,v)||dfs(b,m,n,i,j+1,w,idx+1,v)||dfs(b,m,n,i,j-1,w,idx+1,v);

        v[i][j]=false;

        return ans;
    }
}
