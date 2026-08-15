class Solution {
    public int longestSubsequence(int[] nums) {
        int total = 0;
        int len = nums.length;

        boolean check = false;

        for (int i : nums) {
            check |= i > 0;
            total ^= i;

        }
        if (!check) {
            return 0;
        }
        return total == 0 ? len - 1 : len;
    }
}