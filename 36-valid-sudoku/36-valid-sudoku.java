class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> hs = new HashSet<>();
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                char cur = board[i][j];
                if(cur != '.') {
                    if(!hs.add(cur + "found in row" +i) ||
                       !hs.add(cur + "found in column" +j) ||
                       !hs.add(cur + "found in grid" +i/3 +"-"+j/3)
                      )
                        return false;
                }
            }
        }
        return true;
    }
}