class Solution {
    public int maxProfit(int[] prices) {
        int bp = Integer.MAX_VALUE;
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            if (bp < prices[i]) {
                int p = prices[i] - bp;
                max = Math.max(p, max);
            } else {
                bp = prices[i];
            }
        }
        return max;
    }
}