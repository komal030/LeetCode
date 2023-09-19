class Solution {
    int sum=0;
    public int sumOfLeftLeaves(TreeNode root) {
        cal(root);
        return sum;
    }
    public boolean isLeaf(TreeNode node)
    {
        if(node.left==null && node.right==null)
        return true;
        else 
        return false;
    }
    public void cal(TreeNode node)
    {
        if(node==null)
        return ;
        if(node.left!= null && isLeaf(node.left))
        sum+=node.left.val;
        cal(node.left);
        cal(node.right);
    }
}
