//keep track of the sequence length and store that in the boundary points of the sequence

import java.util.HashMap;

public class LongestConsecutiveSequence{
	public int longestConsecutive(int[] nums){
		int res = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;++i){
			if(map.containsKey(nums[i])) continue;
			int left=0, right=0;
			if(map.containsKey(nums[i]-1)){
				left = map.get(nums[i]-1);
			}
			if(map.containsKey(nums[i]+1)){
				right = map.get(nums[i]+1);
			}
			int sum = left+right+1;
			res = Math.max(res, sum);
			map.put(nums[i], sum);
			map.put(nums[i]-left, sum);
			map.put(nums[i]+right, sum);
		}
		return res;
	}
}