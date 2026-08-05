class Solution {
    public List<List<Integer>> combinationSum(int[] nums, int target) {
        
        List<List<Integer>> l=new ArrayList<>();

        boolean[] v=new boolean[nums.length];

        backtrack(l,new ArrayList<>(),nums,target,0,v);

        return l;
}

    public void backtrack(List<List<Integer>> l,List<Integer> a,int[] nums,int target,int start,boolean[] v){

        if(target==0){
            l.add(new ArrayList<>(a));
            return;
        }

        for(int i=start;i<nums.length;i++){

            if(nums[i]>target){
                continue;
            }

            
            
            a.add(nums[i]);
            backtrack(l,a,nums,target-nums[i],i,v);

            a.remove(a.size()-1);


        }
    }










}
