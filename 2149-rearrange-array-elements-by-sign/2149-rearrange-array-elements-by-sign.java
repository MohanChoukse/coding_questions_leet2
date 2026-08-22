// class Solution {
//     public int[] rearrangeArray(int[] nums) {
//         int j = 0, z = 0;
//         int[] positive = new int[nums.length / 2];
//         int[] negative = new int[nums.length / 2];

//         for (int i = 0; i < nums.length; i++) {
//             if (nums[i] > 0) {
//                 positive[j++] = nums[i];
//             }else {
//                 negative[z++] = nums[i];
//             }
//         }

//         int i = 0, x = 0;
//         while (x < positive.length) {
//             nums[i++] = positive[x];
//             nums[i++] = negative[x];
//             x++;
//         }
//         return nums;

//     }
// }

class Solution {
    public int[] rearrangeArray(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        int pos = 0, neg = 1;
        for(int i=0;i<n;i++) {
            if(nums[i] >= 0) {
                ans[pos] = nums[i];
                pos += 2;
            }
            else {
                ans[neg] = nums[i];
                neg += 2;
            }
        }
        return ans;
    }
}