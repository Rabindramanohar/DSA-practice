class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int low = 0, high = (matrix.length * matrix[0].length) -1;
        while(low <= high) {
            int mid = low + (high-low)/2;
            
            int cur = matrix[mid/(matrix[0].length)][mid%(matrix[0].length)];
            if(cur == target)
                return true;
            else if(cur > target) {
                high = mid-1;
            } else
                low = mid+1;
        }
        return false;
    }
}