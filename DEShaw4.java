//query
public class Main {
    public static void main(String[] args) {
        int arr[][]={{1,4}};
        int k=2;
        circle c=new circle(arr,k);
        c.cals();
    }
}


public class circle {

    int arr[][];
    int k;
    circle(int brr[][],int a)
    {
    arr=brr;
    k=a;
    }

    public void cals()
    {
        int m= arr.length;
        int n=arr[0].length;
        int max=0;
        for(int i=0;i<m;i++)
        {
            max=Math.max(max,arr[i][1]);
        }
        int dp[]=new int[max+1];
        dp[0]=0;
        for(int i=1;i<k;i++)
            dp[i]=1;
        dp[k]=2;
        for(int i=k+1;i<max+1;i++)
        {
            dp[i]=dp[i-1]+dp[i-k];
        }
        for(int k=0;k<m;k++)
        {
            int s=0;
                for(int j=arr[k][0];j<=arr[k][1];j++)
                {
                    s+=dp[j];
                }
            System.out.println(s);
        }
    }
}

