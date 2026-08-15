class Solution {
    public int longestSubsequence(int[] nums) {
        int total = 0;
        int len = nums.length;

        boolean check = false;

        for (int i : nums) {
            check |= i > 0;
            total ^= i;

        }
        if (total != 0)
            return len;

        if (check)
            return len - 1;

        return 0;
    }
}