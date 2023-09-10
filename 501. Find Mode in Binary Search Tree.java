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
   int max = 1;
   public int[] findMode(TreeNode root) {

      HashMap < Integer, Integer > map = new HashMap < > ();
      ArrayList < Integer > array = new ArrayList < > ();

      mode(root, map);

      for (int key: map.keySet()) {
         if (map.get(key) == max)
            array.add(key);
      }
      int arr[] = new int[array.size()];
      for (int i = 0; i < array.size(); i++)
         arr[i] = array.get(i);
      return arr;
   }

   public void mode(TreeNode root, HashMap < Integer, Integer > map) {
      if (root == null)
         return;
      int x = root.val;
      if (!map.containsKey(x))
         map.put(x, 1);
      else {
         int f = map.get(x);
         map.put(x, f + 1);

         max = Math.max(max, f + 1);
      }
      mode(root.left, map);
      mode(root.right, map);
   }
}
