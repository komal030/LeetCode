class Solution {
    public int numTrees(int n) {
        int dp[]=new int[n+1];
        dp[0]=1;
        dp[1]=1;
        for(int nodes=2;nodes<=n;nodes++)
        {
            int ans=0;
            for(int root=1;root<=nodes;root++)
            {
                int left=root-1;
                int right=nodes-root;
                ans+=dp[left]*dp[right];
            }
            dp[nodes]=ans;
        }
        return dp[n];
    }
}
