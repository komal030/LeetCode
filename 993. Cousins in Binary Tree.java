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

    int height1,height2;
    TreeNode parent1,parent2;
    void dfs(TreeNode root,TreeNode par, int x,int y,int depth)
    {
        if(root==null)
        return;
        if(root.val==x)
        {
            height1=depth;
            parent1=par;
        }
          if(root.val==y)
        {
            height2=depth;
            parent2=par;
        }
        dfs(root.left,root,x,y,depth+1);
        dfs(root.right,root,x,y,depth+1);

    }

    public boolean isCousins(TreeNode root, int x, int y) {
     dfs(root,null,x,y,0);
     if(parent1!=parent2 &&height1==height2) 
     return true;
     else
     return false;  
    }
}
