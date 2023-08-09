class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
List<List<Integer>> list=new ArrayList<>();
     Arrays.sort(arr);   
    int n=arr.length;
   
    for(int i=0;i<n-2;i++)
    {
        int l=i+1,r=n-1;
        while(l<r)
        {
            int sum=arr[i]+arr[l]+arr[r];
            if(sum==0)
            {
            list.add(Arrays.asList(arr[i],arr[l],arr[r]));
            while(l<r && arr[l]==arr[l+1])
            l++;
            while(l<r && arr[r]==arr[r-1])
            r--;
            }
            if(sum>0)
            r--;
            else
            l++;
        }
        while(i<n-1 && arr[i]==arr[i+1])
        i++;
    }
return list;
    }
}
