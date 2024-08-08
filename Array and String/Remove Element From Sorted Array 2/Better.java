import java.util.HashMap;

class Solution {
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < n; i++) {
            while (map.get(nums[i]) > 2) {
                map.put(nums[i], map.get(nums[i]) - 1);
            }
        }

        int[] res = new int[n];
        int index = 0;

        for (int num : nums) {
            int count = map.get(num);
            while(count>0){
            res[index] = num;
            count--; index++;
            map.put(num, count - 1);
           }
        }

        System.arraycopy(res, 0, nums, 0, index);

        return index;
    }
}


// Time and Space Complexity 

// Time --> O(n)
// Space --> O(n)