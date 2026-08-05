class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> h=new HashMap<>();
        int[] arr=new int[k];
        int j=0;

        for(int i:nums){
            if(h.containsKey(i)){
                h.put(i,h.get(i)+1);
            }else{
                h.put(i,1);
            }
        }

        PriorityQueue<Map.Entry<Integer,Integer>> max=new PriorityQueue<>((a,b)->b.getValue()-a.getValue());

        max.addAll(h.entrySet());

        for(int i=1;i<=k;i++){
            Map.Entry<Integer,Integer> s=max.poll();
            arr[j++]=s.getKey();
        }

        return arr;
    }
}
