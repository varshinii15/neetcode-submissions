class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<Integer>[] rows=new HashSet[9];
        HashSet<Integer>[] cols=new HashSet[9];
        HashSet<Integer>[] boxes=new HashSet[9];

        for(int i=0;i<9;i++){
            rows[i]=new HashSet<>();
            cols[i]=new HashSet<>();
            boxes[i]=new HashSet<>();
        }

        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){

                if(board[i][j]!='.'){
                int num=board[i][j];
                int boxidx=(i/3)*3+(j/3);

                if(rows[i].contains(num)||cols[j].contains(num)||boxes[boxidx].contains(num)){
                    return false;
                }
                rows[i].add(num);
                cols[j].add(num);
                boxes[boxidx].add(num);
            }}
        }
        return true;

    }
}
