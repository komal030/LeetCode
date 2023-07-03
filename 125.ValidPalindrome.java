class Solution {
    public boolean isPalindrome(String s) {
        String p = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch >= 'a' && ch <= 'z' || ch >= '0' && ch <= '9')
                p = p + ch;
        }
        for (int i = 0; i < p.length() / 2; i++) {
            if (p.charAt(i) != p.charAt(l - 1 - i))
                return false;
        }
        return true;
    }
}

