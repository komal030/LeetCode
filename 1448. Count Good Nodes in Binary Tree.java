
class Solution {
    public int goodNodes(TreeNode root) {
        return countgood(root,root.val);        
    }
    public int countgood(TreeNode node,int max)
    {
        if(node==null)
        return 0;
        max=Math.max(max,node.val);
        if(node.val>=max)
        return 1+countgood(node.left,max)+countgood(node.right,max);
        else
        return countgood(node.left,max)+countgood(node.right,max);

    }
}
