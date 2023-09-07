class Solution {
    public int firstUniqChar(String s) {
    HashMap<Character,Integer> map=new HashMap<>();
    int n=s.length();
    for(int i=0;i<n;i++)
    {
        char c=s.charAt(i);
        if(!map.containsKey(c))
        map.put(c,1);
        else
        map.put(c,map.get(c)+1);
    }
    for(int i=0;i<n;i++)
    {
        char c=s.charAt(i);
        if(map.get(c)==1)
        return i;
    }
    return -1;
    }
}
