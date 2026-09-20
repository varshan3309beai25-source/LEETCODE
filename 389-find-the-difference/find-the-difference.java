class Solution {
    public char findTheDifference(String s, String t) {
        int xor = 0;
        for(char x:s.toCharArray()){
            xor^=x;
        }
        for(char x:t.toCharArray()){
            xor^=x;
        }
        return (char)xor;
    }
}