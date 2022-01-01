class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int lastEle = m + n - 1;
        while(m > 0 && n > 0) {
            if(nums1[m-1] > nums2[n-1]) {
                nums1[lastEle] = nums1[m-1];
                m--;
            } else {
                nums1[lastEle] = nums2[n-1];
                n--;
            }
            lastEle--;
        }
        // if we don't get through all elements of nums2;
        while(n > 0) {
            nums1[lastEle] = nums2[n-1];
            n--;
            lastEle--;
        }
    }
}