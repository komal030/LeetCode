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
   public TreeNode sortedArrayToBST(int[] nums) {
      int n = nums.length;
      int mid = n / 2;
      TreeNode node = new TreeNode(nums[mid]);
      make(node, nums, 0, mid - 1);
      make(node, nums, mid + 1, n-1);
      return node;
   }

   public void make(TreeNode node, int arr[], int l, int r) {
      if (l > r || node == null)
         return;
      int mid = (l + r + 1) / 2;
      TreeNode temp = new TreeNode(arr[mid]);
      if (arr[mid] > node.val)
         node.right = temp;
      else
         node.left = temp;
      make(temp, arr, l, mid - 1);
      make(temp, arr, mid + 1, r);

   }
}
