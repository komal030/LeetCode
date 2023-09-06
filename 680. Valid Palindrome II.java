class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int i=0,j=n-1;
        int f=0;
        while(i<j)
        {
            if(s.charAt(i)==s.charAt(j))
            {
                i++;
                j--;
            }           
            else
            return isPal(s,i+1,j)||isPal(s,i,j-1);
        }
        return true;
    }

    public boolean isPal(String s,int left,int right)
    {
      while(left<right)
      {
          if(s.charAt(left)!=s.charAt(right))
          return false;
          left++;
          right--;
      }
      return true;
    }
}
