class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals,(a,b)->a[0]-b[0]);
        List<int[]> newList=new ArrayList<>();
        int[] curr=intervals[0];
        newList.add(curr);

        if(intervals.length==1){
            return intervals;
        }

        for(int i=1;i<intervals.length;i++){

            if(curr[1]>=intervals[i][0]){
                curr[1]=Math.max(curr[1],intervals[i][1]);
            }else{
                curr=intervals[i];
                newList.add(curr);
            }
            

        }

        int[][] res=new int[newList.size()][2];
        for(int i=0;i<newList.size();i++){
            res[i]=newList.get(i);
        }
        return res;
    }
}
