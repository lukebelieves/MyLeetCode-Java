import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MajorityElement{
	public int majorityElement(int[] nums){
		int N = nums.length;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i =0;i<N;++i){
			if(map.containsKey(nums[i])){
				map.put(nums[i], map.get(nums[i])+1);
			}
			else{
				map.put(nums[i], 1);
			}
		}
		int res = 0;
		int maxCount = 0;
		Iterator it = map.entrySet().iterator();
		while(it.hasNext()){
			Map.Entry<Integer, Integer> entry = (Map.Entry)it.next();
			if(entry.getValue()>maxCount){
				res = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		return res;
	}
	
	public int majorityElement_2(int[] nums){
		Arrays.sort(nums);
		return nums[nums.length/2];
	}
}