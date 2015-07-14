public class JumpGameII{
	public int jump(int[] nums){
		int N = nums.length;
		if(N==0) return -1;
		int maxDistance = 0;
		int lastDistance = 0;
		int stepCount = 0;
		for(int i = 0; i < N && maxDistance >= i; ++i){
			if(lastDistance < i){
				++stepCount;
				lastDistance = maxDistance;
			}
			maxDistance = Math.max(maxDistance, i+nums[i]);
		}
		if(maxDistance >= N-1){
			return stepCount;
		}
		else{
			return -1;
		}
	}
}