class Solution {
    public int rob(int[] nums) {
       int n=nums.length;
       if(n==1)
       return nums[0];
       int res1,res2,temp;
       int max1=nums[0];
       int max2=0;
       for(int i=1;i<n-1;i++)
       {
        temp=max1;
        max1=Math.max(max1,max2+nums[i]);
        max2=temp;   
       }
       res1=Math.max(max1,max2);
       max1= nums[1];
       max2=0;
        for(int i=2;i<n;i++)
        {
         temp=max1;
         max1=Math.max(max1,nums[i]+max2);
         max2=temp;   
        }
        res2=Math.max(max1,max2);
        return Math.max(res1,res2);
    }
}

        
