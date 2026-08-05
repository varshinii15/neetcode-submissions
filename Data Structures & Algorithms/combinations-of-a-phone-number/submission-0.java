class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> l=new ArrayList<>();

        if(digits.length()==0){
            return l;
        }
        HashMap<Character, List<String>> h = new HashMap<>();
        h.put('2', List.of("a","b","c"));
        h.put('3', List.of("d","e","f"));
        h.put('4', List.of("g","h","i"));
        h.put('5', List.of("j","k","l"));
        h.put('6', List.of("m","n","o"));
        h.put('7', List.of("p","q","r","s"));
        h.put('8', List.of("t","u","v"));
        h.put('9', List.of("w","x","y","z"));

        backtrack(l,h,digits,0,new StringBuilder());

        return l;
    }

    public void backtrack(List<String> l,HashMap<Character, List<String>> h,String digits,int len,StringBuilder sb){

        if(sb.length()==digits.length()){
            l.add(sb.toString());
            return;
        }

        for(String s:h.get(digits.charAt(len))){
            sb.append(s);
            backtrack(l,h,digits,len+1,sb);
            sb.setLength(sb.length()-1);
        }


        
        


    }
}
