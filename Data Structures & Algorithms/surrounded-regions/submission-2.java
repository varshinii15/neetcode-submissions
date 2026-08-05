class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        for(int i=0;i<m;i++){
            dfs(board,i,0);
            dfs(board,i,n-1);
        }

        for(int i=0;i<n;i++){
            dfs(board,0,i);
            dfs(board,m-1,i);
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){

                if(board[i][j]=='O'){
                    board[i][j]='X';
                }else if(board[i][j]=='S'){
                    board[i][j]='O';
                }
            }
        }


    }

    public void dfs(char[][] b,int i,int j){
        if(i<0||i>=b.length||j<0||j>=b[0].length){
            return;
        }

        if(b[i][j]!='O'){
            return;
        }

        b[i][j]='S';
        dfs(b,i+1,j);
        dfs(b,i-1,j);
        dfs(b,i,j+1);
        dfs(b,i,j-1);
    }
}
