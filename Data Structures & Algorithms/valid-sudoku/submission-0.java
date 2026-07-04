class Solution {
    public boolean isValidSudoku(char[][] board) {
        HashSet<String> hs=new HashSet<>();

        for(int r=0;r<9;r++){
            for(int c=0;c<9;c++){
                char val=board[r][c];

                if(val=='.'){
                    continue;
                }
                if(!hs.add(val+"row"+r) || !hs.add(val+"col"+c) || !hs.add(val+"box"+r/3+c/3)){
                    return false;
                }
            }
        }
        return true;
    }
}
