class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        if(nums == null || nums.length == 0) return ans;
        
        Arrays.sort(nums);
        int  n = nums.length;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                int l=j+1, r=n-1;
                int k = target - (nums[i]+nums[j]);
                while(l<r) {
                    int twoSum = (nums[l]+nums[r]);
                    if(twoSum < k) l++;
                    else if(twoSum > k) r--;
                    else {
                        List<Integer> list = new ArrayList<>();
                        list.add(nums[i]);
                        list.add(nums[j]);
                        list.add(nums[l]);
                        list.add(nums[r]);
                        
                        ans.add(list);
                        
                        while(l<r && nums[l] == list.get(2))
                            l++;
                        while(l<r && nums[r] == list.get(3))
                            r--;
                    }
                }
                while(j+1 < n && nums[j+1] == nums[j])
                        j++;
            }
            while(i+1 < n && nums[i+1] == nums[i])
                    i++;
        }
        return ans;
    }
}