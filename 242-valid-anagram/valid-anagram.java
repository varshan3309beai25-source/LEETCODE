class Solution {
    public boolean isAnagram(String s, String t) {

        if(s.length()!=t.length()){
            return false;
        }

        Map<Character,Integer> mp = new HashMap<>();
        
        for(char x:s.toCharArray()){

            mp.put(x,mp.getOrDefault(x,0)+1);

        }

        for(char ch:t.toCharArray()){

            if(!mp.containsKey(ch)){
                return false;
            }

            mp.put(ch,mp.getOrDefault(ch,0)-1);

            if(mp.get(ch)<0){
                return false;
            }
        }

        return true;
    }
}