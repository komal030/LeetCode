class Solution {
    public int minNumberOfFrogs(String s) {
        int n=s.length();
        int result=0;
        int ccount=0,rcount=0,ocount=0,acount=0,kcount=0;
        for(int i=0;i<n;i++)
        {
           char c=s.charAt(i);
           if(c=='c'){
           ccount++;
            result = Math.max(result, ccount-kcount);
           }
           else if(c=='r')
           rcount++;
           else if(c=='o')
           ocount++;
           else if(c=='a')
           acount++;
           else if(c=='k')
           kcount++;
           
           if(!(ccount>=rcount&&rcount>=ocount&&ocount>=acount&& acount>=kcount))
           return -1;
        }
        if(ccount==rcount && rcount==ocount && ocount==acount && acount==kcount)
        return result;
        else
        return -1;
    }
}
