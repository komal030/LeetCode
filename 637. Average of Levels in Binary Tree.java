class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list=new ArrayList<>();
        Queue<TreeNode> queue=new ArrayDeque<>();
        queue.add(root);
        while(!queue.isEmpty())
        {
            int n=queue.size();
            double sum=0;
            for(int i=0;i<n;i++)
            {
                TreeNode temp=queue.poll();
                sum+=temp.val;
                if(temp.left!=null)
                queue.add(temp.left);
                if(temp.right!=null)
                queue.add(temp.right);
            }
            sum/=n;
            list.add(sum);
        }
        return list;
    }
}
