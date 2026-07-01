class Solution {
    class TrieNode{
        TrieNode[] children=new TrieNode[26];
        boolean isEndOfWord=false;
    }

    class Trie{
        TrieNode root;
        Trie(){
            root=new TrieNode();
        }

        void insert(String s){
            TrieNode curr=root;
            for(char ch:s.toCharArray()){
            int idx=ch-'a';
            if(curr.children[idx]==null){
                curr.children[idx]=new TrieNode();
            }
            curr=curr.children[idx];

            }
            curr.isEndOfWord=true;
        }
        
    }
    public List<String> findWords(char[][] board,String[] words) {
        Trie t=new Trie();
        List<String> l=new ArrayList<>();
        for(int i=0;i<words.length;i++){
            t.insert(words[i]);
        }
        
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                dfs(l,board,i,j,t.root,"");
            }
        }

        return l;                                                                                                                                                                                                                                                                                                                                                                                                                                                        

    }

    public void dfs(List<String> l,char[][] board,int i,int j,TrieNode root,String newWord){
        if(i<0||i>=board.length||j<0||j>=board[0].length){
            return;
        }

        if(board[i][j]=='#'){
            return;
        }

        char c=board[i][j];
        String currWord=newWord+c;
        


        int idx=c-'a';
        TrieNode nextNode = root.children[idx];
        if(root.children[idx]==null){
            return;
        }

        if(nextNode.isEndOfWord){
            l.add(currWord);
            nextNode.isEndOfWord = false;  
        }

        board[i][j]='#';
        dfs(l,board,i+1,j,root.children[idx],currWord);
        dfs(l,board,i-1,j,root.children[idx],currWord);
        dfs(l,board,i,j+1,root.children[idx],currWord);
        dfs(l,board,i,j-1,root.children[idx],currWord);

        board[i][j]=c;

    }
}
