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
    public TreeNode increasingBST(TreeNode root) {
          TreeNode dummyNode = new TreeNode(-1); 
        TreeNode currentNode = dummyNode; 
        cal(root, currentNode);
        
        return dummyNode.right;
    }
    
    public TreeNode cal(TreeNode root, TreeNode node) {
        if(root == null)
            return node;

        node = cal(root.left, node);
        
        root.left = null; // Break the link to the left subtree
        node.right = root; // Set the right child of the current node to the root
        node = root; // Update the current node
        
        return cal(root.right, node);
    }
}
