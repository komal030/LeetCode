class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int n=triangle.size();
        int dp[][]=new int[n][n];
       for(int k[]:dp)
       {
          Arrays.fill(k,-1);
       }
        return rowtrav(triangle,0,0,dp);
    }
    public int rowtrav(List<List<Integer>> triangle,int i,int count,int dp[][])
    {
        if(count==triangle.size())
        return 0;
        if(dp[count][i]!=-1)
        return dp[count][i];
        dp[count][i]=triangle.get(count).get(i)+ Math.min(rowtrav(triangle,i,count+1,dp),        rowtrav(triangle,i+1,count+1,dp));
        return dp[count][i];

    }
}
