class Solution {
    public TreeNode sortedArrayToBST(int[] nums) {
        int n=nums.length;
      return makeTree(nums,0,n-1);
    }
    public TreeNode makeTree(int nums[],int l,int r)
    {
       if(l>r)
       return null;
       int mid=(l+r)/2;
       TreeNode t=new TreeNode(nums[mid]);
       t.left=makeTree(nums,l,mid-1);
       t.right=makeTree(nums,mid+1,r);
      return t;
    }
}
