class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        if(image[sr][sc] == newColor)
            return image;
        
        dfs(image, sr, sc, image[sr][sc], newColor);
        return image;
    }
    public void dfs(int[][] image, int i, int j, int source, int newColor) {
        if(i<0 || i>=image.length || j<0 || j>=image[i].length || image[i][j] != source)
            return;
        
        image[i][j] = newColor;
        dfs(image, i-1, j, source, newColor);
        dfs(image, i+1, j, source, newColor);
        dfs(image, i, j-1, source, newColor);
        dfs(image, i, j+1, source, newColor);
    }
}