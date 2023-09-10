class Solution {
    public int maxSubArray(int[] nums) {
        int n=nums.length;
        int currsum=0,maxsum=nums[0];
        int l=0,r=0;
        while(r<n)
        {
           currsum+=nums[r];
           
           maxsum=Math.max(currsum,maxsum);
           if(currsum<0)
           {
               l=r+1;
               currsum=0;
           }
           r++;
        }
        return maxsum;
    }
}
