class Solution {
    public int numRescueBoats(int[] people, int limit) {
        int cnt=0;
        int i=0, j=people.length-1;
        Arrays.sort(people);
        while(i<=j) {
            cnt++;
            if(people[i]+people[j] <= limit)
                i++;
            j--;
        }
        return cnt;
    }
}