class Solution {
    List<List<Integer>> a1=new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
         List<Integer> list=new ArrayList<>();
         subset(nums,0,list);
         return a1;
    }
    public void subset(int nums[],int i,List<Integer> list)
    {
        if(i==nums.length){
        a1.add(new ArrayList<>(list));
        return ;
        }
       list.add(nums[i]);
        subset(nums,i+1,list);
        list.remove(list.size()-1);
         
        subset(nums,i+1,list);
    }
}
