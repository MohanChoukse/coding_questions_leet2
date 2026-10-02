class Solution {
    public boolean containsDuplicate(int[] nums) {
        
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // .add() returns false if the element already exists in the set
            if (!seen.add(num)) {
               return true;
            }
        }
        
        return false;
    }
}