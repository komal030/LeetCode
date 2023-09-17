class Solution {
    public int rob(TreeNode root) {
        int pair[]=count(root);
        return Math.max(pair[0],pair[1]);
        
    }
    public int[] count(TreeNode node)
    {
        if(node==null)
        {
            int arr[]={0,0};
        return arr;
        }
        int left[]=count(node.left);
        int right[]=count(node.right);
        int with= node.val +left[1]+right[1];
        int without=Math.max(left[0],left[1])+Math.max(right[0],right[1]);
        int p[]={with,without};
        return p;
    }

}
