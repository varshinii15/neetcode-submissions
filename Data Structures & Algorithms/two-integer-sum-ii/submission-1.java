class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int i=0;
        int j=numbers.length-1;
        List<Integer> l =new ArrayList<>();

        while(i<=j){
            if(numbers[i]==numbers[i+1]){
                i++;
            }
            if(numbers[j]==numbers[j-1]){
                j--;
            }
            int sum=numbers[i]+numbers[j];
            if(sum==target){
                l.add(i+1);
                l.add(j+1);
                break;
            }else if(sum>target){
                j--;
            }else{
                i++;
            }
            
        }

        int n=l.size();
        int[] res=new int[n];

        for(int k=0;k<n;k++){
            res[k]=l.get(k);
        }
        return res;

    }
}
