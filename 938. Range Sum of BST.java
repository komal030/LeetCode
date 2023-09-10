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
   public int rangeSumBST(TreeNode root, int low, int high) {
      return addl(root, low, high);
         
   }
   public int addl(TreeNode root, int low, int high) {
      if (root == null)
         return 0;
      if (root.val >= low && root.val <= high)
         return root.val + addl(root.left, low, high) + addl(root.right, low, high);
      else
         return addl(root.left, low, high) + addl(root.right, low, high);
   }
}
