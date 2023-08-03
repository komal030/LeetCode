class Solution {
    public int hIndex(int[] arr) {
        int n=arr.length;
       int i=n-1;
       while(i>=0)
       {
           if(arr[i]<n-i)
           break;
           i--;
       }
       return n-1-i;
}
}
