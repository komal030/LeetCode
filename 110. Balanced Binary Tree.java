 class Solution {
    public boolean isBalanced(TreeNode root) {
        if(root == null) 
        return true;
        return ((Math.abs(checkH(root.left)-checkH(root.right)))<=1) && isBalanced(root.left) && isBalanced(root.right);
    }
    public int checkH(TreeNode root)
    {
        if(root==null)
        return 0;
        return 1+Math.max(checkH(root.left),checkH(root.right));
    }
 }
