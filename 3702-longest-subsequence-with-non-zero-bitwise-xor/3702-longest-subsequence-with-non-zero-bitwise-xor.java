class Solution {
    public int longestSubsequence(int[] nums) {

        int n = nums.length;
        int xor = 0;
        boolean hasNonZero = false;

        for (int num : nums) {
            xor ^= num;

            if (num != 0) {
                hasNonZero = true;
            }
        }
        if (xor != 0) {
            return n;
        }
        if (!hasNonZero) {
            return 0;
        }
        return n - 1;
    }
}