class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> q=new PriorityQueue<>(Collections.reverseOrder());

        for(int i:nums){
            q.offer(i);
        }

        for(int i=1;i<k;i++){
            q.poll();
        }

        return q.poll();
    }
}
