class Solution {
    public List<Integer> findDuplicates(int[] nums) {
       List<Integer> list1 = new ArrayList<>();
        int n = nums.length;
        int [] count = new int [ n +1];
         for(int i =0; i<n ; i++){
            int x = nums[i];
             count[x]++; 
         }

         for(int i=0; i<count.length; i++){
            if(count[i] > 1){
               list1.add(i);
            }
         }
         return  list1;
    }
}