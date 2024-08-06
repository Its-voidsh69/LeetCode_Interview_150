class Solution {
    public int removeElement(int[] nums, int val) {
        int n = nums.length;
        int resIndex = 0;
        int count = 0;

        for(int i = 0; i<n; i++){
            if(nums[i]!=val){
                count++;
            }
        }

        int k = count;
        int i = 0;
        for(i = 0; i<n; i++){
            if(nums[i] != val && count != 0){
                nums[resIndex++] = nums[i];
                count--;
            }
        }

        return k;
    }
}

// Time and Space Complexity
 
// Time --> O(n)
// Space--> O(1)