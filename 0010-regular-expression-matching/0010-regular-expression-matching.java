class Solution {

    //CP
    public boolean isMatch(String s, String p) {
        int n = s.length();
        int m = p.length();
        boolean[][] dp = new boolean[n+1][m+1];

        dp[n][m] = true;

        for(int i=n;i>=0;i--){
            for(int j=m-1;j>=0;j--){
                boolean ans = false;

                if(j+1 < m && p.charAt(j+1) == '*'){
                    boolean matched = i<n && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.');
                    ans = dp[i][j+2] || (matched && dp[i+1][j]);
                }
                else if(i<n && (s.charAt(i) == p.charAt(j) || p.charAt(j) == '.')){
                    ans = dp[i+1][j+1];
                }

                dp[i][j] = ans;
            }
        }
        return dp[0][0];
    }
}