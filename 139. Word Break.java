class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        int n=s.length();
        int dp[]=new int[n+1];
        dp[n]=1;
      for (int i = n - 1; i >= 0; i--) {
            for (String word : wordDict) {
                if (i + word.length() <= n && 
                   s.substring(i, i + word.length()).equals(word)) {
                     dp[i] = dp[i] + dp[i + word.length()];
                }
            }
        }
         return dp[0] == 1;
    }
}
