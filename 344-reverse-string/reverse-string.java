class Solution {
    public void reverseString(char[] s) {
        int st = 0;
        int e = s.length-1;
        while(e>st){
            char t = s[st];
            s[st] = s[e];
            s[e] = t;
            st++;
            e--;
        }
        
    }
}