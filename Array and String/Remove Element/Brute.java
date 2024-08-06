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

        int res[] = new int[count];

        for(int i = 0; i<n; i++){
            if(nums[i]!=val){
                res[resIndex++] = nums[i];
            }
        }

        for(int i = 0; i<count; i++){
            nums[i] = res[i];
        }

        return count;
    }
}


// Time and Space Complexity 

// Time--> O(n)
// Space--> O(count)