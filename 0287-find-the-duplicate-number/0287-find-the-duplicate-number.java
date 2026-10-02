class Solution {
    public int findDuplicate(int[] nums) {
        
        HashSet<Integer> seen = new HashSet<>();
        int x =0;
        for (int num : nums) {
            // .add() returns false if the element already exists in the set
            if (!seen.add(num)) {
               x = num;
            }
        }
        
        return x;
    }
}