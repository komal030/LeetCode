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
    public boolean isUnivalTree(TreeNode root) {
        if(root==null)
        return false;
        int x=root.val;
        return check(root,x);
    }

    public boolean check(TreeNode node,int x)
    {
        if(node==null)
        return true;
        if(node.val!=x)
        return false;
        return node.val==x && check(node.left,x) && check(node.right,x);
    }
}
