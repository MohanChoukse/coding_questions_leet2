class Solution {
    public int[] rearrangeArray(int[] nums) {
        int j = 0, z = 0;
        int[] positive = new int[nums.length / 2];
        int[] negative = new int[nums.length / 2];

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                positive[j++] = nums[i];
            }else {
                negative[z++] = nums[i];
            }
        }

        int i = 0, x = 0;
        while (x < positive.length) {
            nums[i++] = positive[x];
            nums[i++] = negative[x];
            x++;
        }
        return nums;

    }
}