class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        List<Integer> ls = new ArrayList<>();
        int len1 = nums1.length;
        int len2 = nums2.length;
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        if(len1 <= len2) {
            for(int i=0; i<len1; i++) {
                for(int j=0; j<nums2.length; j++) {
                    if(nums1[i] == nums2[j]) {
                        ls.add(nums1[i]);
                        nums2[j] = -1;
                        break;
                    }
                }
            }
        } else {
            for(int i=0; i<len2; i++) {
                for(int j=0; j<nums1.length; j++) {
                    if(nums2[i] == nums1[j]) {
                        ls.add(nums2[i]);
                        nums1[j] = -1;
                        break;
                    }
                }
            }
        }
        
        int newArr[] = new int[ls.size()];
        int i = 0;
        for(int ele : ls) {
            newArr[i++] = ele;
        }
        
        return newArr;
    }
    
    public boolean isPresent(int val, int arr[]) {
        for(int i=0; i<arr.length; i++) {
            if(val == arr[i])
                return true;
        }
        return false;
    }
}