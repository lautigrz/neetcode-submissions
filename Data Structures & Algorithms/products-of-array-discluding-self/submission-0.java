class Solution {
    public int[] productExceptSelf(int[] nums) {
     
    	int[] res = new int[nums.length];
    	
    	int c = 1;

    	for(int i = 0; i < nums.length; i++) {
    		res[i] = c;
    		
    		c *= nums[i];
    	}
    	
    	c = 1;
    	for(int i = nums.length - 1; i >= 0; i--) {
    		res[i] *= c;
    		c*=nums[i];
    	}
    	
  
    	return res;
    }
}  
