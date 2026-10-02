class Solution {
    public List<Integer> findDuplicates(int[] nums) {
    //    List<Integer> list1 = new ArrayList<>();
    //     int n = nums.length;
    //     int [] count = new int [ n +1];
    //      for(int i =0; i<n ; i++){
    //         int x = nums[i];
    //          count[x]++; 
    //      }

    //      for(int i=0; i<count.length; i++){
    //         if(count[i] > 1){
    //            list1.add(i);
    //         }
    //      }
    //      return  list1;



     List<Integer> duplicates = new ArrayList<>();
        HashSet<Integer> seen = new HashSet<>();
        
        for (int num : nums) {
            // .add() returns false if the element already exists in the set
            if (!seen.add(num)) {
                duplicates.add(num);
            }
        }
        
        return duplicates;


    }
}