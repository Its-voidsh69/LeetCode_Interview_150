class Solution {
    public int removeDuplicates(int[] nums) {
       int index = 0;
       int n = nums.length;
       int res[] = new int[n];
       int i = 0;
       for(i=0; i<n-1; i++){
        if(nums[i] != nums[i+1]){
            res[index++] = nums[i];
           }
        }

        res[index++] = nums[i];

        for(i = 0; i<index; i++){
            nums[i] = res[i];
        }
        return index;
    }
}

// Time and Space Complexity

// Time --> O(n)
// Space --> O(n)