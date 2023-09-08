class Solution {
    public int[] searchRange(int[] nums, int target) {
        int n=nums.length;
        int l=0,r=n-1;
        int arr[]=new int[2];
        Arrays.fill(arr,-1);
        while(l<=r)
        {
            int mid=(l+r)/2;
            if(nums[mid]==target)
            {
                int left=mid;
                int right=mid;
                while(left>0 && nums[left-1]==target)
                left--;
                while(right<n-1 && nums[right+1]==target)
                right++;
                arr[0]=left;
                arr[1]=right;
                break;
            }
            else if(nums[mid]>target)
            {
                r=mid-1;
            }
            else
            l=mid+1;
        }
        return arr;
    }
}
