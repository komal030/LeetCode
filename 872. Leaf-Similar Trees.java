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
   public boolean leafSimilar(TreeNode root1, TreeNode root2) {
      Stack < Integer > arr1 = new Stack < > ();
      Stack < Integer > arr2 = new Stack < > ();
      trav(root1, arr1);
      trav(root2, arr2);
      while (!arr1.isEmpty() && !arr2.isEmpty()) {
         if (arr1.pop() != arr2.pop())
            return false;
      }
        return arr1.isEmpty() && arr2.isEmpty();
            
   }

   public void trav(TreeNode root, Stack < Integer > arr) {
      if (root == null)
         return;
      trav(root.left, arr);
      if (root.left == null && root.right == null)
         arr.push(root.val);
      trav(root.right, arr);
   }
}
