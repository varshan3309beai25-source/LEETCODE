class Solution {
    public boolean validPalindrome(String s) {
        

        int s1 = 0;
        int e = s.length()-1;

        while(s1<e){

            if(s.charAt(s1)!=s.charAt(e)){
                return isPalindrome(s,s1+1,e) || isPalindrome(s,s1,e-1);
            }
            s1++;
            e--;
        }

        return true;


       
    }

     private boolean isPalindrome(String s, int s1, int e){

            while(s1<e){

                if(s.charAt(s1)!=s.charAt(e)){
                    return false;
                }
                s1++;
                e--;
            }

            return true;
        }
}