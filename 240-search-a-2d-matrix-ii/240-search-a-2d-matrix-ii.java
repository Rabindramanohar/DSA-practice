class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) return false;
        
        int r = 0, c = matrix[0].length-1;
        while(r < matrix.length && c >= 0) {
            if(matrix[r][c] == target)
                return true;
            else if(matrix[r][c] > target)
                c--;
            else
                r++;
        }
        return false;
    }
}