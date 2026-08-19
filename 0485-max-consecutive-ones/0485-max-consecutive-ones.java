class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            count++;
            if (nums[i] == 0) {
                count = 0;
            }

            max = Math.max(max, count);
        }
        return max;
    }
}