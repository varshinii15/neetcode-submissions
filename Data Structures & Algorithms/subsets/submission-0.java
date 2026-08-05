class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> l=new ArrayList<>();
        backtrack(l,new ArrayList<>(),nums,0);
        return l;
    }

    public void backtrack(List<List<Integer>> l,List<Integer> a,int[] nums,int start){

        l.add(new ArrayList<>(a));

        for(int i=start;i<nums.length;i++){
            a.add(nums[i]);

            backtrack(l,a,nums,i+1);

            a.remove(a.size()-1);
        }
    }
}
