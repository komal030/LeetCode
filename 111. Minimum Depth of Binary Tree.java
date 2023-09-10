/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int minDepth(TreeNode root) {
        if(root==null)
            return 0;
        return depth(root,1);

    }

    public int depth(TreeNode node,int dep)
    {
        if(node==null)
        return Integer.MAX_VALUE;
        if(node.left==null&&node.right==null)
        return dep;
        return Math.min(depth(node.left,dep+1),depth(node.right,dep+1));
    

    }
}
