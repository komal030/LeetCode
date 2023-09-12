class SumDig{
    public static void main(String[] args) {
        SumDig S=new SumDig();
        System.out.println("Hello, World!");
        S.cal(1,12,1,8);
    }
    
    public void cal(int n1,int n2,int min,int max)
    {
        int count=0;
        for(int i=n1;i<=n2;i++)
        {
            int d=add(i);
            if(d>=min&& d<=max)
            count++;
        }
        System.out.println(count);
    }
    public int add(int n)
    {
        int count=0;
        while(n>0)
        {
            count+=n%10;
            n/=10;
        }
        return count;
    }
}
