class Solution {
    public int removeCoveredIntervals(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> a[0]-b[0]);
        int[] curr = {-1, -1};
        int cnt = 0;
        for(int[] num : intervals) {
            if(num[0] > curr[0] && num[1] > curr[1]) {
                cnt++;
                curr[0] = num[0];
                // curr[1] = num[1];
            }
            curr[1] = Math.max(curr[1], num[1]);
        }
        return cnt;
    }
}