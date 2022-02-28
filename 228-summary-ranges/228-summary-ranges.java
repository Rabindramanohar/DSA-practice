class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        if(nums.length == 0)
            return ans;
        for(int i=0; i<nums.length; i++) {
            int tmp = nums[i];
            while(i+1 < nums.length && (nums[i+1] - nums[i] == 1))
                i++;
            if(tmp != nums[i])
                ans.add(tmp+"->"+nums[i]);
            else if(tmp == nums[i])
                ans.add(tmp+"");
        }
        return ans;
    }
}