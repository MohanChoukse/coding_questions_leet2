class Solution {
    public int countOdds(int low, int high) {
        int n = 0;

        n = high - low;
        if (low % 2 != 0 || high % 2 != 0) {
            return n / 2 + 1;
        } else {
            return n / 2;
        }

    }
}