class Solution {
    public String kthLargestNumber(String[] nums, int k) {
          PriorityQueue<String> maxHeap = new PriorityQueue<>((a, b) -> {
            if (b.length() != a.length()) return b.length() - a.length();
            return b.compareTo(a);
        });
        for (String s : nums) {
            maxHeap.add(s);
        }
        while (k > 1) {
            maxHeap.poll();
            k--;
        }
        return maxHeap.poll();
    }
}