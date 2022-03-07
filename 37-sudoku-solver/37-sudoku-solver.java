class Solution {
    public void solveSudoku(char[][] board) {
        if(board == null || board.length == 0)
            return;
        helper(board);
    }
    
    private boolean helper(char[][] board) {
        // checking for the empty cell
        for(int i=0; i<board.length; i++) {
            for(int j=0; j<board[0].length; j++) {
                if(board[i][j] == '.') {
                    // initialize empty cell with 1-9 and check is valid or not
                    for(char c='1'; c<='9'; c++) {
                        if(isValid(board, i, j, c)) {
                            board[i][j] = c;
                            if(helper(board)) // recursively checking for true condition    
                                return true;
                            board[i][j] = '.';
                        }
                    }
                    return false;
                }
            }
        }
        return true;
    }
    
    private boolean isValid(char[][] board, int row, int col, char c) {
        for(int i=0; i<9; i++) {
            if(board[i][col] == c) return false;
            if(board[row][i] == c) return false;
            if(board[3*(row/3)+i/3][3*(col/3)+i%3] == c) return false;
        }
        return true;                        
    }
}