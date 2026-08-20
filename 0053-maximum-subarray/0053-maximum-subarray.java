class Solution {
    public int maxSubArray(int[] nums) {
        int max = Integer.MIN_VALUE;
        int currSum = 0;
        for (int n : nums) {

            if (currSum < 0) {
                currSum = 0;
            }
            currSum += n;
            max = Math.max(max, currSum);
        }

        return max;

    }
}