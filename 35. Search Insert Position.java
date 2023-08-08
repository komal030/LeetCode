class Solution {
    public int searchInsert(int[] nums, int target) {
     int n=nums.length;
     int l=0,r=n-1,mid,p=0;
     if(target>nums[n-1])
     return n;
     if(target<nums[0])
     return 0;
     while(l<=r)
     {
         mid=(l+r)/2;
         if(nums[mid]==target)
         return mid;
         else if(nums[mid]<target)
         {
             l=mid+1;
             p=l;
             
         }
         else
         {
            r=mid-1;
         }
     }
    return p;
    }
}
