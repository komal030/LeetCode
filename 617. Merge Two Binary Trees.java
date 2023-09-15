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
  int t1, t2;
  
  public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
    return makeTree(root1, root2);

  }
  public TreeNode makeTree(TreeNode root1, TreeNode root2) {
    if (root1 == null && root2 == null)
      return null;

    int t1 = (root1 == null) ? 0 : root1.val;
    int t2 = (root2 == null) ? 0 : root2.val;

    TreeNode t = new TreeNode(t1 + t2);
    if (root1 == null)
      t.left = makeTree(root1, root2.left);
    else if (root2 == null)
      t.left = makeTree(root1.left, root2);
    else
      t.left = makeTree(root1.left, root2.left);
      
    if (root1 == null)
      t.right = makeTree(root1, root2.right);
    else if (root2 == null)
      t.right = makeTree(root1.right, root2);
    else
      t.right = makeTree(root1.right, root2.right);
    return t;
  }
}
