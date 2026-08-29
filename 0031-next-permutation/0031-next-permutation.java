class Solution {
    public void nextPermutation(int[] nums) {

        int pivot = -1;

        for(int i = nums.length - 2; i >= 0; i--){
            if(nums[i] < nums[i + 1]){
                pivot = i;
                break;
            }
        }

        if(pivot == -1){
            int l = 0;
            int r = nums.length - 1;

            while(l < r){
                int temp = nums[l];
                nums[l] = nums[r];
                nums[r] = temp;
                l++;
                r--;
            }
            return;
        }

        int replacer = -1;

        for(int i = nums.length - 1; i > pivot; i--){
            if(nums[i] > nums[pivot]){
                replacer = i;
                break;
            }
        }

        int temp = nums[pivot];
        nums[pivot] = nums[replacer];
        nums[replacer] = temp;

        int l = pivot + 1;
        int r = nums.length - 1;

        while(l < r){
            temp = nums[l];
            nums[l] = nums[r];
            nums[r] = temp;
            l++;
            r--;
        }
    }
}