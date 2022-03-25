class Solution {
    public int twoCitySchedCost(int[][] costs) {
        int min = 0;
        Arrays.sort(costs, (p1, p2) -> (p1[0]-p2[0])-(p1[1]-p2[1]));
        for(int i=0; i<costs.length/2; i++) {
            min += costs[i][0];
            min += costs[costs.length/2 + i][1];
        }
        return min;
    }
}