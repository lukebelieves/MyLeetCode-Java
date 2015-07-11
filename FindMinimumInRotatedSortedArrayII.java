public class FindMinimumInRotatedSortedArrayII{
	public int findMin(int[] nums){
		int length = nums.length;
		if(length == 0) return 0;
		int left = 0;
		int right = length - 1;
		while(left < right && nums[left] >= nums[right]){
			int middle = (left+right)/2;
			if(nums[middle] > nums[right]){
				left = middle + 1;
			}
			else if(nums[middle] < nums[right]){
				right = middle;
			}
			else{
				left++;
			}
		}
		return nums[left];
	}
}