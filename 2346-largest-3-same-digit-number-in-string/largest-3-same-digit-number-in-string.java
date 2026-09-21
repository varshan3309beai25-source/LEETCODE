class Solution {
    public String largestGoodInteger(String num) {
        

        int n = num.length();

        char maxchar= ' ';

        for(int i=2;i<n;i++){

            if(num.charAt(i)==num.charAt(i-1) && num.charAt(i)==num.charAt(i-2)){

                maxchar = (char) Math.max(maxchar,num.charAt(i));
            }
        }

        if(maxchar == ' '){
            return "";
        }

        return new String(new char[]{maxchar,maxchar,maxchar});
    }
}