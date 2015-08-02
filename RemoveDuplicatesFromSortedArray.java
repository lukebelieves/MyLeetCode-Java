public class RemoveDuplicatesFromSortedArray{
	public int removeDuplicates(int[] nums){
		if(nums.length==0) return 0;
		int cur = 1;
		int last = nums[0];
		for(int i=1;i<nums.length;++i){
			if(nums[i]==last) continue;
			nums[cur++] = nums[i];
			last = nums[i];
		}
		return cur;
	}
}