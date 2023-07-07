class Solution {
    public int lengthOfLastWord(String s) {
     int count=0;
     int n=s.length()-1;
     while(s.charAt(n)==' ')
     {
         n--;
     }
     while(n>0) 
     {
        count++;
        n--;
        if(s.charAt(n)==' ')
        break;
     }  
     return count;
    }
}
