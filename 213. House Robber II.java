class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        int arr[]=nums.clone();
        if(n==1)
        return nums[0];
        if(n==2)
        return Math.max(nums[0],nums[1]);
      nums[1]=Math.max(nums[0],nums[1]);
        for(int i=2;i<n-1;i++)
            {
                nums[i]=Math.max(nums[i]+nums[i-2],nums[i-1]);
            }

         arr[2]=Math.max(arr[1],arr[2]);
   for(int i=3;i<n;i++)
            {
                arr[i]=Math.max(arr[i]+arr[i-2],arr[i-1]);
            }
        return Math.max(nums[n-2],arr[n-1]);

    }
}
