class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tot=0;
        int cur=0;
        int start=0;

        for(int i=0;i<gas.length;i++){
            int diff=gas[i]-cost[i];
            tot+=diff;
            cur+=diff;

            if(cur<0){
                start=i+1;
                cur=0;
            }
        }

        if(tot>=0){
            return start;
        }

        return -1;
    }
}
