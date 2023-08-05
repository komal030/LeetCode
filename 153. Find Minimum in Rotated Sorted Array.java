class Solution {
    public int findMin(int[] nums) {
       
        int n=nums.length;
         int l=0,r=n-1;
        if(n==1)
        return nums[0];
        if(n==2)
        return Math.min(nums[0],nums[1]);
        int min=nums[0];
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[l]<min)
            return nums[l];
            if(nums[l]<=nums[mid] )
            {
                l= mid+1;
            }
            else
            {
                r=mid-1;
            }
            min=Math.min(min,nums[mid]);

        }
             return min;
        
    }
}
