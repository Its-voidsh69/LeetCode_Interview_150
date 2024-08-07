class Solution {
    public int removeDuplicates(int[] nums) {
       int index = 0;
       int n = nums.length;
       int i = 0;
       for(i=0; i<n-1; i++){
        if(nums[i] != nums[i+1]){
            nums[index++] = nums[i];
           }
        }

        nums[index++] = nums[i];

        return index;
    }
}

// Time and Space Complexity

// Time --> O(n)
// Space --> O(1)