class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> s = new HashMap<>();
        int[] arr = new int[2];

        for(int i = 0; i < nums.length; i++){
            int diff = target - nums[i];

            if(s.containsKey(diff)){
                return new int[]{s.get(diff), i};
            }else{
                s.put(nums[i], i);
            }
        }
        
        return new int[]{0,0};

    }
}
