class Solution {

    
    public int minEatingSpeed(int[] piles, int h) {
        int low=1;
        int high=max(piles);
        int ans=high;

        while(low<=high){
            int mid=low+(high-low)/2;
            int hr=0;

            for(int p:piles){
                hr+=(p+mid-1)/mid;
            }

            if(hr<=h){
                ans=mid;
                high=mid-1;
            }else{
                low=mid+1;
            }
        }

        return ans;
    }

    public int max(int[] p){
        int maxi=Integer.MIN_VALUE;
        for(int i:p){
            maxi=Math.max(maxi,i);
        }
        return maxi;
    }
}
