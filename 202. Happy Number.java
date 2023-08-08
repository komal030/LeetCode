class Solution {
    public boolean isHappy(int n) {
        int sum=0;

for(int i=0;i<50;i++)
{
    sum=0;
        while(n>0)
        {
            int d=n%10;
            sum+=Math.pow(d,2);
            n/=10;
        }
        if(sum==1)
        return true;
        else 
        n=sum;
    }
    return false;
}
}
