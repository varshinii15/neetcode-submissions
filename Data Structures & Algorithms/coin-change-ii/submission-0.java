class Solution {
    public int change(int amount, int[] coins) {
        int[][] dp=new int[amount+1][coins.length+1];

        for(int i=0;i<=amount;i++){
            dp[i][0]=0;
        }
        for(int j=0;j<=coins.length;j++){
            dp[0][j]=1;
        }

        for(int i=1;i<=amount;i++){

            for(int j=1;j<=coins.length;j++){

                if(i>=coins[j-1]){
                    dp[i][j]=dp[i-coins[j-1]][j]+dp[i][j-1];
                }else{
                    dp[i][j]=dp[i][j-1];
                }
            }
        }

        return dp[amount][coins.length];

    }
}
