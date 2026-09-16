class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> map = new HashMap<>();
		
		for(int num : nums ) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}
		
		Queue<int[]> queue = new PriorityQueue<int[]>((a,b) -> a[0] - b[0]);
		
		for(Map.Entry<Integer, Integer> mp : map.entrySet()) {
			
			queue.offer(new int[] {mp.getValue(), mp.getKey()});
			
			if(queue.size() > k) {
				queue.poll();
			}
			
		}
		
		
		int[] freq = new int[k];
		
		for(int i = 0; i < k; i++) {
			freq[i] = queue.poll()[1];
		}	
		
		return freq;
    }
}
