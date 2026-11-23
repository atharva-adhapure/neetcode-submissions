class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int n = nums.length;
        Arrays.sort(nums);

        for(int i=0; i<n-2; i++){
            if(i>0 && nums[i] == nums[i-1]){
                continue;
            }
            int left = i+1;
            int right = n-1;
            int sum = -1 * nums[i];

            while(left < right){
                int pSum = nums[left] + nums[right];
                if(pSum > sum ){
                    right--;
                }else if(pSum < sum){
                    left++;
                }else
                {
                    List<Integer> triplet = Arrays.asList(nums[i], nums[left], nums[right]);
                    res.add(triplet);
                    left++;
                    right--;

                    while(left<right && nums[left] == nums[left-1]){
                        left++;
                    }
                    while(left < right && nums[right] == nums[right+1]){
                        right--;
                    }
                }
            }
        }
        return res;
    }
}
