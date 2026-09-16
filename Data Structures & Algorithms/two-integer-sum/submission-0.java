class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> s = new HashMap<Integer, Integer>();
        int[] arr = new int[2];
        
        for(int i = 0; i < nums.length; i++){

            int sum = target - nums[i];

            if(s.containsKey(sum)){
                int val = sum + nums[i];

                if(val == target){
                    int ps = s.get(sum);
                    arr[0] = ps;
                    arr[1] = i;
                }
                
            }else{
                s.put(nums[i], i);
            }

        }

        return arr;

    }
}
