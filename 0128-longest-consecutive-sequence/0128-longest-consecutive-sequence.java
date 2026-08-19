import java.util.HashSet;

class Solution {
    public int longestConsecutive(int[] nums) {

        // Edge case
        if (nums.length == 0) {
            return 0;
        }

        HashSet<Integer> set = new HashSet<>();

        // Step 1: Store all numbers in HashSet
        for (int num : nums) {
            set.add(num);
        }

        int longest = 0;

       
        for (int num : set) {

          
            if (!set.contains(num - 1)) {

                int currentNum = num;
                int currentLength = 1;

               
                while (set.contains(currentNum + 1)) {
                    currentNum++;
                    currentLength++;
                }

              
                longest = Math.max(longest, currentLength);
            }
        }

        return longest;
    }
}