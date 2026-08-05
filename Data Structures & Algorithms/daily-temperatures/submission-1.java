class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] res=new int[temperatures.length];
        Stack<Integer> s=new Stack<>();
        Arrays.fill(res,0);
        
        for(int i=0;i<temperatures.length;i++){
            
            while(!s.isEmpty() && temperatures[i]>temperatures[s.peek()]){
                int prev=s.pop();
                res[prev]=i-prev;
            }
            s.push(i);
        }

        return res;

    }
}
