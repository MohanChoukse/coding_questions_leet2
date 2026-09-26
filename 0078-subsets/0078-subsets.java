class Solution {
    //CP
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        
        generate(nums, 0, new ArrayList<>(), result);
        
        return result;
    }

    void generate(int[] nums, int index,
                   List<Integer> current,
                   List<List<Integer>> result) {

        if (index == nums.length) {
            result.add(new ArrayList<>(current));
            return;
        }

        // Take
        current.add(nums[index]);
        generate(nums, index + 1, current, result);

        // Don't take
        current.remove(current.size() - 1);
        generate(nums, index + 1, current, result);
    }
}