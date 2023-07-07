class Solution {
    public int lengthOfLastWord(String s) {
     int count=1;
     int n=s.length()-1;
     while(s.charAt(n)==' ')
     {
         n--;
     }
     while(n>0) 
     {
        
        n--;
        if(s.charAt(n)==' '|| n<0)
        break;
        count++;
     }  
     return count;
    }
}
