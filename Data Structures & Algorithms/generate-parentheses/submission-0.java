class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> l=new ArrayList<>();
        backtrack(l,0,0,"",n);

        return l;
    }

    public void backtrack(List<String> l,int open,int close,String s,int n){

        if(s.length()==2*n){
            l.add(s);
            return;
        }

        if(open<n){
            backtrack(l,open+1,close,s+"(",n);
        }

        if(close<open){
            backtrack(l,open,close+1,s+")",n);
        }
    }


}
