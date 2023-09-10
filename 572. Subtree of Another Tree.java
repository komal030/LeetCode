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
   public boolean isSubtree(TreeNode root, TreeNode subRoot) {
      if(root==null)
      return false;
      if(check(root, subRoot))
      return true;
      return isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot);
   }

   public boolean check(TreeNode root, TreeNode root1) {
      if (root == null && root1 == null)
         return true;
      if (root == null||root1==null)
         return false;
      if (root.val != root1.val) {
         return false;
      }
      return check(root.left, root1.left) && check(root.right, root1.right);
   }
}
