class Solution {
    public boolean isRobotBounded(String instructions) {
        int x=0, y=0, i=0;
        int[][] dir = {{0,1}, {1, 0}, {0, -1}, {-1, 0}};
        for(int j=0; j<instructions.length(); j++) {
            if(instructions.charAt(j) == 'R')
                i = (i+1)%4;
            else if(instructions.charAt(j) == 'L')
                i = (i+3)%4;
            else {
                x += dir[i][0];
                y += dir[i][1];
            }
        }
        if(x==0 && y==0 || i>0)
            return true;
        
        return false;
    }
}