class Solution {
    public int titleToNumber(String s) {
        int n=s.length();
        int sum=0;
        for(int i=0;i<n;i++)
        {
       int d=s.charAt(i)-64;
       int p=d*(int)Math.pow(26,n-i-1);
       sum+=p;      
      
        }
        return sum;
    }
}
