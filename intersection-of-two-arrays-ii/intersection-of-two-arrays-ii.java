class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int countArr[] = new int[1001];
        List<Integer> ls = new ArrayList<>();
        for(int i : nums1)
            countArr[i]++;
    
        for(int i : nums2) {
            if(countArr[i] != 0) {
                countArr[i]--;
                ls.add(i);
            }
        }
        
        int newArr[] = new int[ls.size()];
        int i = 0;
        for(int ele : ls)
            newArr[i++] = ele;
            
        return newArr;
    }
}