public class JumpGame{
	public boolean canJump(int[] nums){
		int N = nums.length;
		if(N==0) return false;
		boolean[] dp = new boolean[N];
		dp[0] = true;
		for(int i = 1; i<N; ++i){
			for(int j = i-1; j>=0; --j){
				if(dp[j]==false){
					dp[i] = false;
					break;
				}
				else{
					if(j+nums[j] >= i){
						dp[i] = true;
						break;
					}
				}
			}
		}
		return dp[N-1];
	}
}