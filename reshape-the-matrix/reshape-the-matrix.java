class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        
        if((mat.length * mat[0].length) != r * c)
            return mat;
        // convert 2d arr to 1d arr
        int p = 0;
        int flatArr[] = new int[mat.length * mat[0].length];
        for(int i=0; i<mat.length; i++) {
            for(int j=0; j<mat[i].length; j++) {
                flatArr[p++] = mat[i][j];
            }
        }
        
        // inserting flatArr to newMat arr
        int[][] ansMat = new int[r][c];
        int k = 0;
        for(int i=0; i<ansMat.length; i++) {
            for(int j=0; j<ansMat[i].length; j++) {
                ansMat[i][j] = flatArr[k++];
            }
        }
        // int n = ansMat.length * ansMat[0].length;
        // for(int i=0; i<n; i++) {
        //     ansMat[i/n][i%n] = flatArr[i];
        // }
        
        return ansMat;
    }
}