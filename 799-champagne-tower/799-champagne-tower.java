class Solution {
    public double champagneTower(int poured, int row, int col) {
        if(poured == 0) return 0;
        double[][] arr = new double[102][102];
        arr[0][0] = (double)poured;
        for(int i=0; i<=row; i++) {
            for(int j=0; j<=i; j++) {
                double q = (arr[i][j]-1.0)/2.0;
                if(q > 0) {
                    arr[i+1][j] += q;
                    arr[i+1][j+1] += q;
                }
            }
        }
        return Math.min(1, arr[row][col]);
    }
}