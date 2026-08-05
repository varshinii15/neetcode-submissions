class Solution {
    public List<List<Integer>> permute(int[] nums) {
        
        List<List<Integer>> l=new ArrayList<>();
        boolean[] v=new boolean[nums.length];
        backtrack(l,nums,v,new ArrayList<>());

        return l;
    }

    public void backtrack(List<List<Integer>> l,int[] nums,boolean[] v,List<Integer> a){

        if(a.size()==nums.length){
            l.add(new ArrayList<>(a));
            return;
        }

        for(int i=0;i<nums.length;i++){

            if(v[i]){
                continue;
            }
            
            v[i]=true;
            a.add(nums[i]);

            backtrack(l,nums,v,a);

            v[i]=false;
            a.remove(a.size()-1);


        }
    }
}
