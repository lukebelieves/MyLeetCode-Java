import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	public int[] twoSum(int[] nums, int target) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i=0;i<nums.length;++i){
			map.put(nums[i], i+1);
		}
		for(int i=0;i<nums.length;++i){
			if(map.get(target-nums[i])!=null && map.get(target-nums[i])!=i+1){
				int[] res = new int[2];
				res[0] = i+1;
				res[1] = map.get(target-nums[i]);
				return res;
			}
		}
		return null;
	}
	
	public static void main(String[] args){
		int[] nums = {3,2,4};
		int target = 6;
		TwoSum twosum = new TwoSum();
		int[] res = twosum.twoSum(nums, target);
		System.out.printf("%d,%d",res[0],res[1]);
	}
}