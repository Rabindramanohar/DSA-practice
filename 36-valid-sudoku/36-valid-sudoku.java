class Solution {
    public boolean isValidSudoku(char[][] board) {
        
        for(int i=0; i<board.length; i++) 
            if(!isRowValid(board[i]))
                return false;
        
        for(int j=0; j<board[0].length; j++)
            if(!isColumnValid(board, j))
                return false;
        
        for(int i=0; i<board.length; i += 3)
            for(int j=0; j<board[0].length; j += 3) 
                if(!isGridValid(board, i, j))
                    return false;
        
        return true;
    }
    
    public boolean isRowValid(char[] rows) {
        Set<Character> hs = new HashSet<Character>();
        for(int i=0; i<rows.length; i++) {
            char cur = rows[i];
            if(cur != '.' && !hs.add(cur))
                return false;
        }
        return true;
    }
    
    public boolean isColumnValid(char[][] board, int col) {
        Set<Character> hs = new HashSet<>();
        for(int i=0; i<board[0].length; i++) {
            char cur = board[i][col];
            if(cur != '.' && !hs.add(cur))
                return false;
        }
        return true;
    }
    
    public boolean isGridValid(char[][] board, int row, int col) {
        Set<Character> hs = new HashSet<>();
        for(int i=row; i<row+3; i++) {
            for(int j=col; j<col+3; j++) {
                char cur = board[i][j];
                if(cur != '.' && !hs.add(cur))
                    return false;
            }
        }
        return true;
    }
            
}