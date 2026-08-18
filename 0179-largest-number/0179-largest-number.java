class Solution {
    public String largestNumber(int[] nums) {

        // convert int to String
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        // Custom sorting
        Arrays.sort(arr, (a, b) -> {
            String ab = a + b;
            String ba = b + a;

            return ba.compareTo(ab);
        });

        // base case : if 0 is grater number
        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder ans = new StringBuilder();

        for (String s : arr) {
            ans.append(s);
        }

        return ans.toString();
    }
}