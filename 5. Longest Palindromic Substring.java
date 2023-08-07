class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        String p="";
        for(int i=0;i<n;i++)
        {
            int l=i,r=i;
            String temp="";
            while(l>=0 && r<n)
            {
                if(s.charAt(l)==s.charAt(r))
                {
                    temp=s.substring(l,r+1);
                    l--;
                    r++;
                }
                else break;
            }
            if(temp.length()>p.length())
            p=temp;
        }

for(int i=0;i<n;i++)
        {
            int l=i;
            int r=i+1;
            String temp="";
            while(l>=0 && r<n)
            {
                if(s.charAt(l)==s.charAt(r))
                {
                    temp=s.substring(l,r+1);
                    l--;
                    r++;
                }
                else break;
            }
            if(temp.length()>p.length())
            p=temp;
        }

        return p;
    }
}
