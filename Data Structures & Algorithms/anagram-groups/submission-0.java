class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap <String, ArrayList<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++){
            String word = strs[i];

            char[] chrs = word.toCharArray();
            Arrays.sort(chrs);
            String key = new String(chrs);

            if(map.containsKey(key)){
                map.get(key).add(word);
            }else{
                ArrayList<String> list = new ArrayList<>();
                list.add(word);
                map.put(key, list);
            }
        }
        return new ArrayList<>(map.values());
    }
}
