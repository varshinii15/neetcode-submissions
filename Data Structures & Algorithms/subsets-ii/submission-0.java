class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> l=new ArrayList<>();
        HashSet<List<Integer>> s=new HashSet<>();
        backtrack(s,new ArrayList<>(),nums,0);

        for(List<Integer> li:s){
            l.add(li);
        }
        return l;
    }

    public void backtrack(HashSet<List<Integer>> s,List<Integer> a,int[] nums,int start){
        s.add(new ArrayList<>(a));

        for(int i=start;i<nums.length;i++){
            a.add(nums[i]);
            backtrack(s,a,nums,i+1);
            a.remove(a.size()-1);
        }
    }
}
