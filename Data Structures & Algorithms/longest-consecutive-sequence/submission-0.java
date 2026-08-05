class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> s=new HashSet<>();

        for(int i:nums){
            s.add(i);
        }

        int longest=0;

        for(int i:nums){

            int streak=0;
            int curr=i;
            while(s.contains(curr)){
                streak++;
                curr++;
            }
            longest=Math.max(streak,longest);
        }

        return longest;
    }
}
