class Solution {
    public boolean isBalanced(TreeNode root) {        
        if(add(root)==-1)
        return false;
        else
        return true;
    }

    public int add(TreeNode root)
    {
        if(root==null)
        return 0;
        int left=add(root.left);
        int right=add(root.right);
        if(Math.abs(left-right)>1)
        return -1;
        return 1+Math.max(add(root.left),add(root.right));
    }
}
