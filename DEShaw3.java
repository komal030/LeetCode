//sumofnumbers
public class Main {
    public static void main(String[] args) {
     
        int arr[]={1,3,7,2,4,5};
        int k=7;
        circle c=new circle(arr,k);
        c.cals();
    
    }
}

public class circle {

    int arr[];
    int n;
    int k;

    public circle(int[] brr, int a) {
        arr = brr;
        n = arr.length;
        k = a;
    }

    public void cals() {
        int min = Integer.MAX_VALUE;
        int count = 0, sum = 0;
        int l = 0, r = 0;
        while (l < n) {
            sum = sum + arr[r];
            while (sum > k) {
                sum =sum -arr[l];
                l++;
                count--;
            }
            r = (r + 1) % n;
            count++;
            if (sum == k) {
                min = Math.min(min, count);
                count = 0;
                sum=0;
                l++;
            }
       System.out.println(sum+" "+count);
        }
        if(min==Integer.MAX_VALUE)
            System.out.println(-1);
        else
        System.out.println(min);
    }
}


