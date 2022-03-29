class Solution {
    public int findDuplicate(int[] nums) {
        Set<Integer> vis = new HashSet<>();
        for(int ele : nums)
            if(!vis.add(ele))
                return ele;
        
        return -1;
    }
}