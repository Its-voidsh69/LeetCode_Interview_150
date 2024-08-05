class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] res = new int[m + n];
        int resIndex = 0;
        int i = 0;
        int j = 0;

        // Merge both arrays into res
        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) {
                res[resIndex++] = nums1[i++];
            } else {
                res[resIndex++] = nums2[j++];
            }
        }

        // Copy any remaining elements from nums1
        while (i < m) {
            res[resIndex++] = nums1[i++];
        }

        // Copy any remaining elements from nums2
        while (j < n) {
            res[resIndex++] = nums2[j++];
        }

        // Copy merged elements back into nums1
        for (int x = 0; x < res.length; x++) {
            nums1[x] = res[x];
        }
    }
}
