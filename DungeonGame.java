public class DungeonGame{
	public int calculateMinimumHP(int[][] dungeon){
		int M = dungeon.length;
		if(M == 0) return 0;
		int N = dungeon[0].length;
		int[][] dp = new int[M][N];
		if(dungeon[M-1][N-1] >= 0){
			dp[M-1][N-1] = 1;
		}
		else{
			dp[M-1][N-1] = 1 - dungeon[M-1][N-1];
		}
		for(int i = M-2; i >= 0; --i){
			dp[i][N-1] = Math.max(dp[i+1][N-1] - dungeon[i][N-1], 1);
		}
		for(int j = N-2; j >= 0; --j){
			dp[M-1][j] = Math.max(dp[M-1][j+1] - dungeon[M-1][j], 1);
		}
		for(int i = M-2; i >= 0; --i){
			for(int j = N-2; j >= 0; --j){
				int val_on_exit = Math.min(dp[i][j+1], dp[i+1][j]);
				dp[i][j] = Math.max(val_on_exit - dungeon[i][j], 1);
			}
		}
		return dp[0][0];
	}
}