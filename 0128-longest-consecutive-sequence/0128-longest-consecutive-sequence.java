import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        // // Edge case
        // if (nums.length == 0) {
        //     return 0;
        // }
        // HashSet<Integer> set = new HashSet<>();
        // // Step 1: Store all numbers in HashSet
        // for (int num : nums) {
        //     set.add(num);
        // }
        // int longest = 0;      
        // for (int num : set) {        
        //     if (!set.contains(num - 1)) {
        //         int currentNum = num;
        //         int currentLength = 1;               
        //         while (set.contains(currentNum + 1)) {
        //             currentNum++;
        //             currentLength++;
        //         }             
        //         longest = Math.max(longest, currentLength);
        //     }
        // }
        // return longest;

        if (nums.length == 0) {
            return 0;
        }
        Arrays.sort(nums);
        int count = 1;
        int max = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] == nums[i - 1]) {
                continue;
            }
            if (nums[i] == nums[i - 1] + 1) {
                count++;
            } else {
                count = 1;
            }
            max = Math.max(max, count);
        }
        return max;

    }
}