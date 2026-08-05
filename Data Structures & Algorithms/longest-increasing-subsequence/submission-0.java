class Solution {
    public int lengthOfLIS(int[] nums) {
        int n=nums.length;
        int[] dp=new int[n];

        dp[0]=1;
        int maxSoFar=1;

        for(int i=1;i<n;i++){
            dp[i]=1;
            int j=0;
            while(j<i){
                if(nums[i]>nums[j]){
                    dp[i]=Math.max(dp[j]+1,dp[i]);
                    maxSoFar=Math.max(maxSoFar,dp[i]);
                }
                j++;
            }
        }

        return maxSoFar;

    }
}
