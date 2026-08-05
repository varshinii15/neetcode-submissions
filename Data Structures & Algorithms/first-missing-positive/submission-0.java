class Solution {
    public int firstMissingPositive(int[] nums) {
        
        HashSet<Integer> s=new HashSet<>();
        
        for(int i:nums){
            s.add(i);
        }

        int i=1;
        while(true){
            if(!s.contains(i)){
                return i;
            }
            i++;
        }
    }
}