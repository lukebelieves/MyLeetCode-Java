public class NextPermutation{
	public void nextPermutation(int[] nums){
		int N = nums.length;
		int i = N-1;
		while(i>0 && nums[i-1]>=nums[i]) --i;
		if(i==0){
			for(int l=0, r=N-1; l<r; ++l,--r){
				int temp = nums[l];
				nums[l] = nums[r];
				nums[r] = temp;
			}
			return;
		}
		for(int j=N-1; j>=i; --j){	//j>=i !!
			if(nums[j]>nums[i-1]){
				int temp = nums[j];
				nums[j] = nums[i-1];
				nums[i-1] = temp;
				for(int l=i, r=N-1; l<r; ++l,--r){
					int temp2 = nums[l];
					nums[l] = nums[r];
					nums[r] = temp2;
				}
				return;
			}
		}
	}
}