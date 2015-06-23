public class DistinctSubsequences{
	public int numDistinct(String s, String t){
		int M = s.length();
		int N = t.length();
		int[][] memo = new int[M+1][N+1];
		for(int i = 0; i <= M; ++i){
			memo[i][0] = 1;
		}
		for(int i = 0; i < M; ++i){
			for(int j = 0; j < N; ++j){
				if(s.charAt(i) == t.charAt(j)){
					memo[i+1][j+1] = memo[i][j] + memo[i][j+1];
				}
				else{
					memo[i+1][j+1] = memo[i][j+1];
				}
			}
		}
		return memo[M][N];
	}
}