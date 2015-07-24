public class MinimumPathSum{
	public int minPathSum(int[][] grid){
		int M = grid.length;
		int N = grid[0].length;
		if(M==0 || N==0) return 0;
		int[][] dp = new int[M][N];
		dp[0][0] = grid[0][0];
		for(int i=1;i<M;++i){
			dp[i][0] = dp[i-1][0]+grid[i][0];
		}
		for(int j=1;j<N;++j){
			dp[0][j] = dp[0][j-1]+grid[0][j];
		}
		for(int i=1;i<M;++i){
			for(int j=1;j<N;++j){
				dp[i][j] = Math.min(dp[i-1][j], dp[i][j-1])+grid[i][j];
			}
		}
		return dp[M-1][N-1];
	}
}