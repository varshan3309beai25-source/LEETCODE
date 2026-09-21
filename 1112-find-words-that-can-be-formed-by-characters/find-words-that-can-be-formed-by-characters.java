class Solution {
    public int countCharacters(String[] words, String chars) {


        int[] charcount = new int[26];

        for(char x:chars.toCharArray()){
            charcount[x-'a']++;
        }

        int result = 0;

        for(String x:words){

            int[] wordcount = new int[26]; 

            for(char ch:x.toCharArray()){
                wordcount[ch-'a']++;
            }


            boolean ok = true;
            for(int i=0;i<26;i++){
                if(wordcount[i]>charcount[i]){
                    ok = false;
                    break;
                }
            }

            if(ok==true){
                result+=x.length();
            }
        }

        return result;

    }
}