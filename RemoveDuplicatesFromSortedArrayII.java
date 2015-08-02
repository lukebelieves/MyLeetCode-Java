public class RemoveDuplicatesFromSortedArrayII{
	public int removeDuplicates(int[] nums){
		if(nums.length==0) return 0;
		int cur = 1;
		int last = nums[0];
		boolean second = true;
		for(int i=1;i<nums.length;++i){
			if(nums[i]==last && second==false) continue;
			if(nums[i] != last){
				nums[cur++] = nums[i];
				last = nums[i];
				second = true;
			}
			else{
				nums[cur++] = nums[i];
				last = nums[i];
				second = false;
			}
		}
		return cur;
	}
}