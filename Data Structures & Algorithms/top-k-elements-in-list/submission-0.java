class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap <Integer, Integer> map = new HashMap<>();

        for(int i=0; i<nums.length; i++){
            int a = nums[i];
            if(map.containsKey(a)){
                map.put(a, map.get(a)+1);
            }else{
                map.put(a,1);
            }
        }

        ArrayList<Map.Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
        Collections.sort(list, (a,b) -> b.getValue() - a.getValue());

        int[]res = new int[k];
        for(int i=0; i<k; i++){
            res[i] = list.get(i).getKey();
        }
        return res;

    }
}
