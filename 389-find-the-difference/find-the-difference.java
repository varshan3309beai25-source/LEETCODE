class Solution {
    public char findTheDifference(String s, String t) {
        int sum = 0;
        for(char x:t.toCharArray()){
            sum+=x;
        }
        for(char x:s.toCharArray()){
            sum-=x;
        }
        return (char)sum;

    }
}