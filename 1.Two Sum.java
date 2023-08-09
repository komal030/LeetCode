class Solution {
    public int[] twoSum(int[] arr, int target) {
        int brr[]=new int[2];
         HashMap<Integer,Integer> map= new HashMap<>();
        for(int i=0;i<arr.length;i++)
        {
            int comp=target-arr[i];
            if(map.containsKey(comp))
            {
                brr[0]=i;
                brr[1]=map.get(comp);
                break;
            }
            else
            map.put(arr[i],i);
        }
        return brr;
    }
}
