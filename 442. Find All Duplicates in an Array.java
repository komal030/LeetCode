class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
            int a=Math.abs(nums[i]);
            if(nums[a-1]<0)
            list.add(a);
            else
            nums[a-1]=-nums[a-1];
        }
        return list;
    }
}
