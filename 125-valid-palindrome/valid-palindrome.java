class Solution {
    public boolean isPalindrome(String s) {

        s = s.toLowerCase();

        String clean = "";

        for(char x:s.toCharArray()){
            if(Character.isLetterOrDigit(x)){
                clean+=x;
            }
        }

        String rev = "";

        for(int i=clean.length()-1;i>=0;i--){
            rev+=clean.charAt(i);
        }

        return rev.equals(clean);
    }
}