class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {

        List<int[]> newList=new ArrayList<>();

        int n=intervals.length;
        
        int i=0;

        while(i<n && intervals[i][1]<newInterval[0]){
            newList.add(intervals[i]);
            i++;
        }

        while(i<n && intervals[i][0]<=newInterval[1]){
            newInterval[0]=Math.min(intervals[i][0],newInterval[0]);
            newInterval[1]=Math.max(intervals[i][1],newInterval[1]);
            i++;
        
        }

        newList.add(newInterval);

        while(i<n){
            newList.add(intervals[i]);
            i++;
        }

        int[][] res=new int[newList.size()][2];

        for(int j=0;j<newList.size();j++){
            res[j]=newList.get(j);
        }

        return res;




        

        




    }
}
