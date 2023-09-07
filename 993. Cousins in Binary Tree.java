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

     private int xDepth, yDepth;
    private TreeNode xParent, yParent;
    private void dfs(TreeNode node, TreeNode parent, int x, int y, int depth) {
        if (node == null || (xParent != null && yParent != null)) return;

        if (node.val == x) {
            xDepth = depth;
            xParent = parent;
        } else if (node.val == y) {
            yDepth = depth;
            yParent = parent;
        }

        dfs(node.left, node, x, y, depth + 1);
        dfs(node.right, node, x, y, depth + 1);
    }
    public boolean isCousins(TreeNode node, int x, int y) {
      dfs(node, null, x, y, 0);
        return xDepth == yDepth && xParent != yParent;
    }
}
