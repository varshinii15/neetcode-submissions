class Solution {
    public int maxProduct(int[] nums) {
        int n=nums.length;
        int[] dp1=new int[n];
        int[] dp2=new int[n];
        dp1[0]=nums[0];
        dp2[0]=nums[0];
        int maxSoFar=nums[0];

        if(n==1){
            return nums[0];
        }
        
        for(int i=1;i<n;i++){
            dp1[i]=Math.max(nums[i],Math.max(dp1[i-1]*nums[i],nums[i]*dp2[i-1]));
            dp2[i]=Math.min(nums[i],Math.min(dp1[i-1]*nums[i],nums[i]*dp2[i-1]));
            int curr=Math.max(dp1[i],dp2[i]);
            maxSoFar=Math.max(maxSoFar,curr);
        }

        return maxSoFar;
    }
}
