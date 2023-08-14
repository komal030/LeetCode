class Solution {
    public int lengthOfLIS(int[] arr) {
        int n = arr.length;
        int dp[] = new int[n];
        Arrays.fill(dp, 1);
        for (int i = n - 2; i >= 0; i--) {
            for (int j = i + 1; j < n; j++)
                if (arr[i] < arr[j])
                    dp[i] = Math.max(dp[i], dp[j] + 1);
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            max = Math.max(max, dp[i]);
        }
        return max;
    }
}
