import java.util.Arrays;

public class MaximumGap{
	public int maximumGap(int[] nums){
		int N = nums.length;
		if(N<2) return 0;
		Arrays.sort(nums);
		int res = 0;
		for(int i=1;i<N;++i){
			res = Math.max(res, nums[i]-nums[i-1]);
		}
		return res;
	}
}