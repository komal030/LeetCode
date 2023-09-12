public class Main {
    public static void main(String[] args) {
        StringRev S=new StringRev("bbaaaba",5);
        S.trans();
    }
}

public class StringRev{
String s;
int n;
StringRev(String w,int a)
{
    s=w;
    n=a;
}

public void trans()
{
    String p="";
    while(n>0)
    {
        String x =rev(s.substring(0,n));
        p =x+s.substring(n);
        s=p;
        n--;
    }
    System.out.println(p);

}
public String rev(String a){
StringBuilder sb=new StringBuilder(a);
sb.reverse();
return  sb.toString();
}
}
