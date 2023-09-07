class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int suffix[]=new int[n];
        int ans[]=new int[n];
        suffix[0]=1;
        int prefix=1;
        for(int i=1;i<n;i++)
        {
            suffix[i]=suffix[i-1]*nums[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {
            ans[i]=suffix[i]*prefix;
            prefix=prefix*nums[i];
        }
        return ans;
    }
}
    
    
