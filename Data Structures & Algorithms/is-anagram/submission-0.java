class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> map = new HashMap<>();
        if(s.length() != t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            char ch = s.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch, 1);
            }
        }
        for(int i=0; i<t.length(); i++){
            char ar = t.charAt(i);
            if(!map.containsKey(ar)){
                return false;
            }
            if(map.get(ar) == 0){
                return false;
            }
            map.put(ar, map.get(ar)-1);
        }
        return true;
    }
}
