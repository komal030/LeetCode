class Solution {
    public boolean isValid(String s) {
        Stack<Character> arr = new Stack<Character>();
        int n = s.length();
        hap: for( int a=0;a<n;a++) {
            char ch = s.charAt(a);
            if (ch == '{' || ch == '[' || ch == '(') {
                arr.push(ch);
                continue ;
            }
            if (ch == '}' || ch == ']' || ch == ')') {
                if (arr.isEmpty()) {
                    return false;
                }
                char c = arr.pop();
                if ((c == '{' && ch != '}') || (c == '(' && ch != ')') ||( c == '[' && ch != ']'))
                    return false;
              
            }
        }
        if(!arr.isEmpty())
            return false;
        return true;
    }
}
