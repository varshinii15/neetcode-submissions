class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int c=0;
        List<List<Integer>> adj=new ArrayList<>();
        
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        int[] indeg=new int[numCourses];
        Arrays.fill(indeg,0);
        for(int[] p:prerequisites){
            adj.get(p[1]).add(p[0]);
            indeg[p[0]]++;
        }

        Queue<Integer> q=new LinkedList<>();

        for(int i=0;i<numCourses;i++){
            if(indeg[i]==0){
                q.offer(i);
            }
        }

        List<Integer> l=new ArrayList<>();

        while(!q.isEmpty()){

            int node=q.poll();
            l.add(node);
            c++;
            List<Integer> neigh=adj.get(node);

            for(int i=0;i<neigh.size();i++){
                indeg[neigh.get(i)]--;
                if(indeg[neigh.get(i)]==0){
                    q.add(neigh.get(i));
                }
            }
        }

        if(c!=numCourses){
            return new int[0];
        }

        int[] res=new int[l.size()];

        for(int i=0;i<l.size();i++){
            res[i]=l.get(i);
        }

        return res;
    }
}
