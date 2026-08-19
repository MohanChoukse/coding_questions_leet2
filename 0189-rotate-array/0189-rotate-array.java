class Solution {
    public void rotate(int[] nums, int k) {
        //  int n = nums.length;
        // k = k % n;
        // int[] temp = new int[n];

        // for (int i = 0; i < n; i++) {
        //     temp[(i + k) % n] = nums[i];
        // }

        // System.arraycopy(temp, 0, nums, 0, n);

        int m = 0;
        int n = nums.length;
        k = k % n;
        int[] arr = new int[n];
        for (int i = n - k; i < n; i++) {
            arr[m++] = nums[i];

        }
        for (int i = 0; i < n - k; i++) {
            arr[m++] = nums[i];

        }
        for (int i = 0; i < n; i++) {
            nums[i] = arr[i];
        }
    }
}